/*    */ package ch05;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class SubtractionQuizLoop {
/*    */   public static void main(String[] args) {
/*  7 */     int NUMBER_OF_QUESTIONS = 5;
/*  8 */     int correctCount = 0;
/*  9 */     int count = 0;
/* 10 */     long startTime = System.currentTimeMillis();
/* 11 */     String output = "";
/* 12 */     Scanner input = new Scanner(System.in);
/*    */     
/* 14 */     while (count < 5) {
/*    */       
/* 16 */       int number1 = (int)(Math.random() * 10.0D);
/* 17 */       int number2 = (int)(Math.random() * 10.0D);
/*    */ 
/*    */       
/* 20 */       if (number1 < number2) {
/* 21 */         int temp = number1;
/* 22 */         number1 = number2;
/* 23 */         number2 = temp;
/*    */       } 
/*    */ 
/*    */       
/* 27 */       System.out.print("What is " + number1 + " - " + number2 + "? ");
/*    */       
/* 29 */       int answer = input.nextInt();
/*    */ 
/*    */       
/* 32 */       if (number1 - number2 == answer) {
/* 33 */         System.out.println("You are correct!");
/* 34 */         correctCount++;
/*    */       } else {
/*    */         
/* 37 */         System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
/*    */       } 
/*    */ 
/*    */       
/* 41 */       count++;
/*    */       
/* 43 */       output = output + "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? " correct" : " wrong");
/*    */     } 
/*    */ 
/*    */     
/* 47 */     long endTime = System.currentTimeMillis();
/* 48 */     long testTime = endTime - startTime;
/*    */     
/* 50 */     System.out.println("Correct count is " + correctCount + "\nTest time is " + (testTime / 1000L) + " seconds\n" + output);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/SubtractionQuizLoop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */