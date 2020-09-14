/*    */ package reflection;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ public class Private1Tester {
/*    */   public static void main(String[] args) throws Exception {
/*  7 */     Private1 p = new Private1();
/*  8 */     Class<?> classType = p.getClass();
/*    */     
/* 10 */     Method method = classType.getDeclaredMethod("sayHello", new Class[] { String.class });
/*    */     
/* 12 */     method.setAccessible(true);
/* 13 */     String str = (String)method.invoke(p, new Object[] { "world" });
/* 14 */     System.out.println(str);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/Private1Tester.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */