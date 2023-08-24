package p24_08_2023;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer>brojevi = new ArrayList<>();
 //       ArrayList<Integer>brojevi = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(5);

        int lastIndex = brojevi.size()-1;
        int sumFirstLast = brojevi.get(0) + brojevi.get(lastIndex);

        System.out.println(sumFirstLast);


    }
}
