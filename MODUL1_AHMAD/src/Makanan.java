
public class Makanan {
    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    private String nama;
    private int jumlah;
    private double harga;

    // Todo : Create Constructor of Makanan
    public Makanan(String nama, int jumlah, double harga){
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Todo : Create Getter and Setter
    public String getNama(){
        return nama;
    }

    public int getJumlah(){
        return jumlah;
    }

    public double getHarga(){
        return harga;
    }

    // Method tampilkanData
    public void tampilMakanan(){
        System.out.println("Nama Barang : " + nama);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Harga : Rp." + harga);
    }

}
