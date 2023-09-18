package p18_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
        StudentOsnovnih osnovne = new StudentOsnovnih("Pera Peric", 123, 5);

        StudentMaster  master = new StudentMaster("Maja Maric", 456, 1);

        osnovne.stampa();
        System.out.println();
        master.stampa();
    }
}
