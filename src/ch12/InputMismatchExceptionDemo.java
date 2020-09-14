/*    */ package ch12;
/*    */ import java.util.InputMismatchException;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class InputMismatchExceptionDemo {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*  8 */     boolean continueInput = true;
/*    */     
/*    */     do {
/*    */       try {
/* 12 */         System.out.print("Enter an integer: ");
/* 13 */         int number = input.nextInt();
/*    */ 
/*    */         
/* 16 */         System.out.println("The number entered is " + number);
/*    */ 
/*    */         
/* 19 */         continueInput = false;
/*    */       }
/* 21 */       catch (InputMismatchException ex) {
/* 22 */         System.out.println("Try again. (Incorrect input: an integer is required)");
/*    */         
/* 24 */         input.nextLine();
/*    */       } 
/* 26 */     } while (continueInput);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/InputMismatchExceptionDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */