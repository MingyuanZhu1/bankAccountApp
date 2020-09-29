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
                "\nRate " + rate

        );
    }

    // List of common methods

}
