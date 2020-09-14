/*    */ package ch02;
/*    */ 
/*    */ public class ShowCurrentTime
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     long totalMilliseconds = System.currentTimeMillis();
/*    */ 
/*    */     
/*  9 */     long totalSeconds = totalMilliseconds / 1000L;
/*    */ 
/*    */     
/* 12 */     long currentSecond = totalSeconds % 60L;
/*    */ 
/*    */     
/* 15 */     long totalMinutes = totalSeconds / 60L;
/*    */ 
/*    */     
/* 18 */     long currentMinute = totalMinutes % 60L;
/*    */ 
/*    */     
/* 21 */     long totalHours = totalMinutes / 60L;
/*    */ 
/*    */     
/* 24 */     long currentHour = totalHours % 24L;
/*    */ 
/*    */     
/* 27 */     System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch02/ShowCurrentTime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */