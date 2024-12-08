import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class LibraryController {

    @FXML
    private TextField album;

    @FXML
    private TextField artist;

    @FXML
    private TextField total;

    @FXML
    private TextField rented;

    @FXML
    private TableView<Album> tabel;

    @FXML
    private TableColumn<Album, String> albumColumn;

    @FXML
    private TableColumn<Album, String> artistColumn;

    @FXML
    private TableColumn<Album, Integer> availableColumn;

    @FXML
    private TableColumn<Album, Integer> rentedColumn;

    @FXML
    private Button tambah;

    @FXML
    private Button pinjam;

    @FXML
    private Button update;

    @FXML
    private Button hapus;

    private ObservableList<Album> albumList;

    @FXML
    public void initialize() {
        albumColumn.setCellValueFactory(new PropertyValueFactory<>("albumName"));
        artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
        availableColumn.setCellValueFactory(new PropertyValueFactory<>("available"));
        rentedColumn.setCellValueFactory(new PropertyValueFactory<>("rented"));

        albumList = FXCollections.observableArrayList();
        tabel.setItems(albumList);
    }

    @FXML
    private void handleTambah(ActionEvent event) {
        try {
            String albumName = album.getText();
            String artistName = artist.getText();
            int totalAlbums = Integer.parseInt(total.getText());
            int rentedAlbums = Integer.parseInt(rented.getText());

            if (rentedAlbums > totalAlbums) {
                showAlert("Error", "Rented albums cannot exceed total albums.");
                return;
            }

            int availableAlbums = totalAlbums - rentedAlbums;

            Album newAlbum = new Album(albumName, artistName, totalAlbums, availableAlbums, rentedAlbums);
            albumList.add(newAlbum);

            album.clear();
            artist.clear();
            total.clear();
            rented.clear();
        } catch (NumberFormatException e) {
            showAlert("Error", "Please enter valid numbers for Total and Rented fields.");
        }
    }

    @FXML
    private void handlePinjam(ActionEvent event) {
        Album selectedAlbum = tabel.getSelectionModel().getSelectedItem();
        if (selectedAlbum == null) {
            showAlert("Error", "Please select an album from the table.");
            return;
        }

        if (selectedAlbum.getAvailable() > 0) {
            selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
            tabel.refresh();
        } else {
            showAlert("Info", "Tidak bisa dipinjam. No available albums.");
        }
    }

    @FXML
    private void handleUpdate(ActionEvent event) {
        Album selectedAlbum = tabel.getSelectionModel().getSelectedItem();
        if (selectedAlbum == null) {
            showAlert("Error", "Please select an album from the table.");
            return;
        }

        if (selectedAlbum.getAvailable() < selectedAlbum.getTotal()) {
            selectedAlbum.setAvailable(selectedAlbum.getAvailable() + 1);
            tabel.refresh();
        } else {
            showAlert("Info", "Cannot update. Available albums cannot exceed total albums.");
        }
    }

    @FXML
    private void handleHapus(ActionEvent event) {
        Album selectedAlbum = tabel.getSelectionModel().getSelectedItem();
        if (selectedAlbum == null) {
            showAlert("Error", "Please select an album from the table.");
            return;
        }

        albumList.remove(selectedAlbum);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
