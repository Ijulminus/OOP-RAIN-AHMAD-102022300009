// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    Scanner input = new Scanner(System.in);

    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    public void tambahMakananKering() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukkan Nama Makanan Kering : ");
        String namaKering = input.nextLine();
        System.out.print("Masukkan Jumlah Makanan Kering : ");
        int jumlahKering = input.nextInt();
        System.out.print("Masukkan Harga Makanan Kering : Rp.");
        double hargaKering = input.nextDouble();
        System.out.print("Masukkan Brand Makanan Kering : ");
        String brandKering = input.nextLine();
        // Todo : Create a new object for MakananKering
        MakananKering MakananKering = new MakananKering(namaKering, jumlahKering, hargaKering, brandKering);
        daftarMakananKering.add(MakananKering);

        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.print("Makanan Kering " + namaKering +" Berhasil Ditambahkan!");
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.print("Masukkan Nama Basah Basah : ");
        String namaBasah = input.nextLine();
        System.out.print("Masukkan Jumlah Makanan Basah : ");
        int jumlahBasah = input.nextInt();
        System.out.print("Masukkan Harga Makanan Basah : ");
        double hargaBasah = input.nextDouble();
        System.out.print("Masukkan Bahana Makanan Basah : ");
        String bahanBasah = input.nextLine();
        // Todo : Create a new object for MakananBasah
        MakananBasah MakananBasah = new MakananBasah(namaBasah, jumlahBasah, hargaBasah, bahanBasah);
        daftarMakananBasah.add(MakananBasah);

        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.print("Makanan Makanan " + namaBasah +" Berhasil Ditambahkan!");

    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.print("Tidak ada makanan disini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (MakananKering makanan : daftarMakananKering){
                System.out.print(makanan);
            }
            // Todo : Create print notification for  Makanan Basah
            for (MakananBasah makanan : daftarMakananBasah){
                System.out.print(makanan);
            }
            }
        }
    }
    
