public class Checking extends Account{
    // List of properties specific to Checking account
    int debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize checking account properties

    public Checking(String name, String sSN, double initDeposit) {
        super(name,sSN,initDeposit);
    }
    // List any methods specific to the checking account
}
