/*    */ package ch06;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch06Q18 {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner scanner = new Scanner(System.in);
/*  8 */     System.out.print("Please input a password: ");
/*  9 */     String password = scanner.nextLine();
/* 10 */     if (MyRules.isLengthValid(password) && 
/* 11 */       MyRules.isCharValid(password) && 
/* 12 */       MyRules.isNumOfNumsValid(password)) {
/* 13 */       System.out.println("Valid password");
/*    */     } else {
/* 15 */       System.out.println("Invalid password");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/Ch06Q18.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */