package db.edu.diu;

public class Account {
    private int accNo;
    private String title;
    private double balance;
    public int getAccNo() {
        return accNo;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
    this.balance+=amount;
}

    public void withdrown(double amount){
    this.balance=amount;
}
public void show(){
    System.out.println("acc no "+accNo);
    System.out.println("Title "+title);
    System.out.println("Balance "+balance);

}
}