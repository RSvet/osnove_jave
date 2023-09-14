package p14_09_2023.zadatak4;

public class Zadatak4 {
    public static void main(String[] args) {
        InstagramUser user = new InstagramUser("nick", "Ana Petrovic", "ana@mail.com");
        InstagramUser user2 = new InstagramUser("nick2", "Mirko Petrovic", "mirko@mail.com");

        InstagramTag tag = new InstagramTag(2,5, user);

        InstagramTag tag2 = new InstagramTag(3,8, user2);


        InstagramImage img = new InstagramImage(10, 20, "instagram.com/korisnik/123");
        img.dodajTag(tag);
//        img.dodajTag(tag2);

        InstagramPost post = new InstagramPost("primer instagram posta");
        post.dodajSliku(img);

        post.stampa();

    }


}
