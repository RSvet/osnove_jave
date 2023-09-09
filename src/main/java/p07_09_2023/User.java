package p07_09_2023;

public class User {
    public String ime; //atribut
    public String email;
    public int starost;

    public void stampaj(){
        System.out.println("Ime: "+this.ime);
        System.out.println("Email: "+this.email);
        System.out.println("Starost: "+this.starost);
    }
}
