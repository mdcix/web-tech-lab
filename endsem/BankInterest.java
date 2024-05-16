Savings Account

class SavingsAccount{
    static double annualInterest = 0;
    private double savingsBalance = 0;

    public double getbal(){
        return savingsBalance;
    }

    public void setbal(double x){
        savingsBalance = x;
    }

    public int calculateMonthlyInterest(){
        int interest = (int)((annualInterest*savingsBalance)/12);
        return interest;
    }

    public static void modifyInterestRate(double x){
        annualInterest = x;
    }

}

public class BankInterest{
    public static void main(String args[]){
        double bal1, bal2, intrst1, intrst2;
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.setbal(2000);
        saver2.setbal(3000);
        SavingsAccount.modifyInterestRate(4);
        bal1 = saver1.getbal();
        bal2 = saver2.getbal();
        System.out.println("saver1 = "+bal1);
        System.out.println("saver2 = "+bal2);

        intrst1 = saver1.calculateMonthlyInterest();
        intrst2 = saver2.calculateMonthlyInterest();
        System.out.println("\nInterest Rate = "+SavingsAccount.annualInterest);
        intrst1 = saver1.calculateMonthlyInterest();
        intrst2 = saver2.calculateMonthlyInterest();
        bal1 = saver1.getbal() + intrst1;
        bal2 = saver2.getbal() + intrst2;
        saver1.setbal(bal1);
        saver2.setbal(bal2);
        System.out.println("Interest saver1 = "+intrst1);
        System.out.println("New Balance saver1 = "+bal1);
        System.out.println("Interest saver2 = "+intrst2);
        System.out.println("New Balance saver2 = "+bal2);

        SavingsAccount.modifyInterestRate(5);
        System.out.println("Interest Rate = "+SavingsAccount.annualInterest);
        intrst1 = saver1.calculateMonthlyInterest();
        intrst2 = saver2.calculateMonthlyInterest();
        bal1 = saver1.getbal() + intrst1;
        bal2 = saver2.getbal() + intrst2;
        System.out.println("Interest saver1 = "+intrst1);
        System.out.println("New Balance saver1 = "+bal1);
        System.out.println("Interest saver2 = "+intrst2);
        System.out.println("New Balance saver2 = "+bal2);
    }
}