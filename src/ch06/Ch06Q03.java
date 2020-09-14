/*    */ package ch06;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch06Q03 {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner scanner = new Scanner(System.in);
/*  8 */     System.out.print("Please input a number: ");
/*  9 */     int number = scanner.nextInt();
/*    */     
/* 11 */     if (isPalindrome(number)) {
/* 12 */       System.out.println(number + " is a palindrome.");
/*    */     } else {
/*    */       
/* 15 */       System.out.println(number + " is NOT a palindrome.");
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static int reverse(int number) {
/* 22 */     int rv = 0;
/* 23 */     while (number != 0) {
/* 24 */       rv *= 10;
/* 25 */       rv += number % 10;
/* 26 */       number /= 10;
/*    */     } 
/* 28 */     return rv;
/*    */   }
/*    */   
/*    */   public static boolean isPalindrome(int number) {
/* 32 */     if (number == reverse(number)) {
/* 33 */       return true;
/*    */     }
/* 35 */     return false;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/Ch06Q03.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */