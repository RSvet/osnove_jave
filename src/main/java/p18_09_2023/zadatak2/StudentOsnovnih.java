package p18_09_2023.zadatak2;

public class StudentOsnovnih extends Student {
    public StudentOsnovnih(String imePrezime, int brojIndeksa, int godina) {
        super(imePrezime, brojIndeksa, godina);
    }

    @Override
    public int cena() {
        return 90000;
    }

    @Override
    public boolean budzet() {
        return this.getGodina()<5;
    }
}
