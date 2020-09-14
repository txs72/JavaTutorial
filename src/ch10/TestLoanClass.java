/*    */ package ch10;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ public class TestLoanClass
/*    */ {
/*    */   public static void main(String[] args) {
/*  9 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 12 */     System.out.print("Enter yearly interest rate, for example, 8.25: ");
/*    */     
/* 14 */     double annualInterestRate = input.nextDouble();
/*    */ 
/*    */     
/* 17 */     System.out.print("Enter number of years as an integer: ");
/* 18 */     int numberOfYears = input.nextInt();
/*    */ 
/*    */     
/* 21 */     System.out.print("Enter loan amount, for example, 120000.95: ");
/* 22 */     double loanAmount = input.nextDouble();
/*    */ 
/*    */     
/* 25 */     Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
/*    */ 
/*    */ 
/*    */     
/* 29 */     System.out.printf("The loan was created on %s\nThe monthly payment is %.2f\nThe total payment is %.2f\n", new Object[] { loan
/*    */           
/* 31 */           .getLoanDate().toString(), Double.valueOf(loan.getMonthlyPayment()), 
/* 32 */           Double.valueOf(loan.getTotalPayment()) });
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/TestLoanClass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */