package d18_09_2023.zadatak2;

import java.util.ArrayList;

public class ValidationResult {
    /*
    Krerati klasu ValidationResult koja ima:
●	hasErrors- koji moze da bude true ili false
●	Errors - niz strigova
●	Gettere za atribute
●	Metodu addError koja postavlja hasErrors na true i dodaje gresku u niz.
●	Metodu print koja stampa u formatu:
Ako greske postoje, svaku gresku stampamo u novom redu
Ukoliko ne postoje, stampamo “No validation errors”
     */

    private boolean hasErrors;
    ArrayList<String>errors;

    public ValidationResult() {

        this.errors = new ArrayList<>();
    }

    public boolean isHasErrors() {
        return hasErrors;
    }
    public ArrayList<String> getErrors() {
        return errors;
    }

    public void addError(String error){
        this.hasErrors = true;
        this.errors.add(error);
    }

    public void print(){
        if(hasErrors){
            for (int i = 0; i < errors.size(); i++) {
                System.out.println(errors.get(i));
            }
        }
        else System.out.println("No validation errors");
    }
}
