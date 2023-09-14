package p14_09_2023.zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {
        Reakcija reakcija1 = new Reakcija("srce", "Jovan Simic");
        Reakcija reakcija2 = new Reakcija("like", "Marija Petrovic");
        Reakcija reakcija3 = new Reakcija("like", "Jovan Simic");
        Reakcija reakcija4 = new Reakcija("smajli", "Jovan Simic");
        Reakcija reakcija5 = new Reakcija("smajli", "Marija Petrovic");

        FacebookPost  post = new FacebookPost("Tijana Maksimovic", "Srecan rodjendan");

        post.reaguj(reakcija1);
        post.reaguj(reakcija2);
        post.reaguj(reakcija3);
        post.reaguj(reakcija4);

        post.print();


    }
}
