package p24_08_2023;

import java.util.ArrayList;

public class Zadatak5 {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum+=numbers.get(i);
        }
        System.out.println(sum);
    }
}
