package Control_Structures.Assignments.Assignment_5;

import java.util.Scanner;

public class Tester {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int accountNumber=0;
        double accountBalance=0;
        double salary=0;
        String loanType=null;
        @SuppressWarnings("unused")
        double expectedLoanAmount=0;
        @SuppressWarnings("unused")
        int expectedEMIs=0;
        double eligibleLoanAmount=0;
        int eligibleEMIs=0;

        System.out.println("Customer Details / Requirement:- ");

        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        System.out.println();

        System.out.print("Enter account balance: ");
        accountBalance = sc.nextDouble();
        System.out.println();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        System.out.println();

        System.out.print("Enter loan type: ");
        loanType = sc.next();
        System.out.println();

        System.out.print("Enter expected loan amount: ");
        expectedLoanAmount = sc.nextDouble();
        System.out.println();

        System.out.print("Enter expected EMI's: ");
        expectedEMIs = sc.nextInt();
        System.out.println();

        if(!(accountNumber>=1000 && accountNumber<=1999 && accountBalance>=1000 )){
            System.out.println("Invalid input!!!");
        }
        else{
            if(salary>25000 && salary<50000){
                loanType="Car";
                eligibleLoanAmount=500000;
                eligibleEMIs=36;
            }
            else if(salary>50000 && salary<75000){
                loanType="House";
                eligibleLoanAmount=6000000;
                eligibleEMIs=60;
            }
            else if(salary>75000){
                loanType="Business";
                eligibleLoanAmount=7500000;
                eligibleEMIs=84;
            }
        }

        System.out.println("Bank's Quatation:-");
        System.out.println("*******************");
        System.out.println("Eligible Loan Type:- "+loanType);
        System.out.println("Eligible amount:- "+eligibleLoanAmount);
        System.out.println("Eligible EMIs:- "+eligibleEMIs);

        sc.close();
    }
    
}
