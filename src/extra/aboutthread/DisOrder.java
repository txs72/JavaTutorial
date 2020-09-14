/*    */ package extra.aboutthread;
/*    */ 
/*    */ public class DisOrder {
/*  4 */   private static int x = 0, y = 0;
/*  5 */   private static int a = 0, b = 0;
/*    */   
/*    */   public static void main(String[] args) throws InterruptedException {
/*  8 */     int i = 0;
/*    */     while (true) {
/* 10 */       i++;
/* 11 */       x = 0; y = 0;
/* 12 */       a = 0; b = 0;
/* 13 */       Thread one = new Thread(new Runnable()
/*    */           {
/*    */             public void run() {
/* 16 */               DisOrder.a = 1;
/* 17 */               DisOrder.x = DisOrder.b;
/*    */             }
/*    */           });
/* 20 */       Thread other = new Thread(new Runnable()
/*    */           {
/*    */             public void run() {
/* 23 */               DisOrder.b = 1;
/* 24 */               DisOrder.y = DisOrder.a;
/*    */             }
/*    */           });
/*    */ 
/*    */       
/* 29 */       one.start();
/* 30 */       other.start();
/* 31 */       one.join();
/* 32 */       other.join();
/*    */       
/* 34 */       String result = "第" + i + "次 (" + x + "," + y + ")";
/* 35 */       if (x == 0 && y == 0) {
/* 36 */         System.out.println(result);
/*    */         return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/extra/aboutthread/DisOrder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */