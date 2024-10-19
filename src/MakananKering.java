// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String nama;
    private int jumlah;
    private double harga;
    private String brand;

    // Todo : Create Constructor of MakananKering
    public MakananKering(String nama, int jumlah, double harga, String brand){
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
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

    public String getbrand(){
        return brand;
    }

    // Todo : Create Method ShowData
    public void tampilMakanan(){
        System.out.println("Nama Barang : " + nama);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Harga : Rp." + harga);
        System.out.println("brand : " + brand);
    }

}
