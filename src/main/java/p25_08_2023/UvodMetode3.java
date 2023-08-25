package p25_08_2023;

public class UvodMetode3 {
    public static void main(String[] args) {
        String ime = "Milan";
        String prezime = "Jovanovic";
        boolean aktivan = true;
        String imeIPrezime = printUser(ime, prezime, true);
        System.out.println(imeIPrezime);
    }

    public static String printUser(String firstName, String lastName, boolean active){
        String fullName = "";
        if(active){
            return "o "+firstName + " "+lastName;
        }
        else {
            return "x "+firstName+" "+lastName;
        }

    }
}
