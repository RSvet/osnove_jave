package p24_08_2023;

import java.util.ArrayList;

public class UvodNizovi3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+", ");
        }
    }
}
