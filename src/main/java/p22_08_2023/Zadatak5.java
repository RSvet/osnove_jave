package p22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String expected = "";
        String actual = "";
        boolean end = false;
        int counter = 0;

        while(!end){
            counter++;
            System.out.println("Unesite expected: ");
            expected = s.next();
            System.out.println("Unesite actual: ");
            actual= s.next();

            if(!expected.equals(actual)){
                end = true;
                System.out.print("Test failed: Expected "+expected+" but got "+actual);
            }
            if(counter==5){
                System.out.println("Test passed");
                end = true;
            }
        }
        // resenje sa casa
        /* Scanner s = new Scanner(System.in);
        boolean hasError = false;
        String errorMessage = "";
        int i = 0;

        while (!hasError && i < 5) {
            System.out.println("Unesite actual: ");
            String actual = s.next();

            System.out.println("Unesite expected: ");
            String expected = s.next();

            if (!actual.equals(expected)) {
                hasError = true;
                errorMessage = "Expected "+expected+" but got "+actual+".";
            }
            i++;
        }

        if (hasError) {
            System.out.println("Test failed: " + errorMessage);
        } else {
            System.out.println("Test passed.");
        }
     */

    }
}
