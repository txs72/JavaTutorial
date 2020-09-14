/*    */ package extra.aboutthread;
/*    */ 
/*    */ import java.util.concurrent.TimeUnit;
/*    */ 
/*    */ public class Volatile {
/*    */   boolean running = true;
/*    */   
/*    */   void srv() {
/*  9 */     System.out.println("srv start");
/* 10 */     while (this.running);
/*    */ 
/*    */     
/* 13 */     System.out.println("srv end");
/*    */   }
/*    */   
/*    */   public static void main(String[] args) {
/* 17 */     Volatile v = new Volatile();
/* 18 */     (new Thread(v::srv, "th1")).start();
/*    */     try {
/* 20 */       TimeUnit.SECONDS.sleep(3L);
/*    */     }
/* 22 */     catch (InterruptedException e) {
/* 23 */       e.printStackTrace();
/*    */     } 
/* 25 */     v.running = false;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/extra/aboutthread/Volatile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */