import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainAppController {
    String nama;
    String prioritas;
    LocalDate datedue;
    
    @FXML
    private TableView<Task> taskTable; // Tabel untuk menampilkan daftar tugas
    @FXML
    private TableColumn<Task, String> titleCol, priorityCol, statusCol; // Kolom untuk judul, prioritas, dan status tugas
    @FXML
    private TableColumn<Task, LocalDate> dueDateCol; // Kolom untuk tanggal jatuh tempo

    @FXML
    private Button adbtn;
    @FXML
    private Button delbtn;
    @FXML
    private DatePicker duedate;
    @FXML
    private Button mcbtn;
    @FXML
    private ComboBox<String> prio;
    @FXML
    private TextField title;

    private ObservableList<Task> taskList; // Daftar tugas yang dapat diamati

    @FXML
    public void initialize() {
        taskList = FXCollections.observableArrayList(TaskFileManager.loadTasks());

        // Konfigurasi kolom tabel untuk setiap atribut task
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        priorityCol.setCellValueFactory(new PropertyValueFactory<>("priority"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        dueDateCol.setCellValueFactory(new PropertyValueFactory<>("dueDate"));

        // Konfigurasi lebar kolom agar lebih rapi
        titleCol.setPrefWidth(200);
        priorityCol.setPrefWidth(100);
        statusCol.setPrefWidth(100);
        dueDateCol.setPrefWidth(150);

        taskTable.setItems(taskList);

        // Tambahkan options prioritas ke ComboBox
        prio.getItems().addAll("High", "Medium", "Low");
    }

    @FXML
    private void addTask() {
        try {
            nama = title.getText();
            prioritas = String.valueOf(prio.getItems());
            datedue = duedate.getValue();

            if (title.getText().isEmpty() || prio.getValue() == null || duedate.getValue() == null ) {
                throw new MissingFieldException("Isi semua tabel");
            }

            if (duedate.getValue().isBefore(LocalDate.now())) {
                throw new InvalidDateException("Tidak Bisa di hari yang sudah lalu");
            }

            Task task = new Task(nama, prioritas, datedue, "Incomplete");

            taskList.add(task);
            clearData();
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        } catch (MissingFieldException | InvalidDateException e) {
            showError(e.getMessage());
        }
    }

    private void clearData() {
        title.clear();
        prio.getSelectionModel().clearSelection();
        duedate.setValue(null);
    }

    @FXML
    private void deleteTask() {
        try {
            Task selected = taskTable.getSelectionModel().getSelectedItem();
            if (selected == null) {
                throw new TaskNotSelectedException("Tidak ada yg dipilih");
            }

            taskList.remove(selected);
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        } catch (TaskNotSelectedException e) {
            showError(e.getMessage());
        }
    }

    @FXML
    private void markTaskComplete() {
        try {
            Task selected = taskTable.getSelectionModel().getSelectedItem();
            if (selected == null) {
                throw new TaskNotSelectedException("Tidak ada yg dipilih");
            }

            selected.setStatus("Complete");
            taskTable.refresh();
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        } catch (TaskNotSelectedException e) {
            showError(e.getMessage());
        }
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.showAndWait();
    }

    // MissingFieldException class
    private static class MissingFieldException extends Exception {
        public MissingFieldException(String message) {
            super(message);
        }
    }

    // TaskNotSelectedException class
    private static class TaskNotSelectedException extends Exception {
        public TaskNotSelectedException(String message) {
            super(message);
        }
    }

    // InvalidDateException class
    private static class InvalidDateException extends Exception {
        public InvalidDateException(String message) {
            super(message);
        }
    }
}
