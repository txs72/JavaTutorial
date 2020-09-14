/*    */ package ch32;
/*    */ 
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.Executors;
/*    */ 
/*    */ public class ExecutorDemo {
/*    */   public static void main(String[] args) {
/*  8 */     ExecutorService executor = Executors.newFixedThreadPool(3);
/*    */ 
/*    */     
/* 11 */     executor.execute(new PrintChar('a', 100));
/* 12 */     executor.execute(new PrintChar('b', 100));
/* 13 */     executor.execute(new PrintNum(100));
/*    */ 
/*    */     
/* 16 */     executor.shutdown();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/ExecutorDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */