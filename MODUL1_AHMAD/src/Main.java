// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        Scanner input = new Scanner(System.in);
        ManajemenInventaris manajemen = new ManajemenInventaris();
        boolean x = true;

        // Todo : Create Loop list menu
        while (x){
            System.out.println("\n==============   Menu   ==============");
            System.out.println("|| 1. Tambah Makanan Kering" + "      ||");
            System.out.println("|| 2. Tambah Makanan Basah");
            System.out.println("|| 3. Tampilkan Semua Makanan");
            System.out.println("|| 4. Keluar");
            System.out.println("======================================");
            System.out.println("Pilih menu: ");
            int opsi = input.nextInt();

            switch (opsi) {
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
                    x = false;
                    System.out.println("Terimakasih! Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid!");
                    break;
            }
        }
        input.close();
    }
}

