
public class BankAccount {
    private double Balance;

    public BankAccount()
    {
        // this (0);
        Balance=0;
    }
    public BankAccount(double initialBalance)
    {
        Balance=initialBalance;
    }
    public void deposit (double balance)
    {
        this.Balance=this.Balance+balance;
    }
    public void withdraw(double balance)
    {
        this.Balance=this.Balance-balance;
    }
    public  double getBalance()
    {
        return Balance;
    }
}
