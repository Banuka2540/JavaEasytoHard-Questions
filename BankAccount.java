package JavaEncapsulations.Exercise4;

public class BankAccount {
    private int accountNumber;
    private double balance = 0;
    double deposit;
    double withdrawal;


    void getBalance(){
        System.out.println("Current balance is: " + balance);
    }
    void deposit(double deposit){
        this.deposit = deposit;
        balance += deposit;
    }

    void withdrawal(double withdrawal){
        this.withdrawal = withdrawal;
        if (withdrawal>balance){
            System.out.println("Insufficient Balance");
        }else{
            balance -= withdrawal;
            System.out.println("your Withdrawal is : " + withdrawal);
        }
    }
    void AfterDeposit(){
        System.out.println("Your bank balance is : " + balance);
    }
}
