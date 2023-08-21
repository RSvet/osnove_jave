package p21_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        String parniNeparni="...";
        for(int i = 1; i<=10; i++){
            if(i%2==0){
                parniNeparni+=i;
            }
            else{
                parniNeparni= i+parniNeparni;
            }
        }
        System.out.println(parniNeparni);
    }
}
