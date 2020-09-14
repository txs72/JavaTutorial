/*    */ package ch02;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ComputeLoan
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 11 */     System.out.print("Enter yearly interest rate, for example 8.25: ");
/* 12 */     double annualInterestRate = input.nextDouble();
/*    */ 
/*    */     
/* 15 */     double monthlyInterestRate = annualInterestRate / 1200.0D;
/*    */ 
/*    */     
/* 18 */     System.out.print("Enter number of years as an integer, for example 5: ");
/*    */     
/* 20 */     int numberOfYears = input.nextInt();
/*    */ 
/*    */     
/* 23 */     System.out.print("Enter loan amount, for example 120000.95: ");
/* 24 */     double loanAmount = input.nextDouble();
/*    */ 
/*    */ 
/*    */     
/* 28 */     double monthlyPayment = loanAmount * monthlyInterestRate / (1.0D - 1.0D / Math.pow(1.0D + monthlyInterestRate, (numberOfYears * 12)));
/* 29 */     double totalPayment = monthlyPayment * numberOfYears * 12.0D;
/*    */ 
/*    */     
/* 32 */     System.out.println("The monthly payment is $" + ((int)(monthlyPayment * 100.0D) / 100.0D));
/*    */     
/* 34 */     System.out.println("The total payment is $" + ((int)(totalPayment * 100.0D) / 100.0D));
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch02/ComputeLoan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */