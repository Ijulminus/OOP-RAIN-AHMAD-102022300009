public class Burung extends Hewan {
    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    public String getNama(){
        return nama;
    }


    @Override
    public void infoHewan() {
        // TODO Auto-generated method stub
        super.infoHewan();
        System.out.println("Warna Bulu : " + warnaBulu + "\n");
    }

    @Override
    public void makan() {
        // TODO Auto-generated method stub
        super.makan();
    }

    @Override
    public void makan(String makanan) {
        // TODO Auto-generated method stub
        super.makan(makanan);
    }

    @Override
    public void suara() {
        // TODO Auto-generated method stub
        System.out.println(nama + " Teriak");;
    } 

}
