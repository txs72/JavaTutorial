/*    */ package ch32;
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
/*    */ 
/*    */ class PrintNum
/*    */   implements Runnable
/*    */ {
/*    */   private int lastNum;
/*    */   
/*    */   public PrintNum(int n) {
/* 56 */     this.lastNum = n;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void run() {
/* 64 */     Thread thread4 = new Thread(new PrintChar('c', 40));
/* 65 */     thread4.start();
/*    */     try {
/* 67 */       for (int i = 1; i <= this.lastNum; i++) {
/* 68 */         System.out.print(" " + i);
/* 69 */         if (i == 2) thread4.join(); 
/* 70 */         if (i >= 50) {
/* 71 */           Thread.sleep(1L);
/*    */         }
/*    */       }
/*    */     
/* 75 */     } catch (InterruptedException interruptedException) {}
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/PrintNum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */