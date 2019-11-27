package pt.rumos;

public class Account {

    private double balance;
    private String name;
    private long acctNum;

    //Constructor -- initializes balance, owner, and account number
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }


    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Name:" + name +
                "\nAccount Number: " + acctNum +
                "\nBalance: " + balance;

    }
}
