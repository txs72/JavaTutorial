/*    */ package ch07;
/*    */ 
/*    */ public class TestPassArray
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     int[] a = { 1, 2 };
/*    */ 
/*    */     
/*  9 */     System.out.println("Before invoking swap");
/* 10 */     System.out.println("array is {" + a[0] + ", " + a[1] + "}");
/* 11 */     swap(a[0], a[1]);
/* 12 */     System.out.println("After invoking swap");
/* 13 */     System.out.println("array is {" + a[0] + ", " + a[1] + "}");
/*    */ 
/*    */     
/* 16 */     System.out.println("Before invoking swapFirstTwoInArray");
/* 17 */     System.out.println("array is {" + a[0] + ", " + a[1] + "}");
/* 18 */     swapFirstTwoInArray(a);
/* 19 */     System.out.println("After invoking swapFirstTwoInArray");
/* 20 */     System.out.println("array is {" + a[0] + ", " + a[1] + "}");
/*    */   }
/*    */ 
/*    */   
/*    */   public static void swap(int n1, int n2) {
/* 25 */     int temp = n1;
/* 26 */     n1 = n2;
/* 27 */     n2 = temp;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void swapFirstTwoInArray(int[] array) {
/* 32 */     int temp = array[0];
/* 33 */     array[0] = array[1];
/* 34 */     array[1] = temp;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch07/TestPassArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */