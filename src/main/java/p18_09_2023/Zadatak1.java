package p18_09_2023;

import p15_09_2023.zadatak2.MasterKartica;
import p15_09_2023.zadatak2.VisaKartica;

public class Zadatak1 {
    public static void main(String[] args) {
p15_09_2023.zadatak2.VisaKartica visa = new VisaKartica(20000, "123-456-456-1111",2027,1,"Pera Peric");

        visa.izvrsiTransakciju(5000);

        visa.stampaj();

        p15_09_2023.zadatak2.MasterKartica master = new MasterKartica(15400, "456-45678949", 2028, 2);
        master.izvrsiTransakciju(1200);

        master.stampaj();
    }
}
