package p15_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
    Student student1 = new Student("Nikola Pekic", "12345678945",125,20000);
    Student student2 = new Student("Milica Nikolic", "4567891234",456,15000);

    Profesor profesor1 = new Profesor("Nemanja Markovic", "45678941256", "matematika", 80000);
    Profesor profesor2 = new Profesor("Milana Dakic", "74185293354", "biologija", 78000);


    student1.uplatiSkolarinu(10000);
    student1.stampaj();

    profesor2.povecajPlatu(15);
    profesor2.stampaj();

    }
}
