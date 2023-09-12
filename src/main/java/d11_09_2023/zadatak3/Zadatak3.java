package d11_09_2023.zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {
    Video primerVideo = new Video("v6tuOipj5mk", "Ariana Grande - positions (official video)", 195);
    primerVideo.pogledaj();
    primerVideo.lajkuj();
    primerVideo.lajkuj();
    primerVideo.dislajkuj();


    YoutubePlayer player = new YoutubePlayer();
    player.iscitaj();
    System.out.println();
    player.aktivirajBioskopskiMod();
    player.ucitajVideo(primerVideo);
    player.premotajUnapred(); player.premotajUnapred(); player.premotajUnapred();
    player.premotajUnapred();

    player.iscitaj();
    System.out.println(player.share());



    }
}
