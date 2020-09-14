/*    */ package ch04;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch04Q21 {
/*    */   public static void main(String[] args) {
/*  7 */     int INVALID_LENGTH = 11;
/*  8 */     Scanner scanner = new Scanner(System.in);
/*  9 */     System.out.print("Enter a SSN: ");
/* 10 */     String ssn = scanner.nextLine();
/*    */     
/* 12 */     if (ssn.length() != 11) {
/* 13 */       System.out.println("Invalid length.");
/* 14 */       System.exit(1);
/*    */     }
/* 16 */     else if (!isNumberValid(ssn)) {
/* 17 */       System.out.println("Invalid number.");
/* 18 */       System.exit(2);
/*    */     }
/* 20 */     else if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
/* 21 */       System.out.println("Invalid separator.");
/* 22 */       System.exit(3);
/*    */     } 
/* 24 */     System.out.println(ssn + " is a valid social security number.");
/*    */   }
/*    */   
/*    */   public static boolean isNumberValid(String ssn) {
/* 28 */     boolean b = true;
/* 29 */     int[] pos = { 0, 1, 2, 4, 5, 7, 8, 9, 10 };
/* 30 */     for (int i = 0; i < pos.length; i++) {
/* 31 */       if (!Character.isDigit(ssn.charAt(pos[i]))) {
/* 32 */         b = false;
/*    */         break;
/*    */       } 
/*    */     } 
/* 36 */     return b;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch04/Ch04Q21.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */