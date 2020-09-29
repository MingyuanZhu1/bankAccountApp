import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<>();

        List<String[]> newAccountHolder = CSV.read("/Volumes/External SSD/CS Courses/Java Project/" +
                "04 Build a New Bank Account Application/attached files/022 NewBankAccounts.csv");
        for (String [] accountHolder: newAccountHolder) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            // System.out.println(name + " " + sSN + ' ' + accountType + " "+ initDeposit);
            if (accountType.equals("Savings")) {
                accounts.add(new Saving(name,sSN,initDeposit));
            } else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN,initDeposit));
            } else {
                System.out.println("Error!");
            }
        }

        for (Account acc: accounts) {
            System.out.println("\n********************");
            acc.showInfo();
            
        }
    }

}
