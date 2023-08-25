package p25_08_2023;

public class UvodMetode2 {
    public static void main(String[] args) {

        String ime = "Milan";
        String prezime = "Jovanovic";

        printUser(ime, prezime, true);
    }

    public static void printUser(String ime, String prezime,boolean active){
        if(active){
            System.out.print("0 ");
        }
        else{
            System.out.print("x ");
        }
        System.out.println(ime+" "+prezime);
    }
}
