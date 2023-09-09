package d08_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
         /*
    U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
        Primer stampanja:
        Milan Jovanovic >>> Pera Peric
        Ovo je tekst objave
        Likes 3 | Shares 1
    */

        FacebookPost prviPost = new FacebookPost();
        prviPost.user = "Sima Simic";
        prviPost.profile = "Marko Petrovic";
        prviPost.post = "Cestitam!";

        prviPost.like(); prviPost.like(); prviPost.like();
        prviPost.dislike();
        prviPost.share();
        prviPost.print();

        System.out.println();

        FacebookPost drugiPost = new FacebookPost();
        drugiPost.user = "Maja Gagic";
        drugiPost.profile = "Nikola Tasic";
        drugiPost.post = "Srecan rodjendan!";

        drugiPost.like(); drugiPost.like();
        drugiPost.dislike(); drugiPost.dislike();
        drugiPost.share();
        drugiPost.share();
        drugiPost.print();

    }

}
