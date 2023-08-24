package p24_08_2023;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak6 {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Random r = new Random();
        System.out.println(numbers);
        for (int i = 0; i < 8; i++) {

            int firstRandInd = r.nextInt(numbers.size()-1);
            int secondRandInd = r.nextInt(numbers.size()-1);

            int firstArrElement = numbers.get(firstRandInd);
            int secondArrElement = numbers.get(secondRandInd);

            while(firstRandInd == secondRandInd){
                secondRandInd = r.nextInt(numbers.size()-1);
            }

            numbers.set(firstRandInd, secondArrElement);
            numbers.set(secondRandInd, firstArrElement);

        }
        System.out.print(numbers);
    }
}
