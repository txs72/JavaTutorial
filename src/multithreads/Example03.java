/*    */ package multithreads;
/*    */ 
/*    */ import java.util.concurrent.locks.Lock;
/*    */ import java.util.concurrent.locks.ReentrantLock;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Example03
/*    */ {
/* 14 */   private Lock lock = new ReentrantLock();
/*    */   
/*    */   public static void main(String[] args) {
/* 17 */     Example03 test = new Example03();
/* 18 */     MyThread thread1 = new MyThread(test);
/* 19 */     MyThread thread2 = new MyThread(test);
/* 20 */     thread1.start();
/* 21 */     thread2.start();
/*    */     
/*    */     try {
/* 24 */       Thread.sleep(2000L);
/* 25 */     } catch (InterruptedException e) {
/* 26 */       e.printStackTrace();
/*    */     } 
/* 28 */     thread2.interrupt();
/*    */   }
/*    */   
/*    */   public void insert(Thread thread) throws InterruptedException {
/* 32 */     this.lock.lockInterruptibly();
/*    */ 
/*    */     
/*    */     try {
/* 36 */       System.out.println(thread.getName() + "得到了锁");
/* 37 */       long startTime = System.currentTimeMillis(); do {
/*    */       
/* 39 */       } while (System.currentTimeMillis() - startTime < 10000L);
/*    */     
/*    */     }
/*    */     finally {
/*    */       
/* 44 */       System.out.println(Thread.currentThread().getName() + "执行finally");
/* 45 */       this.lock.unlock();
/* 46 */       System.out.println(thread.getName() + "释放了锁");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/multithreads/Example03.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */