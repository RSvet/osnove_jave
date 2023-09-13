package d12_09_2023.zadatak3;

public class Transakcija {
    /*
    ●	id transakcije
    ●	racun sa kog se prenose sredstva
    ●	racun na koji se prenose sredstva
    ●	gettere i settere
    ●	konstruktore
    ●	metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
        ○	ako je prenos sredstava manji od 4500, provizija je fiksna 45
        ○	ako je prenos sredstava veci od 4500, provizija je 1%
        ○	S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
        ○	Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
    ●	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
    Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
    (Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
    ●	metodu koja stampa podatke o transakciji u formatu:
    id transkacije
    Racun sa: Ime i prezime  -  broj racuna
    Racun na: Ime i prezime  -  broj racuna
     */
    private int id;
    private Racun isplatilac;
    private Racun primalac;
    public Transakcija(int id, Racun isplatilac, Racun primalac){
        this.id = id;
        this.isplatilac = isplatilac;
        this.primalac = primalac;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setIsplatilac(Racun isplatilac){
        this.isplatilac = isplatilac;
    }
    public Racun getIsplatilac(){
        return this.isplatilac;
    }
    public void setPrimalac(Racun primalac){
        this.primalac = primalac;
    }
    public Racun getPrimalac(){
       return this.primalac;
    }
    public double provizija(double iznos){
        if(iznos < 4500)
            return 45;
        else
            return iznos/100;
    }
    public void izvrsiTransakciju(double iznos){
        if(iznos > this.isplatilac.getStanje()) return;

        isplatilac.skiniSaRacuna(iznos + this.provizija(iznos));
        primalac.uplatiNaRacun(iznos);
    }

    public void stampaj(){
        System.out.println(this.id);
        System.out.println("Racun sa: "+this.isplatilac.getVlasnik()+" - "+this.isplatilac.getBroj());
        System.out.println("Racun na: "+this.primalac.getVlasnik()+" - "+this.primalac.getBroj());
    }


}
