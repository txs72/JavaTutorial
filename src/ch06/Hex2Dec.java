/*    */ package ch06;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ public class Hex2Dec
/*    */ {
/*    */   public static void main(String[] args) {
/*  9 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 12 */     System.out.print("Enter a hex number: ");
/* 13 */     String hex = input.nextLine();
/*    */     
/* 15 */     System.out.println("The decimal value for hex number " + hex + " is " + 
/* 16 */         hexToDecimal(hex.toUpperCase()));
/*    */   }
/*    */   
/*    */   public static int hexToDecimal(String hex) {
/* 20 */     int decimalValue = 0;
/* 21 */     for (int i = 0; i < hex.length(); i++) {
/* 22 */       char hexChar = hex.charAt(i);
/* 23 */       decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
/*    */     } 
/*    */     
/* 26 */     return decimalValue;
/*    */   }
/*    */   
/*    */   public static int hexCharToDecimal(char ch) {
/* 30 */     if (ch >= 'A' && ch <= 'F') {
/* 31 */       return 10 + ch - 65;
/*    */     }
/* 33 */     return ch - 48;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/Hex2Dec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */