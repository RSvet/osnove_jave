package d18_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        /*
        4.	Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5. iteraciju odstampa i novi red.
        Zadatak resiti pomocu FOR petlje.
        Primer izvrsenja:
        _ _ _ _ _
        _ _ _ _ _
        _ _ _ _ _
        _ _ _ _ _
        _ _ _ _ _
        */
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                if(j==5){
                    System.out.println("_");
                }
                else
                {
                    System.out.print("_ ");
                }

            }
        }
    }
}
