public abstract class Account implements IBaseRate{
    // List common properties for saving and checking accounts
    private String name;
    private String sSN;
    private double balance;
    private static int index = 1000;

    protected String accountNumber;
    protected double rate;


    // Constructor to set base properties
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void showInfo() {
        System.out.println(
                "Name: " +name +
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance +
                "\nRate " + rate + "%"
        );
    }

    public void compound() {
        double accruedInterest = balance * (rate/100);
        System.out.println("Accrued Interest: " + accruedInterest);
        balance +=accruedInterest;
        printBalance();
    }

    // List of common methods
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing " + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawing " + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transferring to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now " + balance);
    }
}
