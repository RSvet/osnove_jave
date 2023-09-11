package p11_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
        Student prviStudent = new Student();
        prviStudent.setIme("Petar");
        String ime = prviStudent.getIme();

        prviStudent.setPrezime("Petrovic");
        String prezime = prviStudent.getPrezime();

        prviStudent.setBrojIndeksa(123456);
        int brIndeksa = prviStudent.getBrojIndeksa();

        prviStudent.setBudzet(false);
        boolean budzet = prviStudent.getBudzet();

        prviStudent.stampaj();

    }
}
