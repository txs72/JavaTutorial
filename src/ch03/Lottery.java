/*    */ package ch03;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Lottery
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     int lottery = (int)(Math.random() * 100.0D);
/*    */ 
/*    */     
/* 11 */     Scanner input = new Scanner(System.in);
/* 12 */     System.out.print("Enter your lottery pick (two digits): ");
/* 13 */     int guess = input.nextInt();
/*    */ 
/*    */     
/* 16 */     int lotteryDigit1 = lottery / 10;
/* 17 */     int lotteryDigit2 = lottery % 10;
/*    */ 
/*    */     
/* 20 */     int guessDigit1 = guess / 10;
/* 21 */     int guessDigit2 = guess % 10;
/*    */     
/* 23 */     System.out.println("The lottery number is " + lottery);
/*    */ 
/*    */     
/* 26 */     if (guess == lottery) {
/* 27 */       System.out.println("Exact match: you win $10,000");
/* 28 */     } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
/*    */       
/* 30 */       System.out.println("Match all digits: you win $3,000");
/* 31 */     } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
/*    */ 
/*    */ 
/*    */       
/* 35 */       System.out.println("Match one digit: you win $1,000");
/*    */     } else {
/* 37 */       System.out.println("Sorry, no match");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch03/Lottery.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */