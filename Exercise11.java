package Kap8Exercise11;

import java.util.Scanner;

public class Exercise11
{
    /*
    Add a field to the BankAccount class named transactionFee for a real number
    representing an amount of money to deduct every time the user withdraws money.
    The default value is $0.00, but the client can change the value.
    Deduct the transaction fee money during every withdraw call (but not from deposits).
    Make sure that the balance cannot go negative during a withdrawal.
    If the withdrawal (amount plus transaction fee) would cause it to become
    negative, don’t modify the balance at all.
    */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BankAccount bank = new BankAccount("Lukas");
        boolean run = true;

        while (run)
        {
            System.out.println("The menu:\n" +
                    "1. Deposit money\n" +
                    "2. Withdraw money\n" +
                    "3. Set transactions fee\n" +
                    "4. Exit");

            String choice = input.next();

            switch (choice)
            {
                case "1":
                    System.out.println("Enter amount to deposit:");
                    double amountDeposit = input.nextDouble();
                    bank.deposit(amountDeposit);
                    System.out.println("The balance is now " + bank.balance);
                    break;

                case "2":
                    System.out.println("Enter amount to withdraw:");
                    double amountWithdraw = input.nextDouble();
                    bank.withdraw(amountWithdraw);
                    System.out.println("The balance is now " + bank.balance);
                    break;

                case "3":
                    System.out.println("Enter the transaction fee:");
                    double setFee = input.nextDouble();
                    bank.setTransactionsFee(setFee);
                    System.out.println("The new transaction fee is " + setFee);
                    break;

                case "4":
                    run = false;
            }
        }
    }
}
