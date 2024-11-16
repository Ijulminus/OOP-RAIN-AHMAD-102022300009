class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;

    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void Informasi() {
        // TODO Auto-generated method stub
        super.Informasi();
        System.out.println("Status Ruangan Premium : " + ruangPrivat);
        if (ruangPrivat == true) {
            System.out.println("Benefit ruang Premium : \n   -Ruangan AC Pribadi \n   -Gaming banget loh wak \n   -Bisa liat kalah di 144FPS cik \n   -nguwawor cik mas andre loh ya");
        } if (ruangPrivat == false) {
            System.out.println("Klo ga di ruang Premium : \n   -Kasihan cik kepanasan (walah banjir keringet loh ya) \n   -ga ada lampu warna warni (ga gaming) \n   -fpsnya loh ya dikit amat wak");
        }
    }

    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(int nomorKomputer){
        System.out.println("Memesan Komputer Nomor : " + nomorKomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){
        System.out.println("Menambah Layanan Makanan : " + makanan);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("Menambah Layanan Makanan : " + makanan + " dan Minuman : " + minuman);
    }
}
