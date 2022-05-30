package com.bellafkih.bankaccountkataapi.service;
import com.bellafkih.bankaccountkataapi.model.Account;
import com.bellafkih.bankaccountkataapi.model.Transaction;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class AccountServiceTest {

    @Test
    public void testDeposit() {
        Account account = new Account("BELLAFKIH Fatima");
        Transaction t = new Transaction(100, "Deposit");
        float currentAmount = account.getBalance() + t.getAmount();
        account.getHistory().add(t);
        account.setBalance(currentAmount);
        t.setBalance(currentAmount);
        assertThat(account.getHistory().size()).isGreaterThan(0);
        assertThat(account.getBalance()).isEqualTo(currentAmount);
        assertThat(t.getBalance()).isEqualTo(currentAmount);
    }

    @Test
    public void testWithdrawal() {
        Account account = new Account("BELLAFKIH Fatima");
        Transaction t = new Transaction(100, "withdrawal");
        float currentAmount = account.getBalance() - t.getAmount();
        account.getHistory().add(t);
        account.setBalance(currentAmount);
        t.setBalance(currentAmount);
        assertThat(account.getHistory().size()).isGreaterThan(0);
        assertThat(account.getBalance()).isEqualTo(currentAmount);
        assertThat(t.getBalance()).isEqualTo(currentAmount);
    }

}