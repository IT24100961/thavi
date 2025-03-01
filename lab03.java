package lab03;

import java.util.Scanner;

public class SavingAccount {
    private String accountNum;
    private String accountHoldername;
    private double balance;

    public SavingAccount(String accountNum, String accountHoldername , double initialdeposit) {
        this.accountNum = accountNum;
        this.accountHoldername = accountHoldername;
        this.balance = initialdeposit;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getAccountHoldername() {
        return accountHoldername;
    }

    public double getbalance() {
        return balance;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;

    }

    public void getAccountHoldername(String accountHoldername) {
        this.accountHoldername = accountHoldername;

    }

        public void deposit(double ammount){
        if (ammount>0 ){
            balance = balance + ammount;
            System.out.println("Deposited ammount is " + ammount );
        }

        }

        public void withdraw ( double amount){
            if (amount > 0 && amount <= balance){
                balance = balance * amount;
                System.out.println("Withdraw :" + amount + "New Balance : " + balance);
            }
            else {
                System.out.println("Insufficient balance");
            }
        }

        public void displayAccountDetails(){
            System.out.println("Account Number " + accountNum);
            System.out.println("Account Holder Name: " + accountHoldername);
            System.out.println("Balance : " + balance);
        }
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

        System.out.println("Enter Account Number :");
        int accnum = input.nextInt();

        System.out.println("Enter Account Holder Name: ");
        String accountHolder = input.nextLine();

        System.out.println("Enter initial Deposit: ");
        double initialdeposit = input.nextDouble();

        System.out.println("Enter Withdraw Ammount: ");
        double Withdraw = input.nextDouble();


    }
}
