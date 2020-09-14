/*    */ package ch32;
/*    */ import java.util.Arrays;
/*    */ import java.util.concurrent.ForkJoinPool;
/*    */ import java.util.concurrent.RecursiveAction;
/*    */ 
/*    */ public class ParallelMergeSort {
/*    */   public static void main(String[] args) {
/*  8 */     int SIZE = 7000000;
/*  9 */     int[] list1 = new int[7000000];
/* 10 */     int[] list2 = new int[7000000];
/*    */     
/* 12 */     for (int i = 0; i < list1.length; i++) {
/* 13 */       list2[i] = (int)(Math.random() * 1.0E7D); list1[i] = (int)(Math.random() * 1.0E7D);
/*    */     } 
/* 15 */     long startTime = System.currentTimeMillis();
/* 16 */     parallelMergeSort(list1);
/* 17 */     long endTime = System.currentTimeMillis();
/* 18 */     System.out.println("\nParallel time with " + 
/* 19 */         Runtime.getRuntime().availableProcessors() + " processors is " + (endTime - startTime) + " milliseconds");
/*    */ 
/*    */     
/* 22 */     startTime = System.currentTimeMillis();
/* 23 */     MergeSort.mergeSort(list2);
/* 24 */     endTime = System.currentTimeMillis();
/* 25 */     System.out.println("\nSequential time is " + (endTime - startTime) + " milliseconds");
/*    */   }
/*    */ 
/*    */   
/*    */   public static void parallelMergeSort(int[] list) {
/* 30 */     RecursiveAction mainTask = new SortTask(list);
/* 31 */     ForkJoinPool pool = new ForkJoinPool();
/* 32 */     pool.invoke(mainTask);
/*    */   }
/*    */   
/*    */   private static class SortTask extends RecursiveAction {
/* 36 */     private final int THRESHOLD = 500;
/*    */     private int[] list;
/*    */     
/*    */     SortTask(int[] list) {
/* 40 */       this.list = list;
/*    */     }
/*    */ 
/*    */     
/*    */     protected void compute() {
/* 45 */       if (this.list.length < 500) {
/* 46 */         Arrays.sort(this.list);
/*    */       } else {
/*    */         
/* 49 */         int[] firstHalf = new int[this.list.length / 2];
/* 50 */         System.arraycopy(this.list, 0, firstHalf, 0, this.list.length / 2);
/*    */ 
/*    */         
/* 53 */         int secondHalfLength = this.list.length - this.list.length / 2;
/* 54 */         int[] secondHalf = new int[secondHalfLength];
/* 55 */         System.arraycopy(this.list, this.list.length / 2, secondHalf, 0, secondHalfLength);
/*    */ 
/*    */ 
/*    */         
/* 59 */         invokeAll(new SortTask(firstHalf), new SortTask(secondHalf));
/*    */ 
/*    */ 
/*    */         
/* 63 */         MergeSort.merge(firstHalf, secondHalf, this.list);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/ParallelMergeSort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */