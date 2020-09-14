/*    */ package extra.aboutreference;
/*    */ 
/*    */ import java.lang.ref.WeakReference;
/*    */ 
/*    */ public class WeakReferenceTest {
/*    */   public static void main(String[] args) {
/*  7 */     WeakReference<M> m = new WeakReference<>(new M());
/*  8 */     System.out.println(m.get());
/*  9 */     System.gc();
/* 10 */     System.out.println(m.get());
/*    */     
/* 12 */     ThreadLocal<M> tl = new ThreadLocal<>();
/* 13 */     tl.set(new M());
/* 14 */     tl.remove();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/extra/aboutreference/WeakReferenceTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */