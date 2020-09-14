/*    */ package extra.aboutthread;
/*    */ public class CacheLinePadding02 { private static class Padding { public volatile long p1; public volatile long p2; public volatile long p3; public volatile long p4; public volatile long p5;
/*    */     public volatile long p6;
/*    */     public volatile long p7;
/*    */     
/*    */     private Padding() {} }
/*    */   
/*    */   private static class T extends Padding { private T() {
/*  9 */       this.x = 0L;
/*    */     }
/*    */     public volatile long x; }
/* 12 */   public static T[] arr = new T[2];
/*    */   static {
/* 14 */     arr[0] = new T();
/* 15 */     arr[1] = new T();
/*    */   }
/*    */   
/*    */   public static void main(String[] args) throws InterruptedException {
/* 19 */     Thread t1 = new Thread(() -> {
/*    */           for (long i = 0L; i < 10000000L; i++) {
/*    */             (arr[0]).x = i;
/*    */           }
/*    */         });
/*    */     
/* 25 */     Thread t2 = new Thread(() -> {
/*    */           for (long i = 0L; i < 10000000L; i++) {
/*    */             (arr[1]).x = i;
/*    */           }
/*    */         });
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     long start = System.nanoTime();
/* 35 */     t1.start();
/* 36 */     t2.start();
/* 37 */     t1.join();
/* 38 */     t2.join();
/*    */     
/* 40 */     System.out.println((System.nanoTime() - start) / 10000000L);
/*    */   } }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/extra/aboutthread/CacheLinePadding02.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */