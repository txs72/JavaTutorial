/*    */ package ch05;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class GuessNumberOneTime
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     int number = (int)(Math.random() * 101.0D);
/*    */     
/* 10 */     Scanner input = new Scanner(System.in);
/* 11 */     System.out.println("Guess a magic number between 0 and 100");
/*    */ 
/*    */     
/* 14 */     System.out.print("\nEnter your guess: ");
/* 15 */     int guess = input.nextInt();
/*    */     
/* 17 */     if (guess == number) {
/* 18 */       System.out.println("Yes, the number is " + number);
/* 19 */     } else if (guess > number) {
/* 20 */       System.out.println("Your guess is too high");
/*    */     } else {
/* 22 */       System.out.println("Your guess is too low");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/GuessNumberOneTime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */