package d25_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
            /*
            3.	Zadatak
            Napisati metodu koja stampa podatke o korisniku u formatu:
            JMBG: [jmbg]
            Ime: [ime]
            Prezime: [prezime]
            God. rodjenja: [god]
            Aktivan: [true/false]
            Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
             */

        printUserData("1234567891212", "Pera", "Peric", 1960, true);
    }
    public static void printUserData(String jmbg, String firstName, String lastName, int birthYear, boolean isActive){
        System.out.println("JMBG: "+jmbg);
        System.out.println("Ime: "+firstName);
        System.out.println("Prezime: "+lastName);
        System.out.println("God. rodjenja: "+birthYear);
        System.out.println("Aktivan: "+isActive);
    }

}
