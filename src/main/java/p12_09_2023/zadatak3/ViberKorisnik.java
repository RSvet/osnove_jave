package p12_09_2023.zadatak3;

public class ViberKorisnik {
    private String ime;
    private String telefon;
    private boolean aktivan;
    public ViberKorisnik(String ime, String telefon, boolean aktivan){
        this.ime = ime;
        this.telefon = telefon;
        this.aktivan = aktivan;
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public String getIme(){
        return this.ime;
    }
    public void setTelefon(String telefon){
        this.telefon =  telefon;
    }
    public String getTelefon(){
    return this.telefon;
    }

    public void setAktivan(boolean aktivan){
        this.aktivan = aktivan;
    }
    public boolean getAktivan(){
        return this.aktivan;
    }


}
