package org.example;

class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

public class BankTransactionSystem {
    private double balance;

    public BankTransactionSystem(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount > 0) {
            balance += amount;
        }
        else {
            throw new IllegalArgumentException("Amount can't be Zero or negative");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException {
        if(amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }else if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal", amount - balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankTransactionSystem account = new BankTransactionSystem(10000.0);

        try {
            System.out.println("Depositing Rs.5000");
            account.deposit(5000.0);
            System.out.println("New balance: Rs." + account.getBalance());

            System.out.println("Withdrawing Rs.16000");
            account.withdraw(16000.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Shortfall: Rs." + e.getAmount());
        }catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
