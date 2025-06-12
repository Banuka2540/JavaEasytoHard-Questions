//4. 🔄 Bank Account Class
//Create a BankAccount class with private fields: accountNumber, balance.
//Only allow balance updates via deposit(double amount) and withdraw(double amount) methods.
//Don’t allow withdrawal if the balance isn’t enough. Print "Insufficient funds".


package JavaEncapsulations.Exercise4;
import java.util.Scanner;
public class Exercise34 {
    public static void main(String[] args){
    BankAccount b1 = new BankAccount();
    Scanner input = new Scanner(System.in);

    b1.getBalance();

    System.out.print("Enter amount to deposit : ");
    double depo = input.nextDouble();
    b1.deposit(depo);

    System.out.print("Enter amount to Withdraw : ");
    double with = input.nextDouble();
    b1.withdrawal(with);

    b1.AfterDeposit();
    }
}
