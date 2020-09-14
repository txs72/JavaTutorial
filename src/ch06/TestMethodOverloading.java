/*    */ package ch06;
/*    */ 
/*    */ 
/*    */ public class TestMethodOverloading
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     System.out.println("The maximum of 3 and 4 is " + 
/*  8 */         max(3, 4));
/*    */ 
/*    */     
/* 11 */     System.out.println("The maximum of 3.0 and 5.4 is " + 
/* 12 */         max(3.0D, 5.4D));
/*    */ 
/*    */     
/* 15 */     System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + 
/* 16 */         max(3.0D, 5.4D, 10.14D));
/*    */   }
/*    */ 
/*    */   
/*    */   public static int max(int num1, int num2) {
/* 21 */     if (num1 > num2) {
/* 22 */       return num1;
/*    */     }
/* 24 */     return num2;
/*    */   }
/*    */ 
/*    */   
/*    */   public static double max(double num1, double num2) {
/* 29 */     if (num1 > num2) {
/* 30 */       return num1;
/*    */     }
/* 32 */     return num2;
/*    */   }
/*    */ 
/*    */   
/*    */   public static double max(double num1, double num2, double num3) {
/* 37 */     return max(max(num1, num2), num3);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/TestMethodOverloading.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */