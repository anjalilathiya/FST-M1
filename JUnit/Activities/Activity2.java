package activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {

    @Test
    void notEnoughFunds() {
        BankAccount bankAccount = new BankAccount(10);
        assertThrows(NotEnoughFundsException.class, ()->bankAccount.withdraw(100), "Balance is less than withdrawal amount");
    }

    @Test
    void enoughFunds() {
        BankAccount bankAccount = new BankAccount(100);
        assertDoesNotThrow(()->bankAccount.withdraw(90));
    }
}
