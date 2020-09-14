/*    */ package ch19;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class BinarySearch
/*    */ {
/*    */   public static int binSearch(int[] srcArray, int start, int end, int key) {
/* 27 */     int mid = (end - start) / 2 + start;
/* 28 */     if (srcArray[mid] == key) {
/* 29 */       return mid;
/*    */     }
/* 31 */     if (start >= end)
/* 32 */       return -1; 
/* 33 */     if (key > srcArray[mid])
/* 34 */       return binSearch(srcArray, mid + 1, end, key); 
/* 35 */     if (key < srcArray[mid]) {
/* 36 */       return binSearch(srcArray, start, mid - 1, key);
/*    */     }
/* 38 */     return -1;
/*    */   }
/*    */ 
/*    */   
/*    */   public static int binSearch(int[] srcArray, int key) {
/* 43 */     int mid = srcArray.length / 2;
/* 44 */     if (key == srcArray[mid]) {
/* 45 */       return mid;
/*    */     }
/* 47 */     int start = 0;
/* 48 */     int end = srcArray.length - 1;
/* 49 */     while (start <= end) {
/* 50 */       mid = (end - start) / 2 + start;
/* 51 */       if (key < srcArray[mid]) {
/* 52 */         end = mid - 1; continue;
/* 53 */       }  if (key > srcArray[mid]) {
/* 54 */         start = mid + 1; continue;
/*    */       } 
/* 56 */       return mid;
/*    */     } 
/*    */     
/* 59 */     return -1;
/*    */   }
/*    */   
/*    */   public static <E extends Comparable<E>> int binSearch2(E[] srcArray, E key) {
/* 63 */     int mid = srcArray.length / 2;
/* 64 */     if (key.equals(srcArray[mid])) {
/* 65 */       return mid;
/*    */     }
/* 67 */     int start = 0;
/* 68 */     int end = srcArray.length - 1;
/* 69 */     while (start <= end) {
/* 70 */       mid = (end - start) / 2 + start;
/* 71 */       if (key.compareTo(srcArray[mid]) < 0) {
/* 72 */         end = mid - 1; continue;
/* 73 */       }  if (key.compareTo(srcArray[mid]) > 0) {
/* 74 */         start = mid + 1; continue;
/*    */       } 
/* 76 */       return mid;
/*    */     } 
/*    */     
/* 79 */     return -1;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/BinarySearch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */