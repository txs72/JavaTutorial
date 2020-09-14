/*    */ package ch04;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class HexDigit2Dec {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*  8 */     System.out.print("Enter a hex digit: ");
/*  9 */     String hexString = input.nextLine();
/*    */ 
/*    */     
/* 12 */     if (hexString.length() != 1) {
/* 13 */       System.out.println("You must enter exactly one character");
/* 14 */       System.exit(1);
/*    */     } 
/*    */ 
/*    */     
/* 18 */     char ch = Character.toUpperCase(hexString.charAt(0));
/* 19 */     if (ch <= 'F' && ch >= 'A') {
/* 20 */       int value = ch - 65 + 10;
/* 21 */       System.out.println("The decimal value for hex digit " + ch + " is " + value);
/*    */     
/*    */     }
/* 24 */     else if (Character.isDigit(ch)) {
/* 25 */       System.out.println("The decimal value for hex digit " + ch + " is " + ch);
/*    */     }
/*    */     else {
/*    */       
/* 29 */       System.out.println(ch + " is an invalid input");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch04/HexDigit2Dec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */