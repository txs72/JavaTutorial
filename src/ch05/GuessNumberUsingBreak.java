/*    */ package ch05;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class GuessNumberUsingBreak
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     int number = (int)(Math.random() * 101.0D);
/*    */     
/* 10 */     Scanner input = new Scanner(System.in);
/* 11 */     System.out.println("Guess a magic number between 0 and 100");
/*    */ 
/*    */     
/*    */     while (true) {
/* 15 */       System.out.print("\nEnter your guess: ");
/* 16 */       int guess = input.nextInt();
/*    */       
/* 18 */       if (guess == number) {
/* 19 */         System.out.println("Yes, the number is " + number);
/*    */         break;
/*    */       } 
/* 22 */       if (guess > number) {
/* 23 */         System.out.println("Your guess is too high"); continue;
/*    */       } 
/* 25 */       System.out.println("Your guess is too low");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/GuessNumberUsingBreak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */