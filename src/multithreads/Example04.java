/*    */ package multithreads;
/*    */ 
/*    */ import java.util.concurrent.locks.ReentrantReadWriteLock;
/*    */ 
/*    */ public class Example04 {
/*  6 */   private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
/*    */   
/*    */   public static void main(String[] args) {
/*  9 */     final Example04 test = new Example04();
/*    */     
/* 11 */     (new Thread() {
/*    */         public void run() {
/* 13 */           test.get(Thread.currentThread());
/*    */         }
/* 15 */       }).start();
/*    */     
/* 17 */     (new Thread() {
/*    */         public void run() {
/* 19 */           test.get(Thread.currentThread());
/*    */         }
/* 21 */       }).start();
/*    */   }
/*    */ 
/*    */   
/*    */   public synchronized void get(Thread thread) {
/* 26 */     long start = System.currentTimeMillis();
/* 27 */     while (System.currentTimeMillis() - start <= 1L) {
/* 28 */       System.out.println(thread.getName() + "正在进行读操作");
/*    */     }
/* 30 */     System.out.println(thread.getName() + "读操作完毕");
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/multithreads/Example04.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */