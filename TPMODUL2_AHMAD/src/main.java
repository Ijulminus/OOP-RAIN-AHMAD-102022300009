public class main {
    public static void main(String[] args) {
        Kucing kc = new Kucing("Ambalabu", 13, "Jawa");
        Burung br = new Burung("Rusdi", 69, "Jomokerian");

        System.out.println("Ini adalah : " + kc.getnama());
        kc.suara();
        kc.makan();
        kc.makan("Si Imud");

        System.out.println("\nIni adalah : " + br.getNama());
        br.suara();
        br.makan();
        br.makan("Buah \n");

        kc.infoHewan();
        br.infoHewan();
    }
}
