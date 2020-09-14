/*    */ package ch09;
/*    */ 
/*    */ 
/*    */ public class Ch09Q06
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     StopWatch stopWatch = new StopWatch();
/*    */     
/*  9 */     stopWatch.start();
/* 10 */     long l = 0L;
/* 11 */     for (int i = 0; i < 1000000; i++) {
/* 12 */       l++;
/*    */     }
/* 14 */     stopWatch.end();
/* 15 */     System.out.println("Time elapsed: " + stopWatch.getElapsedTime());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/Ch09Q06.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */