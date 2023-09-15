package p15_09_2023;

public class Auto extends Vozilo {

    private int brojVrata;

    public Auto() {
    }

    public Auto(String registracija, String marka, int brzina, int brojVrata) {
        super(registracija, marka, brzina);
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj vrata: "+this.brojVrata);

    }
}
