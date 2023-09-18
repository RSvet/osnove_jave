package p18_09_2023;



public class MasterKartica extends PlatnaKartica {
    public MasterKartica(int suma, String broj, int godina, int mesec) {
        super(suma, broj, godina, mesec);
    }


    @Override
    public void izvrsiTransakciju(double iznos){
        double provizija = iznos*1.5/100;
        double iznosZaNaplatu = provizija+iznos;
        if(this.suma>=iznosZaNaplatu)
            this.suma-=iznosZaNaplatu;
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
