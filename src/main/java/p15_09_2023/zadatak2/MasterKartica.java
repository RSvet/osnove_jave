package p15_09_2023.zadatak2;

public class MasterKartica extends PlatnaKartica{
    public MasterKartica(int suma, String broj, int godina, int mesec) {
        super(suma, broj, godina, mesec);
    }
    @Override
    public void izvrsiTransakciju(double iznos){
        double provizija = iznos*1.5/100;
        super.izvrsiTransakciju(iznos+provizija);
    }

    public void naplatiOdrzavanje(){
        this.suma-=2;
    }
    @Override
    public void stampaj(){
        System.out.print("Master Card: ");
        super.stampaj();
    }
}
