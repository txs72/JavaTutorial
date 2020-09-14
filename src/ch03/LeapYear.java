/*    */ package ch03;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class LeapYear
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     Scanner input = new Scanner(System.in);
/*  9 */     System.out.print("Enter a year: ");
/* 10 */     int year = input.nextInt();
/*    */ 
/*    */     
/* 13 */     boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
/*    */ 
/*    */ 
/*    */     
/* 17 */     System.out.println(year + " is a leap year? " + isLeapYear);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch03/LeapYear.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */