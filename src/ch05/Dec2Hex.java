/*    */ package ch05;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ public class Dec2Hex
/*    */ {
/*    */   public static void main(String[] args) {
/*  9 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 12 */     System.out.print("Enter a decimal number: ");
/* 13 */     int decimal = input.nextInt();
/*    */ 
/*    */     
/* 16 */     String hex = "";
/*    */     
/* 18 */     while (decimal != 0) {
/* 19 */       int hexValue = decimal % 16;
/*    */ 
/*    */       
/* 22 */       char hexDigit = (hexValue <= 9 && hexValue >= 0) ? (char)(hexValue + 48) : (char)(hexValue - 10 + 65);
/*    */ 
/*    */       
/* 25 */       hex = hexDigit + hex;
/* 26 */       decimal /= 16;
/*    */     } 
/*    */     
/* 29 */     System.out.println("The hex number is " + hex);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/Dec2Hex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */