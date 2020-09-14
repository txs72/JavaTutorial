/*    */ package ch32;
/*    */ 
/*    */ public class TaskThreadDemo
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     Runnable printA = new PrintChar('a', 1000);
/*  7 */     Runnable printB = new PrintChar('b', 1000);
/*  8 */     Runnable print100 = new PrintNum(100);
/*    */ 
/*    */     
/* 11 */     Thread thread1 = new Thread(printA);
/* 12 */     Thread thread2 = new Thread(printB);
/* 13 */     Thread thread3 = new Thread(print100);
/*    */ 
/*    */     
/* 16 */     thread3.start();
/* 17 */     thread1.start();
/* 18 */     thread2.start();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/TaskThreadDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */