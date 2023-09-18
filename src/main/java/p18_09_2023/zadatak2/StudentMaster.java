package p18_09_2023.zadatak2;

public class StudentMaster extends Student{
    public StudentMaster(String imePrezime, int brojIndeksa, int godina) {
        super(imePrezime, brojIndeksa, godina);
    }

    @Override
    public int cena() {
        return 100000;
    }

    @Override
    public boolean budzet() {

        return this.getGodina()<2;
    }
}
