/*    */ package extra.aboutinterface;
/*    */ 
/*    */ public interface AddedStuff
/*    */ {
/*    */   static void testStatic() {
/*  6 */     System.out.println("static func in interface...");
/*    */   }
/*    */   public static final int a = 10;
/*    */   default void testDefault() {
/* 10 */     System.out.println("default func in interface...");
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/extra/aboutinterface/AddedStuff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */