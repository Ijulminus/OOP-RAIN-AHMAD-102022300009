// Don't delete any comments below!!!
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        Scanner input = new Scanner(System.in);
        ManajemenInventaris manajemen = new ManajemenInventaris();
        boolean x = true;
        // Todo : Create Loop list menu
        while (x) {
            System.out.println("==== Menu ===");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Exit");
            System.out.println("=============");
            System.out.println("Pilih Menu (1-4)");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    manajemen.tambahMakananKering();
                    break;
                case 2:
                    manajemen.tambahMakananBasah();
                    break;
                case 3:
                    manajemen.tampilkanSemuaMakanan();
                    break;
                case 4:
                    System.out.println("Terimakasih Sudah Menggunakan!");
                    x = false;
                    break;
                default:
                    System.out.println("Tidak ada pilihan tersebut!");
                    break;
            }
        }
        input.close();
    }
}
