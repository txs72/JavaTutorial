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
/*    */ class PrintChar
/*    */   implements Runnable
/*    */ {
/*    */   private char charToPrint;
/*    */   private int times;
/*    */   
/*    */   public PrintChar(char c, int t) {
/* 31 */     this.charToPrint = c;
/* 32 */     this.times = t;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void run() {
/* 39 */     for (int i = 0; i < this.times; i++)
/* 40 */       System.out.print(this.charToPrint); 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/PrintChar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */