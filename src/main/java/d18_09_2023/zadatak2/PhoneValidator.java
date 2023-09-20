package d18_09_2023.zadatak2;

public class PhoneValidator extends Validator {
    /*
    Kreirati klasu PhoneValidator koja nasledjuje klasu Validator i koja ima:
●	 Atribut za broj telefona
●	Geter i seter za broj telefona
●	Broj telefona je validan ukoliko:
○	Broj krece sa znakom +
○	Ukoliko nema razmaka
○	Sadrzi samo cifre
Ukoliko se npr za broj telefona unese vrednost 5a5 555 55
	Metoda vraca rezultat sa greskama:
-	Phone number must start with +
-	Phone number cannot contain spaces
-	Phone number can only contain numbers
     */

    private String number;

    public PhoneValidator(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult res = new ValidationResult();
        boolean notOnlyNumbers = false;
        String phone = "";
        if(this.number.startsWith("+")){
            phone = this.number.substring(1);
        }
        else phone = this.number;

        char[] chars = phone.toCharArray();
        for (char aChar : chars) {
            if (!Character.isDigit(aChar) && aChar != ' ') {
                notOnlyNumbers = true;
            }
        }

        if(!this.number.startsWith("+")){
            res.addError("Phone number must start with +");
        }
        if(this.number.contains(" ")){
            res.addError("Phone number cannot contain spaces");
        }
        if(notOnlyNumbers){
            res.addError("Phone number can only contain numbers");
        }
        return res;
    }

}
