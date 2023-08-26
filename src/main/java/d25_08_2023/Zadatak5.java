package d25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
    /*
    5.	Zadatak
        Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
        Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB)
        a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
        Primer poziva funkcija:
        Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 352.5
        Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 4.95
        Primer izvrsenja main programa:
        Unesite vrednost u eurima: 3
        Unesite valutu za konverziju: RSD
        3 EUR je 352.5 RSD
        Konverzija eura u druge valute:
        1 EUR = 117.5 RSD
        1 EUR = 1.1 USD
        1 EUR = 62.98 RUB
     */
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost u eurima: ");
        double eur = s.nextDouble();

        System.out.print("Unesite valutu za konverziju: ");
        String currency = s.next();

        System.out.println(eur+" EUR je "+currencyConverter(eur, currency)+ " "+currency.toUpperCase());

    }

    public static double currencyConverter(double amount, String currency){
        double convertedAmount = 0;
        if(currency.toUpperCase().equals("RSD")){
            convertedAmount = amount * 117.5;
        }
        else if (currency.toUpperCase().equals("USD")){
            convertedAmount = amount * 1.1;
        }
        else if (currency.toUpperCase().equals("RUB")){
            convertedAmount = amount * 62.98;
        }
        else{
            return 0;
        }

        return convertedAmount;
    }
}
