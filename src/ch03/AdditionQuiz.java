/*    */ package ch03;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class AdditionQuiz {
/*    */   public static void main(String[] args) {
/*  7 */     int number1 = (int)(System.currentTimeMillis() % 10L);
/*  8 */     int number2 = (int)(System.currentTimeMillis() / 7L % 10L);
/*    */ 
/*    */     
/* 11 */     Scanner input = new Scanner(System.in);
/*    */     
/* 13 */     System.out.print("What is " + number1 + " + " + number2 + "? ");
/*    */ 
/*    */     
/* 16 */     int answer = input.nextInt();
/*    */     
/* 18 */     System.out.println(number1 + " + " + number2 + " = " + answer + " is " + ((number1 + number2 == answer) ? 1 : 0));
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch03/AdditionQuiz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */