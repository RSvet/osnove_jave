package p19_09_2023.zadatak2;

public class Trkac extends Atleticar {

    public Trkac(String imePrezime, int rezultat) {
        super(imePrezime, rezultat);
    }

    @Override
    public boolean isBetter(Atleticar atleticar) {
        return this.rezultat<atleticar.rezultat;
    }


}
