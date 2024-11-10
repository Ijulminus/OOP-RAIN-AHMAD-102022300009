public class Kucing extends Hewan{
    private String ras;

    public Kucing(String nama, int umur, String ras){
        super(nama, umur);
        this.ras = ras;
    }

    public String getnama(){
        return nama;
    }
    
    @Override
    public void infoHewan() {
        // TODO Auto-generated method stub
        super.infoHewan();
        System.out.println("Ras : " + ras + "\n");
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
        System.out.println(nama + " Menngonggong");
    }

}
