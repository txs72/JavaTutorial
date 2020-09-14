/*    */ package reflection;
/*    */ 
/*    */ import java.lang.reflect.Field;
/*    */ 
/*    */ public class PrivateTester2
/*    */ {
/*    */   public static void main(String[] args) throws Exception {
/*  8 */     Private2 p = new Private2();
/*  9 */     Class<Private2> classType = Private2.class;
/*    */     
/* 11 */     Field field = classType.getDeclaredField("name");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 17 */     field.setAccessible(true);
/* 18 */     field.set(p, "lisi");
/* 19 */     System.out.println(p.getName());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/PrivateTester2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */