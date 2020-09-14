/*    */ package ch32;
/*    */ 
/*    */ public class MergeSort
/*    */ {
/*    */   public static void mergeSort(int[] list) {
/*  6 */     if (list.length > 1) {
/*    */       
/*  8 */       int[] firstHalf = new int[list.length / 2];
/*  9 */       System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
/* 10 */       mergeSort(firstHalf);
/*    */ 
/*    */       
/* 13 */       int secondHalfLength = list.length - list.length / 2;
/* 14 */       int[] secondHalf = new int[secondHalfLength];
/* 15 */       System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
/*    */       
/* 17 */       mergeSort(secondHalf);
/*    */ 
/*    */       
/* 20 */       merge(firstHalf, secondHalf, list);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static void merge(int[] list1, int[] list2, int[] temp) {
/* 26 */     int current1 = 0;
/* 27 */     int current2 = 0;
/* 28 */     int current3 = 0;
/*    */     
/* 30 */     while (current1 < list1.length && current2 < list2.length) {
/*    */ 
/*    */       
/* 33 */       if (list1[current1] < list2[current2]) {
/* 34 */         temp[current3++] = list1[current1++]; continue;
/*    */       } 
/* 36 */       temp[current3++] = list2[current2++];
/*    */     } 
/*    */     
/* 39 */     while (current1 < list1.length) {
/* 40 */       temp[current3++] = list1[current1++];
/*    */     }
/* 42 */     while (current2 < list2.length) {
/* 43 */       temp[current3++] = list2[current2++];
/*    */     }
/*    */   }
/*    */   
/*    */   public static void main(String[] args) {
/* 48 */     int[] list = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
/* 49 */     mergeSort(list);
/* 50 */     for (int i = 0; i < list.length; i++)
/* 51 */       System.out.print(list[i] + " "); 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/MergeSort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */