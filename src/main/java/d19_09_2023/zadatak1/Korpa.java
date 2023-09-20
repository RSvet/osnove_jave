package d19_09_2023.zadatak1;

import java.util.ArrayList;
import java.util.List;

public class Korpa {
    /*
    Kreirati klasu Korpa koja ima:
-	niz ambalaza
-	metodu dodaj ambalazu
-	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
-	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
-	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
     */

    private List<Ambalaza> ambalaze;

    public Korpa(){
        this.ambalaze = new ArrayList<>();
    }
    public void dodajAmbalazu(Ambalaza amb){
        this.ambalaze.add(amb);
    }
    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < ambalaze.size(); i++) {
            if(ambalaze.get(i).barkod.equals(barkod))
                ambalaze.remove(ambalaze.get(i));
        }
    }
    private List<Double> cenaSaPopustom(int popust){
        double cenaPopust = 0;
        List<Double>ceneSaPopustom = new ArrayList<>();
        for (int i = 0; i < ambalaze.size(); i++) {

            if(ambalaze.get(i).cena()>=popust){
                cenaPopust = ambalaze.get(i).cena()-popust;
            }

            else {
                cenaPopust = 0;
            }

          ceneSaPopustom.add(cenaPopust);
        }
        return ceneSaPopustom;
    }

    public double ukupnaCena(SuperKartica kartica){
      double sum = 0;
        for (int i = 0; i < this.cenaSaPopustom(kartica.getPopust()).size(); i++) {
            double cenaArtikla = this.cenaSaPopustom(kartica.getPopust()).get(i);
            sum+=cenaArtikla;
        }
        return sum;
    }
}
