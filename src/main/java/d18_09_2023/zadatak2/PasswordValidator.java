package d18_09_2023.zadatak2;

public class PasswordValidator extends Validator {
    /*
    Kreirati klasu PasswordValidator koja nasledjuje klasu Validator i koja ima:
●	 Atribut password
●	Geter i seter za password
●	Password je validan ukoliko:
○	Sadrzi jedan od sledecih karaktera @ # / *
○	Ima minimum 8 karaktera
○	Sadrzi bar jedno veliko slovo (izguglajte kako ovo da proverite)
■	Koristan link
○	Sadrzi bar jedno malo slovo
○	Sadrzi bar jedan cifru. Koristan link, idite na kraj stranice to je najslicnije resenje onom iznad
	Ukoliko se npr za password unese vrednost botcamp
	Metoda vraca rezultat sa greskama:
-	Password must contain at least one uppercase letter
-	Password must contain at least one special character @, # or *
-	Password must be minimum 8 characters
-	Password must contain at least one digit
     */
    private String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public ValidationResult validate() {
        ValidationResult res = new ValidationResult();
        boolean isUpperCase = false;



        for (int i = 0; i < this.password.length(); i++) {
            if(Character.isUpperCase(this.password.charAt(i)))
                isUpperCase = true;
        }

        boolean hasNumber=false;
        char[] chars = this.password.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
               hasNumber=true;
            }
        }


        if(!this.password.contains("@") && !this.password.contains("#") && !this.password.contains("/") && !this.password.contains("*")){
            res.addError("Password must contain at least one special character @, # or *");
        }
        if(this.password.length()<8){
            res.addError("Password must be minimum 8 characters");
        }
        if(!isUpperCase){
            res.addError("Password must contain at least one uppercase letter");
        }
        if(!hasNumber){
            res.addError("Password must contain at least one digit");
        }
        return res;
    }
}
