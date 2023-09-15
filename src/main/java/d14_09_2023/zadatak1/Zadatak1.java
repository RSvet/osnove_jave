package d14_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
        Ispit matematika = new Ispit("matematika", 5,"Marko Markovic");
        Ispit hemija = new Ispit("hemija", 8,"Marija Nedic");
        Ispit mikroekonomija = new Ispit("mikroekonomija", 6,"Nemanja Miletic");
        Ispit statistika = new Ispit("statistika", 7,"Nikola Tasic");

        Student student = new Student(123, "Jelena Petrovic", "osnovne");
        student.dodajIspit(matematika);
        student.dodajIspit(hemija);
        student.dodajIspit(mikroekonomija);
        student.dodajIspit(statistika);

        student.stampaj();
    }
}
