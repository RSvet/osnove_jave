package d08_09_2023.zadatak2;

public class FacebookPost {
    /*
    Kreirati klasu FacebookPost koja ima:
   Od atributa:
    -	ime i prezime korisnika koji je objavio post
    -	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
    -	tekst objave
    -	broj lajkova
    -	broj deljenja
      Od metoda:
    -	like(), koja povecava broj lajkova za 1.
    -	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
    -	share(), koja povecava broj deljenja za 1
    -	print(), koja stampa objavu u formatu:
    (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
    (tekst objave)
    Likes (broj lajkova) | Shares (broj deljenja)
     */

    public String user;
    public String profile;
    public String post;
    public int likes;
    public int shares;

    public void like(){
        this.likes+=1;
    }
    public void dislike(){
        if(this.likes>0)
        this.likes-=1;
    }

    public void share(){
        this.shares+=1;
    }

    public void print(){
        System.out.println("("+this.user+")" + " >>> " + "("+this.profile+")");
        System.out.println(this.post);
        System.out.println("Likes ("+this.likes+") | Shares ("+this.shares+")");
    }

}
