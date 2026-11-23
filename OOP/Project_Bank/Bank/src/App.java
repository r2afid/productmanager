import db.edu.diu.Account;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Account account =new Account();
        account.show();
        account.setAccNo(1001);
        account.setTitle("test");
        account.show();
        account.deposit(10000);
        account.show();
        account.withdrown(5000);
        account.show();
    }
}
