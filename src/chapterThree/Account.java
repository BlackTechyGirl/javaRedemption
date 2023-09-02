package chapterThree;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance>0.0){
            this.balance = balance;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void deposit(double amount) {
        if(amount>0.0){
            balance+=amount;
        }
    }
    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if(amount>0.0 && amount <= balance){
            balance -= amount;
        }else if(amount>balance){
            System.out.println("Withdrawal amount exceeded account balance");
        }else{
            System.out.println("Invalid input");
        }
    }
}
