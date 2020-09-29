public abstract class Account implements IBaseRate{
    // List common properties for saving and checking accounts
    String name;
    String sSN;
    double balance;
    static int index = 1000;

    String accountNumber;
    double rate;


    // Constructor to set base properties
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        System.out.println("Name " + name + " SSN" +sSN+ " Balance " + balance);

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
        System.out.println("account number" + this.accountNumber);

    }

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // List of common methods

}
