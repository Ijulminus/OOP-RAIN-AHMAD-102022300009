public class KomputerVIP extends Komputer {

    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean VIP;

    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean VIP){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.VIP = VIP;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    @Override
    public void Informasi() {
        // TODO Auto-generated method stub
        super.Informasi();
        System.out.println("Status VIP : " + VIP);
        if (VIP == true) {
            System.out.println("Benefit VIP : \n   -Diskon 10% untuk member \n   -Gratis Minuman setiap 4 Jam \n   -Prioritas dilayanin mas rusdi 🤤 \n");
        } if (VIP == false) {
            System.out.println("Non Member : \n   -Kasihan cik gadapet diskon :( \n   -haus terus gadapet minum wak \n   -ga dapet perhatian dari mas rusdi cik (alamak sedihnyaa) \n");
        }
    }

    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String Username){
        System.out.println("Login dengan username : " + Username);
    }
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam){
        System.out.println("Bermain selama : " + jam + " Jam" );
    }
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menit_tambahan){
        System.out.println("Bermain Selama : " + jam + " Jam " + menit_tambahan + " menit");
    }
}