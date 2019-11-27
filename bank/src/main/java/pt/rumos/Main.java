package pt.rumos;


public class Main
{
    public static void main(String[] args) {

        Account bank1 = new Account();
        Account bank2 = new Account();

        bank1.setBalance();
        bank2.setBalance();

        double x = 100.00;
        System.out.println("Acc 1 previous balance: " + bank1.getBalance());
        System.out.println("Acc 2 previous balance: " + bank2.getBalance());
        bank1.transferTo(bank2, x);


        System.out.println("Acc 1 new balance: " + bank1.getBalance());
        System.out.println("Acc 2 new balance: " + bank2.getBalance());


    }
}
