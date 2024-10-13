import java.util.ArrayList;
import java.util.Scanner;

// Ahmad Dzulfikar - 1020223000009 - TPModul1

public class Pembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarPenerbangan.add(new Penerbangan("AAL11", "CGK, Jakarta", "DPS, Bali", "10:00", "12:00", 1500000.00));
        daftarPenerbangan.add(new Penerbangan("UAL175", "CGK, Jakarta", "YIA, Yogyakarta", "14:00", "15:00", 800000.00));
        daftarPenerbangan.add(new Penerbangan("AAL77", "HLP, Jakarta", "BDO, Bandung", "08:00", "08:30", 1000000.00));

        while (true) {
            System.out.println("=== EAD Ticket Booking System ===");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = input.nextInt();

            switch (opsi) {
                case 1:
                    System.out.println("Daftar Penerbangan: ");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        daftarPenerbangan.get(i).tampilPenerbangan();
                    }
                    break;
                case 2:
                    System.out.print("Masukkan NIK: ");
                    String NIK = input.next();
                    System.out.print("Masukkan Nama Depan: ");
                    String namaDepan = input.next();
                    System.out.print("Masukkan Nama Belakang: ");
                    String namaBelakang = input.next();
                    Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
                    System.out.println("Terimakasih Sudah Mengisi Data Pelanggan, Silahkan Pilih Tiket yang tersedia! \n----------------------------------------------- ");
                    System.out.println("Daftar Penerbangan: ");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        daftarPenerbangan.get(i).tampilPenerbangan();
                    }
                    System.out.print("-----------------------------------------------  \nPilih penerbangan (nomor): ");
                    int indexPenerbangan = input.nextInt() - 1; // -1 karena array mulai dari 0
                    if (indexPenerbangan >= 0 && indexPenerbangan < daftarPenerbangan.size()) {
                        Penerbangan penerbanganDipilih = daftarPenerbangan.get(indexPenerbangan);
                        Tiket tiket = new Tiket(penumpang, penerbanganDipilih);
                        daftarTiket.add(tiket);
                        System.out.println("Pesanan Tiket:");
                        System.out.println("Nama Penumpang : " + penumpang.getNamaDepan() + " " + penumpang.getNamaBelakang());
                        System.out.println("Nomor Penerbangan: " + penerbanganDipilih.getnomorTerbang());
                        System.out.println("Harga Tiket: Rp." + penerbanganDipilih.getharga());
                    } else {
                        System.out.println("Penerbangan tidak ditemukan!");
                    }
                    break;
                case 3:
                System.out.println("=== Detail Tiket Penerbangan ===");
                if (daftarTiket.isEmpty()) {
                    System.out.println("Tidak ada tiket yang terdaftar.");
                } else {
                    for (int i = 0; i < daftarTiket.size(); i++) {
                        System.out.println("Tiket " + (i + 1) + ":");
                        daftarTiket.get(i).tampilTiket();
                    }
                }
                break;

                case 4:
                    System.out.println("Terima kasih! Sampai jumpa.");
                    input.close();
                    return;

                default:
                    System.out.println("Opsi tidak valid! Silakan coba lagi.");
            }
            System.out.println();
        }
    }
    static class Tiket {
        private Penumpang penumpang;
        private Penerbangan penerbangan;

        public Tiket(Penumpang penumpang, Penerbangan penerbangan) {
            this.penumpang = penumpang;
            this.penerbangan = penerbangan;
        }

        public void tampilTiket() {
            System.out.println("Nama Penumpang: " + penumpang.getNamaDepan() + " " + penumpang.getNamaBelakang());
            System.out.println("Nomor Penerbangan: " + penerbangan.getnomorTerbang());
            System.out.println("Rute: " + penerbangan.getasalBandara() + " - " + penerbangan.getakhirBandara());
            System.out.println("Jam Keberangkatan: " + penerbangan.getberangkat() +"-"+ penerbangan.getdatang());
            System.out.println("Harga: Rp." + penerbangan.getharga());
        }
    }
}