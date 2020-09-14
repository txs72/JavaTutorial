/*    */ package extra.aboutreference;
/*    */ 
/*    */ import java.lang.ref.SoftReference;
/*    */ 
/*    */ public class SoftReferenceTest
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     SoftReference<byte[]> m = (SoftReference)new SoftReference<>(new byte[10485760]);
/*  9 */     System.out.println(m.get());
/* 10 */     System.gc();
/*    */     
/*    */     try {
/* 13 */       Thread.sleep(500L);
/*    */     }
/* 15 */     catch (InterruptedException e) {
/* 16 */       e.printStackTrace();
/*    */     } 
/* 18 */     System.out.println(m.get());
/*    */     
/* 20 */     byte[] b = new byte[10485760];
/* 21 */     System.out.println(m.get());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/extra/aboutreference/SoftReferenceTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */