/*    */ package ch32;
/*    */ import java.util.concurrent.ArrayBlockingQueue;
/*    */ import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*    */
/*    */ public class ConsumerProducerUsingBlockingQueue {
/*  6 */   private static ArrayBlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(2);
/*    */ 
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
/* 24 */           ConsumerProducerUsingBlockingQueue.buffer.put(Integer.valueOf(i++));
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
/* 39 */           System.out.println("\t\t\tConsumer reads " + ConsumerProducerUsingBlockingQueue.buffer.take());
/*    */           
/* 41 */           Thread.sleep((int)(Math.random() * 1000.0D));
/*    */         } 
/* 43 */       } catch (InterruptedException ex) {
/* 44 */         ex.printStackTrace();
/*    */         return;
/*    */       } 
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/ConsumerProducerUsingBlockingQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */