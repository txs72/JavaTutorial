/*    */ package ch19;
/*    */ 
/*    */ 
/*    */ public class Ch19Q017
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     int[] srcArray = { 3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101 };
/*  8 */     System.out.println(BinarySearch.binSearch(srcArray, 0, srcArray.length - 1, 81));
/*  9 */     System.out.println(BinarySearch.binSearch(srcArray, 81));
/*    */ 
/*    */     
/* 12 */     Integer[] myArray = new Integer[srcArray.length];
/* 13 */     for (int i = 0; i < myArray.length; i++) {
/* 14 */       myArray[i] = Integer.valueOf(srcArray[i]);
/*    */     }
/* 16 */     System.out.println(
/* 17 */         BinarySearch.binSearch2(myArray, Integer.valueOf(81)));
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/Ch19Q017.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */