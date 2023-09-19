package d18_09_2023.zadatak1;

public class VideoPlayer {
    /*
    Kreirati klasu VideoPlayer koja ima:
    ●	duzinu videa
    ●	trenutno vreme videa
    ●	jacinu zvuka
    ●	Kvalitet videa (144, 240, 360, 480, 720, 1080)
    ●	gettere, settere i konstruktore
    ●	metodu stampaj koja stampa podatke u formatu:
    trenutno vreme videa
    jacina zvuka
    kvalitet videa
     */

    private int duzina;
    private int trenutnoVreme;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public VideoPlayer(int duzina, int trenutnoVreme, int jacinaZvuka) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getDuzina() {
        return duzina;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public void stampaj(){
        int minut = this.trenutnoVreme/60;
        int sekund = this.trenutnoVreme%60;
        System.out.println(String.format("Trenutno vreme: %02d:%02d", minut, sekund));
        System.out.println("Jacina: "+this.jacinaZvuka);
        System.out.println("Kvalitet: "+this.kvalitetVidea+"p");
    }
}
