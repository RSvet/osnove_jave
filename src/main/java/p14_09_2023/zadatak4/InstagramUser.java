package p14_09_2023.zadatak4;

public class InstagramUser {
    private String username;
    private String korisnik;
    private String email;

    public InstagramUser(String username, String korisnik, String email) {
        this.username = username;
        this.korisnik = korisnik;
        this.email = email;
    }

    public void stampa(){
        System.out.println(this.username+" - "+this.korisnik+" - "+this.email);
    }
}
