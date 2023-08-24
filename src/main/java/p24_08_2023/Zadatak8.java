package p24_08_2023;

import java.sql.Array;
import java.util.ArrayList;

public class Zadatak8 {
    public static void main(String[] args) {
        ArrayList <String> poljaRegistracija = new ArrayList<>();
        poljaRegistracija.add("first name");
        poljaRegistracija.add("last name");
        poljaRegistracija.add("email");
        poljaRegistracija.add("password");
        poljaRegistracija.add("phone");
        poljaRegistracija.add("address");

        ArrayList <Boolean> obaveznaPolja = new ArrayList<>();

        obaveznaPolja.add(true);
        obaveznaPolja.add(true);
        obaveznaPolja.add(true);
        obaveznaPolja.add(true);
        obaveznaPolja.add(false);
        obaveznaPolja.add(false);

        for (int i = 0; i < poljaRegistracija.size(); i++) {
            if(obaveznaPolja.get(i)){
                System.out.println(poljaRegistracija.get(i)+": * \033[4m              \033[0m ");
            }
            else {
                System.out.println(poljaRegistracija.get(i)+": \033[4m              \033[0m ");
            }

        }
    }
}
