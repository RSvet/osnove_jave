package d15_09_2023.zadatak1;

public class Trener extends Osoba {
    /*
    Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
-	godine iskustva
-	tip trenera (kondicioni, za igru, pomocni, personalni)
-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
     */

    private int iskustvo;
    private String tip;

    public Trener(String imePrezime, String jmbg, int godinaRodjenja, int iskustvo, String tip) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.iskustvo = iskustvo;
        this.tip = tip;
    }

    public void stampaj(){
        super.stampaj();
        System.out.println("Tip trenera "+this.tip+".");
        System.out.println("Godine iskustva "+this.iskustvo+".");
    }
}
