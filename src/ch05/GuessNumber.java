/*    */ package ch05;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class GuessNumber
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     int number = (int)(Math.random() * 101.0D);
/*    */     
/* 10 */     Scanner input = new Scanner(System.in);
/* 11 */     System.out.println("Guess a magic number between 0 and 100");
/*    */     
/* 13 */     int guess = -1;
/* 14 */     while (guess != number) {
/*    */       
/* 16 */       System.out.print("\nEnter your guess: ");
/* 17 */       guess = input.nextInt();
/*    */       
/* 19 */       if (guess == number) {
/* 20 */         System.out.println("Yes, the number is " + number); continue;
/* 21 */       }  if (guess > number) {
/* 22 */         System.out.println("Your guess is too high"); continue;
/*    */       } 
/* 24 */       System.out.println("Your guess is too low");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/GuessNumber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */