/*    */ package ch04;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch04Q08 {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner scanner = new Scanner(System.in);
/*  8 */     System.out.println("Enter ASCII code: ");
/*  9 */     String s = scanner.nextLine();
/* 10 */     int i = Integer.parseInt(s);
/* 11 */     if (i < 0 || i > 127) {
/* 12 */       System.out.println("Invalid input.");
/* 13 */       System.exit(1);
/*    */     } 
/* 15 */     System.out.println("The character for ASCII code " + i + " is " + (char)i);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch04/Ch04Q08.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */