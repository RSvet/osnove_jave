package d18_09_2023.zadatak2;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Validator>validatori = new ArrayList<>(Arrays.asList(new EmailValidator("blablamail.com"), new PasswordValidator("a5Gbv"),
                new PhoneValidator("+656k66")));

        for (int i = 0; i < validatori.size(); i++) {
            validatori.get(i).validate().print();
        }






    }
}
