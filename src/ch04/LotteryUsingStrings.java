/*    */ package ch04;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ public class LotteryUsingStrings
/*    */ {
/*    */   public static void main(String[] args) {
/*  9 */     String lottery = "" + (int)(Math.random() * 10.0D) + (int)(Math.random() * 10.0D);
/*    */ 
/*    */     
/* 12 */     Scanner input = new Scanner(System.in);
/* 13 */     System.out.print("Enter your lottery pick (two digits): ");
/* 14 */     String guess = input.nextLine();
/*    */ 
/*    */     
/* 17 */     int lotteryDigit1 = lottery.charAt(0);
/* 18 */     int lotteryDigit2 = lottery.charAt(1);
/*    */ 
/*    */     
/* 21 */     int guessDigit1 = guess.charAt(0);
/* 22 */     int guessDigit2 = guess.charAt(1);
/*    */     
/* 24 */     System.out.println("The lottery number is " + lottery);
/*    */ 
/*    */     
/* 27 */     if (guess.equals(lottery)) {
/* 28 */       System.out.println("Exact match: you win $10,000");
/* 29 */     } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
/*    */       
/* 31 */       System.out.println("Match all digits: you win $3,000");
/* 32 */     } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
/*    */ 
/*    */ 
/*    */       
/* 36 */       System.out.println("Match one digit: you win $1,000");
/*    */     } else {
/* 38 */       System.out.println("Sorry, no match");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch04/LotteryUsingStrings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */