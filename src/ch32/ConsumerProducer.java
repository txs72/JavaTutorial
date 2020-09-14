/*    */ package ch32;
/*    */ import java.util.LinkedList;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*    */
/*    */ public class ConsumerProducer {
/*  7 */   private static Buffer buffer = new Buffer();
/*    */ 
/*    */   
/*    */   public static void main(String[] args) {
/* 11 */     ExecutorService executor = Executors.newFixedThreadPool(2);
/* 12 */     executor.execute(new ProducerTask());
/* 13 */     executor.execute(new ConsumerTask());
/* 14 */     executor.shutdown();
/*    */   }
/*    */   
/*    */   private static class ProducerTask implements Runnable { private ProducerTask() {}
/*    */     
/*    */     public void run() {
/*    */       try {
/* 21 */         int i = 1;
/*    */         while (true) {
/* 23 */           System.out.println("Producer writes " + i);
/* 24 */           ConsumerProducer.buffer.write(i++);
/*    */           
/* 26 */           Thread.sleep((int)(Math.random() * 1000.0D));
/*    */         } 
/* 28 */       } catch (InterruptedException ex) {
/* 29 */         ex.printStackTrace();
/*    */         return;
/*    */       } 
/*    */     } }
/*    */   
/*    */   private static class ConsumerTask implements Runnable { private ConsumerTask() {}
/*    */     
/*    */     public void run() {
/*    */       try {
/*    */         while (true) {
/* 39 */           System.out.println("\t\t\tConsumer reads " + ConsumerProducer.buffer.read());
/*    */           
/* 41 */           Thread.sleep((int)(Math.random() * 1000.0D));
/*    */         } 
/* 43 */       } catch (InterruptedException ex) {
/* 44 */         ex.printStackTrace();
/*    */         return;
/*    */       } 
/*    */     } }
/*    */ 
/*    */   
/*    */   private static class Buffer {
/*    */     private static final int CAPACITY = 1;
/* 52 */     private LinkedList<Integer> queue = new LinkedList<>();
/*    */ 
/*    */ 
/*    */     
/* 56 */     private static Lock lock = new ReentrantLock();
/*    */ 
/*    */     
/* 59 */     private static Condition notEmpty = lock.newCondition();
/* 60 */     private static Condition notFull = lock.newCondition();
/*    */     
/*    */     public void write(int value) {
/* 63 */       lock.lock();
/*    */       try {
/* 65 */         System.out.println("write queue size: " + this.queue.size());
/* 66 */         while (this.queue.size() == 1) {
/* 67 */           System.out.println("Wait for notFull condition");
/* 68 */           notFull.await();
/*    */         } 
/*    */         
/* 71 */         this.queue.offer(Integer.valueOf(value));
/* 72 */         notEmpty.signal();
/* 73 */       } catch (InterruptedException ex) {
/* 74 */         ex.printStackTrace();
/*    */       } finally {
/* 76 */         lock.unlock();
/*    */       } 
/*    */     }
/*    */     
/*    */     public int read() {
/* 81 */       int value = 0;
/* 82 */       lock.lock();
/*    */       
/* 84 */       try { System.out.println("\t\t\tread queue size: " + this.queue.size());
/* 85 */         while (this.queue.isEmpty()) {
/* 86 */           System.out.println("\t\t\tWait for notEmpty condition");
/* 87 */           notEmpty.await();
/*    */         } 
/*    */         
/* 90 */         value = ((Integer)this.queue.remove()).intValue();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 96 */         return value; } catch (InterruptedException ex) { return value; }
/*    */       finally
/*    */       { Exception exception = null;
/*    */         lock.unlock(); }
/*    */     
/*    */     }
/*    */     
/*    */     private Buffer() {}
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/ConsumerProducer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */