package p11_09_2023;

import java.util.Random;

public class User {
    private int id;
    private String ime;
    private String email;
    private int starost;

    // konstruktor
    // default-ni

    // public User(){
   //     Random randomIdGenerator = new Random();
   //     this.id = randomIdGenerator.nextInt(1000);
  //  }

    // sa parametrima
    public User(String ime, String email, int starost ){
        Random randomIdGenerator = new Random();
        this.id = randomIdGenerator.nextInt(1000);
        this.ime = ime;
        this.email = email;
        this.starost = starost;
    }

    public User(String email ){
        this.email = email;
    }


    //Getter
    public String getIme(){
        return this.ime;
    }

    //Setter
    public void setIme(String ime){
        this.ime = ime;
    }

    public void setStarost(int starost){
        this.starost = starost;
    }

    public int getStarost(){
        return this.starost;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
    public void stampaj(){
        System.out.println(this.ime);
        System.out.println(this.email);
        System.out.println(this.starost);
    }
}
