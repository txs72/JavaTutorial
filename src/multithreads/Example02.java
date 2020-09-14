/*    */ package multithreads;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.concurrent.locks.Lock;
/*    */ import java.util.concurrent.locks.ReentrantLock;
/*    */ 
/*    */ 
/*    */ public class Example02
/*    */ {
/* 10 */   private ArrayList<Integer> arrayList = new ArrayList<>();
/* 11 */   private Lock lock = new ReentrantLock();
/*    */   public static void main(String[] args) {
/* 13 */     final Example02 test = new Example02();
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
/*    */   public void insert(Thread thread) {
/* 29 */     if (this.lock.tryLock()) {
/*    */       try {
/* 31 */         System.out.println(thread.getName() + "得到了锁");
/* 32 */         for (int i = 0; i < 5; i++) {
/* 33 */           this.arrayList.add(Integer.valueOf(i));
/*    */         }
/* 35 */       } catch (Exception exception) {
/*    */       
/*    */       } finally {
/* 38 */         System.out.println(thread.getName() + "释放了锁");
/* 39 */         this.lock.unlock();
/*    */       } 
/*    */     } else {
/* 42 */       System.out.println(thread.getName() + "获取锁失败");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/multithreads/Example02.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */