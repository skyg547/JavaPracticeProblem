package Chapter6;

public class Account {
    public static final int MAX_BALANCE = 1000000;
    public static final int MIN_BALANCE = 0;

    private int balance;


    public Account() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

        if (balance > MAX_BALANCE) {
            balance = this.balance;
        } else if (balance < MIN_BALANCE) {
            balance = this.balance;
        }

        this.balance = balance;
    }
}
