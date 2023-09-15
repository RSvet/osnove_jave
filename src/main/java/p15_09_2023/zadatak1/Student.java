package p15_09_2023.zadatak1;

public class Student extends Osoba {
    private int brojIndeksa;
    private int dug;

    public Student() {
    }

    public Student(String imePrezime, String jmbg, int brojIndeksa, int dug) {
        super(imePrezime, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dug = dug;
    }

    public void uplatiSkolarinu(int iznos){
        if(iznos<=this.dug)
        this.dug-=iznos;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj indeksa: "+this.brojIndeksa);
        System.out.println("Dug: "+this.dug);
    }
}
