/*    */ package reflection.gen_dynamic;
/*    */ 
/*    */ public class Office {
/*    */   public static void main(String[] args) {
/*    */     try {
/*  6 */       Class<?> c = Class.forName(args[0]);
/*    */       
/*  8 */       Object o = c.newInstance();
/*  9 */       OfficeAble oa = (OfficeAble)o;
/* 10 */       oa.start();
/*    */     }
/* 12 */     catch (Exception e) {
/* 13 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/gen_dynamic/Office.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */