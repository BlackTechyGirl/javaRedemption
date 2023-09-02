import chapterThree.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.Test;

public class AccountTest{
    Account account;

    @BeforeEach
    public void setUp(){
        account = new Account("Martha", 1000);
    }
    @Test
    void testDeposit(){
        account.deposit(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdraw(){
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }
    @Test
    void testThatUserEnterInvalidInput(){
        account.withdraw(500);
        account.withdraw(-500);
        assertEquals(500, account.getBalance());
    }

}