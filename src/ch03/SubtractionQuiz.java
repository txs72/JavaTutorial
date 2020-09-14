/*    */ package ch03;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class SubtractionQuiz
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     int number1 = (int)(Math.random() * 10.0D);
/*  9 */     int number2 = (int)(Math.random() * 10.0D);
/*    */ 
/*    */     
/* 12 */     if (number1 < number2) {
/* 13 */       int temp = number1;
/* 14 */       number1 = number2;
/* 15 */       number2 = temp;
/*    */     } 
/*    */ 
/*    */     
/* 19 */     System.out
/* 20 */       .print("What is " + number1 + " - " + number2 + "? ");
/* 21 */     Scanner input = new Scanner(System.in);
/* 22 */     int answer = input.nextInt();
/*    */ 
/*    */     
/* 25 */     if (number1 - number2 == answer) {
/* 26 */       System.out.println("You are correct!");
/*    */     } else {
/* 28 */       System.out.println("Your answer is wrong.");
/* 29 */       System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch03/SubtractionQuiz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */