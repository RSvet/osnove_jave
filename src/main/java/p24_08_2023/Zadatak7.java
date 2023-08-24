package p24_08_2023;

import java.util.ArrayList;

public class Zadatak7 {
    public static void main(String[] args) {
        ArrayList<String> nazivPaste = new ArrayList<>();
        nazivPaste.add("AGLIO E OLIO");
        nazivPaste.add("PRIMAVERA");
        nazivPaste.add("ARRABBIATA");
        nazivPaste.add("NAPOLITANA ");
        nazivPaste.add("POLLO E SPINACI");

        ArrayList<Integer> cena = new ArrayList<>();
        cena.add(500);
        cena.add(340);
        cena.add(420);
        cena.add(440);
        cena.add(550);

        for (int i = 0; i < nazivPaste.size(); i++) {
            System.out.println(nazivPaste.get(i)+"............ "+cena.get(i)+" rsd");
        }
    }
}
