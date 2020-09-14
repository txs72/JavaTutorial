/*    */ package extra.aboutthread;
/*    */ 
/*    */ public class CacheLinePadding01 {
/*    */   private static class T {
/*    */     private T() {}
/*    */     
/*  7 */     public volatile long x = 0L; }
/*    */   
/*  9 */   public static T[] arr = new T[2];
/*    */   static {
/* 11 */     arr[0] = new T();
/* 12 */     arr[1] = new T();
/*    */   }
/*    */   
/*    */   public static void main(String[] args) throws InterruptedException {
/* 16 */     Thread t1 = new Thread(() -> {
/*    */           for (long i = 0L; i < 10000000L; i++) {
/*    */             (arr[0]).x = i;
/*    */           }
/*    */         });
/*    */     
/* 22 */     Thread t2 = new Thread(() -> {
/*    */           for (long i = 0L; i < 10000000L; i++) {
/*    */             (arr[1]).x = i;
/*    */           }
/*    */         });
/*    */     
/* 28 */     long start = System.nanoTime();
/* 29 */     t1.start();
/* 30 */     t2.start();
/* 31 */     t1.join();
/* 32 */     t2.join();
/* 33 */     System.out.println((System.nanoTime() - start) / 10000000L);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/extra/aboutthread/CacheLinePadding01.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */