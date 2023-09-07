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
    }
}
