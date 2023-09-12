package p12_09_2023;

import java.util.Random;

public class User {
    private String ime;
    private String email;

    public User() {

    }

    public User(String ime, String email) {
        this.ime = ime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void stampaj() {
        System.out.println("Ime: " + this.ime + ", email: " + this.email);
    }

}
