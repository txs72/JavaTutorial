/*    */ package ch06;
/*    */ 
/*    */ 
/*    */ public class TestPassByValue
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     int num1 = 1;
/*  8 */     int num2 = 2;
/*    */     
/* 10 */     System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
/*    */ 
/*    */ 
/*    */     
/* 14 */     swap(num1, num2);
/*    */     
/* 16 */     System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void swap(int n1, int n2) {
/* 22 */     System.out.println("\tInside the swap method");
/* 23 */     System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);
/*    */ 
/*    */ 
/*    */     
/* 27 */     int temp = n1;
/* 28 */     n1 = n2;
/* 29 */     n2 = temp;
/*    */     
/* 31 */     System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/TestPassByValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */