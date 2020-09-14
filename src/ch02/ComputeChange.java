/*    */ package ch02;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ComputeChange
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 11 */     System.out.print("Enter an amount in double, for example 11.56: ");
/*    */     
/* 13 */     double amount = input.nextDouble();
/*    */     
/* 15 */     int remainingAmount = (int)(amount * 100.0D);
/*    */ 
/*    */     
/* 18 */     int numberOfOneDollars = remainingAmount / 100;
/* 19 */     remainingAmount %= 100;
/*    */ 
/*    */     
/* 22 */     int numberOfQuarters = remainingAmount / 25;
/* 23 */     remainingAmount %= 25;
/*    */ 
/*    */     
/* 26 */     int numberOfDimes = remainingAmount / 10;
/* 27 */     remainingAmount %= 10;
/*    */ 
/*    */     
/* 30 */     int numberOfNickels = remainingAmount / 5;
/* 31 */     remainingAmount %= 5;
/*    */ 
/*    */     
/* 34 */     int numberOfPennies = remainingAmount;
/*    */ 
/*    */     
/* 37 */     System.out.println("Your amount " + amount + " consists of");
/* 38 */     System.out.println("    " + numberOfOneDollars + " dollars");
/* 39 */     System.out.println("    " + numberOfQuarters + " quarters ");
/* 40 */     System.out.println("    " + numberOfDimes + " dimes");
/* 41 */     System.out.println("    " + numberOfNickels + " nickels");
/* 42 */     System.out.println("    " + numberOfPennies + " pennies");
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch02/ComputeChange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */