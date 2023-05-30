import chapterThree.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.Test;

public class AccountTest{
    private Account account;

    @BeforeEach
    public void setThisUp(){
        account = new Account("Martha", 5000);
    }

    @Test
    void testThatICanDeposit(){
        account.deposit(500);
        assertEquals(5500, account.getBalance());

    }
    @Test
    void testThatICanWithdraw(){
        account.withdraw(4500);
        assertEquals(500, account.getBalance());
    }



}