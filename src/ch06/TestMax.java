/*    */ package ch06;
/*    */ 
/*    */ public class TestMax
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     int i = 5;
/*  7 */     int j = 2;
/*  8 */     int k = max(i, j);
/*  9 */     System.out.println("The maximum between " + i + " and " + j + " is " + k);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static int max(int num1, int num2) {
/*    */     int result;
/* 17 */     if (num1 > num2) {
/* 18 */       result = num1;
/*    */     } else {
/* 20 */       result = num2;
/*    */     } 
/* 22 */     return result;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/TestMax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */