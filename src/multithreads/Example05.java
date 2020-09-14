/*    */ package multithreads;
/*    */ 
/*    */ import java.util.concurrent.locks.ReentrantReadWriteLock;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Example05
/*    */ {
/* 13 */   private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
/*    */   
/*    */   public static void main(String[] args) {
/* 16 */     final Example05 test = new Example05();
/*    */     
/* 18 */     (new Thread() {
/*    */         public void run() {
/* 20 */           test.get(Thread.currentThread());
/*    */         }
/* 22 */       }).start();
/*    */     
/* 24 */     (new Thread() {
/*    */         public void run() {
/* 26 */           test.get(Thread.currentThread());
/*    */         }
/* 28 */       }).start();
/*    */   }
/*    */ 
/*    */   
/*    */   public void get(Thread thread) {
/* 33 */     this.rwl.readLock().lock();
/*    */     try {
/* 35 */       long start = System.currentTimeMillis();
/*    */       
/* 37 */       while (System.currentTimeMillis() - start <= 1L) {
/* 38 */         System.out.println(thread.getName() + "正在进行读操作");
/*    */       }
/* 40 */       System.out.println(thread.getName() + "读操作完毕");
/*    */     } finally {
/* 42 */       this.rwl.readLock().unlock();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/multithreads/Example05.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */