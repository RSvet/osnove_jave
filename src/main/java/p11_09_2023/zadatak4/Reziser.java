package p11_09_2023.zadatak4;

public class Reziser {
    private String ime;
    private String prezime;
    private int starost;

    public Reziser(String ime, String prezime, int starost){
        this.ime = ime;
        this.prezime = prezime;
        this.starost = starost;
    }

    public void setIme(String ime){
        this.ime = ime;
    }
    public String getIme(){
        return this.ime;
    }
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    public String getPrezime(){
        return this.prezime;
    }

    public void setStarost(int starost){
        this.starost = starost;
    }
    public int getStarost(){
        return this.starost;
    }

    public void print(){

           System.out.println("Reziser: "+this.ime+" "+this.prezime+", starost: "+this.starost);

        }
}
