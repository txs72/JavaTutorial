/*    */ package multithreads;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.concurrent.locks.Lock;
/*    */ import java.util.concurrent.locks.ReentrantLock;
/*    */ 
/*    */ 
/*    */ public class Example01
/*    */ {
/* 10 */   private ArrayList<Integer> arrayList = new ArrayList<>();
/* 11 */   Lock lock = new ReentrantLock();
/*    */   public static void main(String[] args) {
/* 13 */     final Example01 test = new Example01();
/*    */     
/* 15 */     (new Thread() {
/*    */         public void run() {
/* 17 */           test.insert(Thread.currentThread());
/*    */         }
/* 19 */       }).start();
/*    */     
/* 21 */     (new Thread() {
/*    */         public void run() {
/* 23 */           test.insert(Thread.currentThread());
/*    */         }
/* 25 */       }).start();
/*    */   }
/*    */ 
/*    */   
/*    */   public void insert(Thread thread) {
/* 30 */     this.lock.lock();
/*    */     try {
/* 32 */       System.out.println(thread.getName() + "得到了锁");
/* 33 */       for (int i = 0; i < 5; i++) {
/* 34 */         this.arrayList.add(Integer.valueOf(i));
/*    */       }
/* 36 */     } catch (Exception exception) {
/*    */     
/*    */     } finally {
/* 39 */       System.out.println(thread.getName() + "释放了锁");
/* 40 */       this.lock.unlock();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/multithreads/Example01.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */