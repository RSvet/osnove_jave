package p25_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {
        int number = returnNumber("II");
        System.out.println(number);
    }

    public static int returnNumber(String romanNum){
        if(romanNum.equals("I")){
            return 1;
        }
        else if (romanNum.equals("II")){
            return 2;
        }
        else if (romanNum.equals("III")){
            return 3;
        }
        else if (romanNum.equals("IV")){
            return 4;
        }
        else if (romanNum.equals("V")){
            return 5;
        }
        else return 0;
    }
}
