package pt.rumos;


public class Main
{
    public static void main( String[] args ){

        Account acc1 = new Account(500, "jorge", 1 );
        Account acc2 = new Account(1000, "arthur", 2);

        System.out.println("Jorge balance before: " + acc1.getBalance());
        System.out.println("Arthur balance before: " + acc2.getBalance());

        acc1.withdraw(100);

        System.out.println(acc1.getBalance());

    }
}
