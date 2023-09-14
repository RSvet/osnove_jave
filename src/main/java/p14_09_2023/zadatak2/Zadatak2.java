package p14_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
       HistoryPage stranica1 = new HistoryPage("strana1", "www.google.com",2,30);
       HistoryPage stranica2 = new HistoryPage("strana2", "www.yahoo.com", 1, 45);


       stranica1.saveCredentials("user","pass");
       stranica1.print();
       History istorija = new History();
      istorija.openPage(stranica1);
      istorija.openPage(stranica2);

      istorija.deleteCookiesLastHour(2,0);
      istorija.seeHistory();
    }
}
