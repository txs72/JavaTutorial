/*    */ package multithreads;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class MyThread
/*    */   extends Thread
/*    */ {
/* 52 */   private Example03 test = null;
/*    */   
/*    */   public MyThread(Example03 test) {
/* 55 */     this.test = test;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void run() {
/*    */     try {
/* 62 */       this.test.insert(Thread.currentThread());
/* 63 */     } catch (InterruptedException e) {
/* 64 */       System.out.println(Thread.currentThread().getName() + "被中断");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/multithreads/MyThread.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */