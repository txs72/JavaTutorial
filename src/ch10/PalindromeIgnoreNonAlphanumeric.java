/*    */ package ch10;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ public class PalindromeIgnoreNonAlphanumeric
/*    */ {
/*    */   public static void main(String[] args) {
/*  9 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 12 */     System.out.print("Enter a string: ");
/* 13 */     String s = input.nextLine();
/*    */ 
/*    */     
/* 16 */     System.out.println("Ignoring non-alphanumeric characters, \nis " + s + " a palindrome? " + 
/* 17 */         isPalindrome(s));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean isPalindrome(String s) {
/* 23 */     String s1 = filter(s);
/*    */ 
/*    */     
/* 26 */     String s2 = reverse(s1);
/*    */ 
/*    */     
/* 29 */     return s2.equals(s1);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static String filter(String s) {
/* 35 */     StringBuilder stringBuilder = new StringBuilder();
/*    */ 
/*    */     
/* 38 */     for (int i = 0; i < s.length(); i++) {
/* 39 */       if (Character.isLetterOrDigit(s.charAt(i))) {
/* 40 */         stringBuilder.append(s.charAt(i));
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 45 */     return stringBuilder.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   public static String reverse(String s) {
/* 50 */     StringBuilder stringBuilder = new StringBuilder(s);
/* 51 */     stringBuilder.reverse();
/* 52 */     return stringBuilder.toString();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/PalindromeIgnoreNonAlphanumeric.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */