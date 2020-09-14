/*    */ package reflection;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ public class InvokeMethods {
/*    */   public static void main(String[] args) {
/*  7 */     A a1 = new A();
/*  8 */     Class<?> c = a1.getClass();
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 13 */       Method m1 = c.getDeclaredMethod("print", new Class[] { int.class, int.class });
/* 14 */       Method m2 = c.getDeclaredMethod("print", new Class[] { String.class, String.class });
/*    */       
/* 16 */       Object o1 = m1.invoke(a1, new Object[] { Integer.valueOf(10), Integer.valueOf(20) });
/* 17 */       Object o2 = m2.invoke(a1, new Object[] { "hello", "world" });
/* 18 */       m1.invoke(a1, new Object[] { Integer.valueOf(10), Integer.valueOf(20) });
/* 19 */       System.out.println("o2 = " + o2);
/* 20 */       System.out.println(o1.getClass().getName());
/* 21 */       System.out.println(o2.getClass().getName());
/* 22 */     } catch (Exception e) {
/* 23 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/InvokeMethods.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */