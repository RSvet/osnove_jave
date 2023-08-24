package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite poziciju: ");
        int positionK = s.nextInt();

        System.out.println(numbers.get(positionK));
    }
}
