public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer kc = new Komputer(15, "Warnet Gaming mas Amba", 5000);

        // To do: Panggillah Method Informasi dari class Komputer
        kc.Informasi();

        System.out.println("---------------------------------------");


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP xd = new KomputerVIP(5, "Warnet ci Rusdi", 8000, true);
        // To do: Panggillah Method Informasi dari class KomputerVIP
        xd.Informasi();
        // To do: Panggillah Method Login
        xd.Login("Imud");

        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        xd.Bermain(2);
        xd.Bermain(8, 17);

        System.out.println("---------------------------------------");


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium wow = new KomputerPremium(50, "Warnet JMK48", 20000, true);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        wow.Informasi();
        // To do: Panggillah Method Pesan
        wow.pesan(17);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        wow.TambahLayanan("Mie Ayam");
        wow.TambahLayanan("Rawon", "Koka-Kola");

        
        System.out.println("---------------------------------------");
    }
}