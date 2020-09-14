/*    */ package reflection;
/*    */ 
/*    */ import java.lang.reflect.Field;
/*    */ 
/*    */ public class GenNormalObject2
/*    */ {
/*    */   public static void main(String[] args) {
/*    */     try {
/*  9 */       Test testObj = new Test();
/* 10 */       System.out.println(testObj);
/*    */       
/* 12 */       Class<?> c = testObj.getClass();
/* 13 */       Object anotherObj = c.newInstance();
/* 14 */       System.out.println(anotherObj);
/* 15 */       System.out.println((c == anotherObj.getClass()));
/*    */       
/* 17 */       System.out.println("Now change value i using reflection.");
/* 18 */       Field field = c.getDeclaredField("i");
/* 19 */       field.set(anotherObj, new Integer(10));
/* 20 */       System.out.println(anotherObj);
/*    */     }
/* 22 */     catch (Exception e) {
/* 23 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/GenNormalObject2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */