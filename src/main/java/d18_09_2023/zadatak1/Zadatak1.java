package d18_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer(300, 290, 5);

        Control audio = new AudioControl(false);
        audio.izvrsiAkciju(player);
        Control time = new TimeControl(true);
        time.izvrsiAkciju(player);
        Control quality = new QualityOptimizerControl(80);
        quality.izvrsiAkciju(player);

        player.stampaj();
    }
}
