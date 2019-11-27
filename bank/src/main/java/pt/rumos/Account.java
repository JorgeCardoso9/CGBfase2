package pt.rumos;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public Account(int account, double balance) {
        this.balance = balance;
    }

    public Account() {
        balance = 0.0;
    }


    public void setBalance() {
        balance = Math.random() * 1000;
        balance = Math.round((balance * 100.0)+.5) / 100.0;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        balance = Math.round((balance * 100.0)+.5) / 100.0;
        return balance;
    }

    public void close() {
        balance = 0.0;
    }

    public void transferTo(Account bank, double x) {
        if (x <= this.balance) {
            withdraw(x);
            bank.deposit(x);
            System.out.println("Transfer succesful. Tansfered: $" + x);
            System.out.println("Transfer failed. Not enough balance!");
        }
    }
}