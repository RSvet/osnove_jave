package p07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        SlackMessage prvaPoruka = new SlackMessage();
        prvaPoruka.tekst = "Ovo je prva poruka";
        prvaPoruka.posiljalac= "Sima Simic";
        prvaPoruka.datumVreme = "26.08.2021. 18:55";

        SlackMessage drugaPoruka = new SlackMessage();
        drugaPoruka.tekst = "Ovo je druga poruka";
        drugaPoruka.posiljalac= "Tijana Markovic";
        drugaPoruka.datumVreme = "30.08.2023. 20:55";

        System.out.println(prvaPoruka.posiljalac + " - "+ prvaPoruka.datumVreme);
        System.out.println(prvaPoruka.tekst);

        System.out.println(drugaPoruka.posiljalac + " - "+ drugaPoruka.datumVreme);
        System.out.println(drugaPoruka.tekst);

        /*
        Krairti klasu SlackMessage koja ima:
        tekst poruke
        ime i prezime osobe koja je stavila poruku
        datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
        (dopuna) kreirati metodu za stampu koja stampa podatke u formatu
        [ime i prezime osobe] - [kad je poslata]
        [Tekst poruke]
        U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke

        (Dopuna)
    Dopuniti klasu SlackMessage novim atributom koji kaze kada je poruka azurirana i
    kreirati metodu za azuriranje teksta. Metoda kao parametar prima novi tekst i datum kada je poruka azurirana.
    Metoda postavlja novi tekst i datum azuriranja u objektu.


         */

        prvaPoruka.print();

        prvaPoruka.azuriraj("Novi tekst poruke", "05.01.2023");

        prvaPoruka.print();

        String convertedInfo = prvaPoruka.convertToString();
        System.out.println(convertedInfo);

    }
}
