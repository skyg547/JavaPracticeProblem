package Chapter6;


public class AccountExample {

    public static void main(String[] args) {

        Account account = new Account();

        account.setBalance(10000);

        System.out.println("현재 잔고: " + account.getBalance());


        account.setBalance(-1000);

        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(102222000);

        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(300000);

        System.out.println("현재 잔고: " + account.getBalance());

    }
}
