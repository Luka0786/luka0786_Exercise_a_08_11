package Kap8Exercise11;

public class BankAccount
{
    String name;
    double balance;
    double transactionsFee = 0;

    public BankAccount(String name)
    {
        this.name = name;
    }

    public void deposit(double amount)
    {
        this.balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        if (balance - amount - transactionsFee > 0)
        {
            balance = balance - amount - transactionsFee;
        }
        if (balance - amount <= 0)
        {
            System.out.println("You can't withdraw, not enough money");
        }
        if (balance - (amount + transactionsFee) <= 0)
        {
        }

    }

    public void setTransactionsFee(double transactionsFee)
    {
        this.transactionsFee = transactionsFee;
    }
}
