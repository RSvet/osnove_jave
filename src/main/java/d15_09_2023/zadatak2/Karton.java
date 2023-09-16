package d15_09_2023.zadatak2;

public class Karton {
    /*
    Kreirati klasu Karton koja ima:
-	tip kartona (crveni, zuti)
-	konstuktore za koje mislite da ce vam trebati
-	gettere i settere za karton
     */

    private String tip;

    public Karton(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
