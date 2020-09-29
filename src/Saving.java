public class Saving extends Account{
    // List of properties specific to the saving account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize saving account properties
    public Saving(String name, String sSN, double initDeposit) {
        super(name,sSN,initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * 1000);
        safetyDepositBoxKey = (int) (Math.random() * 10000);
    }

    // List any methods specific to the checking account

    public void showInfo() {
        System.out.println("Account type: Saving Account");
        super.showInfo();
        System.out.println(
                "Your saving Account Features: " +
                        "\nSafety Deposit Box Id: " + safetyDepositBoxID +
                "\nSafety Deposit Box key: " + safetyDepositBoxKey);
    }
}
