public class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;

    // To do: Buatlah constructor pada class Komputer
    protected Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan
    public int getjumlahKomputer(){
        return jumlahKomputer;
    }
    public String getNamaWarnet(){
        return namaWarnet;
    }

    public float gethargaPerJam(){
        return hargaPerJam;
    }

    public void Informasi(){
        System.out.println("Nama Warnet : " + namaWarnet);
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Harga Per Jam : " + hargaPerJam);
    }

    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

}