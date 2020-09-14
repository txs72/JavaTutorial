/*    */ package extra.aboutreference;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class StrongReference {
/*    */   public static void main(String[] args) throws IOException {
/*  7 */     M m = new M();
/*  8 */     m = null;
/*  9 */     System.gc();
/* 10 */     System.in.read();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/extra/aboutreference/StrongReference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */