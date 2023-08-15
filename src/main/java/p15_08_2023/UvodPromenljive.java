package p15_08_2023;

public class UvodPromenljive {
    public static void main(String[] args) {

        //String firstName; //deklaracija

        String firstName = "Svetlana";
        String lastName = "Radisic"; //deklaracija i inicijalizacija
        int yearOfBirth = 1995;
        int currentYear = 2023;
        double avg = 5.8;
        boolean active = true;

       int age = currentYear - yearOfBirth;

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Active: " + active);
    }
}
