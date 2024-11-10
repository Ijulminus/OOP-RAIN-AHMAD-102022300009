public class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }
    public String NIK() {
        return NIK;
    }
    public String getNamaDepan() {
        return namaDepan;
    }
    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void TampilkanPenumpang(){
        System.out.println("NIK : " + NIK);
        System.out.println("Nama Depan : " + namaDepan);
        System.out.println("Nama Belakang : " + namaBelakang);
    }
}
