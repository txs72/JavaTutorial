/*    */ package ch02;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class DisplayTime {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*    */     
/*  9 */     System.out.print("Enter an integer for seconds: ");
/* 10 */     int seconds = input.nextInt();
/*    */     
/* 12 */     int minutes = seconds / 60;
/* 13 */     int remainingSeconds = seconds % 60;
/* 14 */     System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch02/DisplayTime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */