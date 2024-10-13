public class Penerbangan {
    private String nomorTerbang;
    private String asalBandara;
    private String akhirBandara;
    private String berangkat;
    private String datang;
    private Double harga;

    public Penerbangan(String nomorTerbang, String asalBandara, String akhirBandara, String berangkat, String datang, Double harga){
        this.nomorTerbang = nomorTerbang;
        this.asalBandara = asalBandara;
        this.akhirBandara = akhirBandara;
        this.berangkat = berangkat;
        this.datang = datang;
        this.harga = harga;
    }
    public String getnomorTerbang(){
        return nomorTerbang;
    }

    public String getasalBandara(){
        return asalBandara;
    }

    public String getakhirBandara(){
        return akhirBandara;
    }

    public String getberangkat(){
        return berangkat;
    }

    public String getdatang(){
        return datang;
    }

    public Double getharga(){
        return harga;
    }

    public void tampilPenerbangan() {
        System.out.println("\nNomor Penerbangan : " + nomorTerbang);
        System.out.println("Bandara Asal : " + asalBandara + " ---> Bandara Tujuan : " + akhirBandara);
        System.out.println("Jam Keberangkatan : " + berangkat + " ---> Jam Kehadiran : " + datang);
        System.out.println("Harga Tiket : Rp." + harga);

    }
}
