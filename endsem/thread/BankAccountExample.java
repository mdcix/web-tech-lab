class BankAccount {
    private int balance; 

    public BankAccount(int initialBalance) { //Constructor to initialise balance
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) { //synchronised used to lock variables
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {                    //if balance > amount -> withdraw, else error
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal: " + amount + " | Current Balance: " + balance);
        }
    }
}

class DepositThread extends Thread {
    private BankAccount account;    
    private int amount;

    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);    //deposit function from BankAccount class
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private int amount;

    public WithdrawThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);   //withdraw function from BankAccount class
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        DepositThread depositThread1 = new DepositThread(account, 500);
        DepositThread depositThread2 = new DepositThread(account, 300);
        WithdrawThread withdrawThread1 = new WithdrawThread(account, 200);
        WithdrawThread withdrawThread2 = new WithdrawThread(account, 700);

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();
    }
}