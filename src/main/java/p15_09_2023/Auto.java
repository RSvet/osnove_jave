package p15_09_2023;

public class Auto extends Vozilo {

    private int brojVrata;

    public Auto() {
    }

    @Override
    public void stampaj() {
        System.out.println("Registracija: "+this.registracija);
        System.out.println("Brzina: "+this.brzina);
        System.out.println("Marka: "+this.marka);
        System.out.println("Broj vrata: "+this.brojVrata);

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

//    @Override
//    public void stampaj(){
//        super.stampaj();
//        System.out.println("Broj vrata: "+this.brojVrata);
//
//    }


}
