package p14_09_2023.zadatak5;

public class Zadatak5 {
    public static void main(String[] args) {
        TestStep korak = new TestStep("Open app","", "","");
        TestStep korak2 = new TestStep("Check if login link is visible","visible", "visible","");
        TestStep korak3 = new TestStep("Click on login link", "","","");
        TestStep korak4 = new TestStep("Click on login link", "","","");
        TestStep korak5 =  new TestStep(" Check if form is visible", "visible","visible","");
        TestStep korak6 = new TestStep("Enter username", "", "","");
        TestStep korak7 = new TestStep("Enter password", "", "","");
        TestStep korak8 = new TestStep("Check if login button is visible", "visible", "invisible", "Login button is not visible");
        TestStep korak9 = new TestStep("Click on login button", "","","");
        TestStep korak10 = new TestStep("User should be logged", "logged","not logged", "User is not logged");
        TestStep korak11 = new TestStep("Page should be /home","/login","/home","User should be redirected to home page");

        TestCase testSlucaj = new TestCase("A-123", "Validate Login Form");
        testSlucaj.addTestStep(korak);
        testSlucaj.addTestStep(korak2);
        testSlucaj.addTestStep(korak3);
        testSlucaj.addTestStep(korak4);
        testSlucaj.addTestStep(korak5);
        testSlucaj.addTestStep(korak6);
        testSlucaj.addTestStep(korak7);
        testSlucaj.addTestStep(korak8);
        testSlucaj.addTestStep(korak9);
        testSlucaj.addTestStep(korak10);
        testSlucaj.addTestStep(korak11);
        testSlucaj.stampa();


    }
}
