public class BankAccountApp {

    public static void main(String[] args) {
         Checking chkacc1 = new Checking("maike","123",1231331);
         chkacc1.showInfo();
        System.out.println("***************");
        // Read a CVS file then create new accounts based on that data

         Saving acc1  = new Saving("mai","111",11111);
         acc1.showInfo();

    }

}
