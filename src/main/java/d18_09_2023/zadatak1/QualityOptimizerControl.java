package d18_09_2023.zadatak1;

import java.util.ArrayList;
import java.util.Arrays;

public class QualityOptimizerControl extends Control {
    /*
    Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
●	ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
●	gettere, settere i konstruktore
●	implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
brzina interneta * 10.1, gde se uzima prvi veci kvalitet
npr: ako je brzina interneta 20 * 10.1 = 204 => postavlja 240
npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720
     */
    private double brzina;

    public QualityOptimizerControl(double brzina) {
        this.brzina = brzina;
    }

    public double getBrzina() {
        return brzina;
    }

    public void setBrzina(double brzina) {
        this.brzina = brzina;
    }


    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        ArrayList<Integer>kvaliteti = new ArrayList<>(Arrays.asList(144,240,360,480,720,1080));
        for (int i = 0; i < kvaliteti.size(); i++) {
            int kvalitet = kvaliteti.get(i);
            if(this.brzina*10.1<kvalitet){
                player.setKvalitetVidea(kvalitet);
                return;
            }
        }

    }
}
