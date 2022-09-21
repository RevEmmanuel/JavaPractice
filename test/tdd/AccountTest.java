package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void depositMoneyTest() {
        // (pre-condition) given i have an account
        Account adeolaAccount = new Account();
        // (action) when i deposit 3000
        adeolaAccount.deposit(3000);
        // (assert) check that my balance increases by 3000
        int balance = adeolaAccount.getBalance();
            assertEquals(3000, balance);
    }
    @Test
    public void negativeDepositShouldNotWorkTest () {
        // (pre-condition) given i have an account
        // and given that my balance is 10000
        Account adeolaAccount = new Account();
        adeolaAccount.deposit(10000);
        assertEquals(10000, adeolaAccount.getBalance());
        // (action) when i deposit -5000
        adeolaAccount.deposit(-5000);
        // (assert) check that balance is 10000
        assertEquals(10000, adeolaAccount.getBalance());
    }

    @Test
    public void withdrawMoneyffTest() {
        // (pre-condition) given i have an account
        // and given that my balance is 15000
        Account adeolaAccount = new Account();
        adeolaAccount.deposit(15000);
        assertEquals(15000, adeolaAccount.getBalance());
        // (action) when i withdraw 7000
        adeolaAccount.withdraw(7000);
        // (assert) check that balance is 8000
        assertEquals(8000, adeolaAccount.getBalance());
    }


    @Test
    public void cannotWithdrawAboveBalance() {
        // (pre-condition) given i have an account
        // and given that my balance is 5000
        Account adeolaAccount = new Account();
        adeolaAccount.deposit(5000);
        assertEquals(5000, adeolaAccount.getBalance());
        // (action) when i withdraw 7000
        adeolaAccount.withdraw(7000);
        // (assert) check that balance is 5000
        assertEquals(5000, adeolaAccount.getBalance());
    }

}