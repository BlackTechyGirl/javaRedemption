package chapterThree;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Martha", 5000);
         account.withdraw(500);
        System.out.println(account.getBalance());
    }
}
