/*    */ package ch09;
/*    */ 
/*    */ import java.util.Date;
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
/*    */ class StopWatch
/*    */ {
/* 25 */   private long startTime = (new Date()).getTime();
/*    */   private long endTime;
/*    */   
/*    */   public void start() {
/* 29 */     this.startTime = (new Date()).getTime();
/*    */   }
/*    */   
/*    */   public void end() {
/* 33 */     this.endTime = (new Date()).getTime();
/*    */   }
/*    */   
/*    */   public long getElapsedTime() {
/* 37 */     return this.endTime - this.startTime;
/*    */   }
/*    */   
/*    */   public long getStartTime() {
/* 41 */     return this.startTime;
/*    */   }
/*    */   
/*    */   public long getEndTime() {
/* 45 */     return this.endTime;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/StopWatch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */