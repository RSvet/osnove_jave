package p18_09_2023;

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
    public void izvrsiTransakciju(double iznos) {
        double iznosZaNaplatu = iznos*1.8/100 +iznos;
        if(iznos*1.8/100<4){
            this.suma-=4;
        }
        else if(this.suma>=iznosZaNaplatu){
            this.suma-=iznosZaNaplatu;
        }
    }

    public void stampaj(){
        System.out.print("Visa Card: ");
        super.stampaj();
    }
}