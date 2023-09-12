package p12_09_2023.zadatak1;

public class ClanskaKarta {
    private int popust;
    private String broj;

    public ClanskaKarta(int popust, String broj){
        this.popust = popust;
        this.broj = broj;
    }

    public void setPopust(int popust){
        this.popust = popust;
    }
    public int getPopust(){
        return this.popust;
    }

    public void setBroj(String broj){
        this.broj = broj;
    }

    public String getBroj(){
        return this.broj;
    }
}
