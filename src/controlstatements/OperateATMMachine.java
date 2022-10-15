package controlstatements;

import java.util.Scanner;

public class OperateATMMachine {
    public static void main(String[] args) {

        int balance = 10000;
        int withdraw;
        int deposit;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Welcome to ATM machine~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n" +
                "-----------Please wait while we are processing your card--------------\n .\n . \n" + "Enter your pin");

        Scanner scanner = new Scanner(System.in);
        int pin = scanner.nextInt();
        while(true) {
            if(pin >0){
                System.out.println("Choose your options");
                System.out.println("1. Balance enquiry");
                System.out.println("2.Amount Withdrawal");
                System.out.println("3. Amount Deposit");
                System.out.println("4. Exit");
                int option = scanner.nextInt();
                switch (option){
                    case 1:
                        System.out.println(balance);
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw");
                        withdraw = scanner.nextInt();
                        balance = balance-withdraw;
                        System.out.println("Withdrawal amount is " + withdraw);
                        break;
                    case 3:
                        System.out.println("Enter the amount to deposit");
                        deposit = scanner.nextInt();
                        balance = balance + deposit;
                        System.out.println("Deposited amount is " + deposit);
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Choose the right option");
                        break;
                }
            }else {
                System.out.println("Enter the proper pin");
                pin = scanner.nextInt();
            }

        }

    }
}
