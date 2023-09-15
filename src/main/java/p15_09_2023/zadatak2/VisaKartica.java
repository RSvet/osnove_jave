package p15_09_2023.zadatak2;

public class VisaKartica extends PlatnaKartica {
    private String ovlacenoLice;

    public VisaKartica(int suma, String broj, int godina, int mesec, String ovlacenoLice) {
        super(suma, broj, godina, mesec);
        this.ovlacenoLice = ovlacenoLice;
    }

    public String getOvlacenoLice() {
        return ovlacenoLice;
    }

    public void setOvlacenoLice(String ovlacenoLice) {
        this.ovlacenoLice = ovlacenoLice;
    }
    @Override
    public void izvrsiTransakciju(double iznos){
        double provizija = iznos*1.8/100;
        if(provizija<4){
            super.izvrsiTransakciju(4);
        }
        else super.izvrsiTransakciju(iznos+provizija);

    }

    public void stampaj(){
        System.out.print("Visa Card: ");
        super.stampaj();
    }
}
