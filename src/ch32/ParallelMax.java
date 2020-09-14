/*    */ package ch32;
/*    */ 
/*    */ import java.util.concurrent.ForkJoinPool;
/*    */ import java.util.concurrent.RecursiveTask;
/*    */ 
/*    */ public class ParallelMax {
/*    */   public static void main(String[] args) {
/*  8 */     int N = 9000000;
/*  9 */     int[] list = new int[9000000];
/* 10 */     for (int i = 0; i < list.length; i++) {
/* 11 */       list[i] = i;
/*    */     }
/* 13 */     long startTime = System.currentTimeMillis();
/* 14 */     System.out.println("\nThe maximal number is " + max(list));
/* 15 */     long endTime = System.currentTimeMillis();
/* 16 */     System.out.println("Number of processors is " + 
/* 17 */         Runtime.getRuntime().availableProcessors());
/* 18 */     System.out.println("Time with " + (endTime - startTime) + " milliseconds");
/*    */   }
/*    */ 
/*    */   
/*    */   public static int max(int[] list) {
/* 23 */     RecursiveTask<Integer> task = new MaxTask(list, 0, list.length);
/* 24 */     ForkJoinPool pool = new ForkJoinPool();
/* 25 */     return ((Integer)pool.<Integer>invoke(task)).intValue();
/*    */   }
/*    */   
/*    */   private static class MaxTask extends RecursiveTask<Integer> {
/*    */     private static final int THRESHOLD = 1000;
/*    */     private int[] list;
/*    */     private int low;
/*    */     private int high;
/*    */     
/*    */     public MaxTask(int[] list, int low, int high) {
/* 35 */       this.list = list;
/* 36 */       this.low = low;
/* 37 */       this.high = high;
/*    */     }
/*    */ 
/*    */     
/*    */     public Integer compute() {
/* 42 */       if (this.high - this.low < 1000) {
/* 43 */         int max = this.list[0];
/* 44 */         for (int i = this.low; i < this.high; i++) {
/* 45 */           if (this.list[i] > max)
/* 46 */             max = this.list[i]; 
/* 47 */         }  return new Integer(max);
/*    */       } 
/*    */       
/* 50 */       int mid = (this.low + this.high) / 2;
/* 51 */       RecursiveTask<Integer> left = new MaxTask(this.list, this.low, mid);
/* 52 */       RecursiveTask<Integer> right = new MaxTask(this.list, mid, this.high);
/*    */       
/* 54 */       right.fork();
/* 55 */       left.fork();
/* 56 */       return new Integer(Math.max(((Integer)left.join()).intValue(), ((Integer)right
/* 57 */             .join()).intValue()));
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/ParallelMax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */