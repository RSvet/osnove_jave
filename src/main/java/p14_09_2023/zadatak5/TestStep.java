package p14_09_2023.zadatak5;

public class TestStep {
    private String opis;
    private String actualVrednost;
    private String expectedVrednost;
    private String errorMessage;

    public TestStep(String opis, String actualVrednost, String expectedVrednost, String errorMessage) {
        this.opis = opis;
        this.actualVrednost = actualVrednost;
        this.expectedVrednost = expectedVrednost;
        this.errorMessage = errorMessage;
    }

    public String getOpis() {
        return opis;
    }

    public String getActualVrednost() {
        return actualVrednost;
    }

    public String getExpectedVrednost() {
        return expectedVrednost;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean validate(){
        return this.actualVrednost.equals(this.expectedVrednost);
    }

    public void stampa(){
        System.out.println("| Opis: "+this.opis+" ");
        System.out.print("| Status: "+(this.validate()?"passed":"failed | "));
        if(!this.validate())
        System.out.println("Error message: "+this.errorMessage);

    }
}
