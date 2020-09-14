/*    */ package ch05;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class RepeatAdditionQuiz {
/*    */   public static void main(String[] args) {
/*  7 */     int number1 = (int)(Math.random() * 10.0D);
/*  8 */     int number2 = (int)(Math.random() * 10.0D);
/*    */ 
/*    */     
/* 11 */     Scanner input = new Scanner(System.in);
/*    */     
/* 13 */     System.out.print("What is " + number1 + " + " + number2 + "? ");
/*    */     
/* 15 */     int answer = input.nextInt();
/*    */     
/* 17 */     while (number1 + number2 != answer) {
/* 18 */       System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
/*    */       
/* 20 */       answer = input.nextInt();
/*    */     } 
/*    */     
/* 23 */     System.out.println("You got it!");
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/RepeatAdditionQuiz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */