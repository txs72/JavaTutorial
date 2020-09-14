/*    */ package ch05;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ public class SentinelValue
/*    */ {
/*    */   public static void main(String[] args) {
/*  9 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 12 */     System.out.print("Enter an integer (the input ends if it is 0): ");
/*    */     
/* 14 */     int data = input.nextInt();
/*    */ 
/*    */     
/* 17 */     int sum = 0;
/* 18 */     while (data != 0) {
/* 19 */       sum += data;
/*    */ 
/*    */       
/* 22 */       System.out.print("Enter an integer (the input ends if it is 0): ");
/*    */       
/* 24 */       data = input.nextInt();
/*    */     } 
/*    */     
/* 27 */     System.out.println("The sum is " + sum);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/SentinelValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */