package p12_09_2023.zadatak2;

public class Korisnik {
    private String ime;
    private String licenca;

    public Korisnik(String ime){
        this.ime = ime;
        this.licenca = "basic";
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public String getIme(){
        return this.ime;
    }
    public String getLicenca(){
        return this.licenca;
    }

    public void preplatiSe(int uplata){
        if(uplata == 100)
            this.licenca = "pro";
        else if(uplata == 150) this.licenca = "premium";
    }
    public void ponistiPreplatu(){
        this.licenca = "basic";
    }

    public int maxDuzinaPoziva(){
        if(this.licenca.equals("basic")){
            return 40;
        }
        else if (this.licenca.equals("pro"))
            return 240;

        else if(this.licenca.equals("premium")) return 1440;
        return 0;
    }

    public void stampa(){
        System.out.println(this.ime);
    }
}
