public class Checking extends Account{
    // List of properties specific to Checking account
    int debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize checking account properties

    public Checking(String name, String sSN, double initDeposit) {
        super(name,sSN,initDeposit);
        accountNumber = "2"+ accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = 0.15 * getBaseRate();

    }

    // List any methods specific to the checking account
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPIN = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo() {
        System.out.println("Account type: Checking Account");
        super.showInfo();
        System.out.println("Your checking account features: " +
                "\nDebit Card number: " + debitCardNumber +
                "\nDebit Card PIN " + debitCardPIN);

    }
}
