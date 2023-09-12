package p12_09_2023.zadatak1;

public class Kupac {
    private String ime;
    private ClanskaKarta clanskaKarta;
    public Kupac(String ime, ClanskaKarta clanskaKarta){
        this.ime = ime;
        this.clanskaKarta = clanskaKarta;
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public String getIme(){
        return this.ime;
    }
    public ClanskaKarta getClanskaKarta(){
        return this.clanskaKarta;
    }

    public void stampaj(){
        System.out.print(this.ime);
        if(this.clanskaKarta != null){
            System.out.println(" - "+this.clanskaKarta.getBroj());
        }
    }
}
