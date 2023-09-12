package p12_09_2023.zadatak2;

public class ZoomCall {
    private String link;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall(String link, String password, Korisnik host){
        this.link = link;
        this.password = password;
        this.host = host;
    }

    public void setGuest(Korisnik guest){
        this.guest = guest;
    }
    public Korisnik getGuest(){
        return this.guest;
    }

    public String getLink(){
        return this.link;
    }
    public String getPassword(){
        return this.password;
    }
    public Korisnik getHost(){
        return this.host;
    }

    public void pokreniPoziv(){
        System.out.println("Zoom Call: "+this.link);
        System.out.println("Password: "+this.password);
        System.out.print("Host: ");
        this.host.stampa();
        if(this.guest != null)
        System.out.print("Guest: ");
        this.guest.stampa();
        System.out.println("Maksimalno trajanje poziva je "+this.host.maxDuzinaPoziva()+" min.");
    }
}
