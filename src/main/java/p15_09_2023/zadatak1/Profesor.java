package p15_09_2023.zadatak1;

public class Profesor extends Osoba {
    private String nazivPredmeta;
    private int plata;

    public Profesor() {
    }

    public Profesor(String imePrezime, String jmbg, String nazivPredmeta, int plata) {
        super(imePrezime, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.plata = plata;
    }

    public void povecajPlatu(int povecanje){
        this.plata+= this.plata*povecanje/100;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Predmet: "+this.nazivPredmeta);
        System.out.println("Plata: "+this.plata);

    }
}
