/*    */ package reflection;
/*    */ 
/*    */ import java.lang.reflect.Constructor;
/*    */ 
/*    */ public class GenNormalObject1 {
/*    */   public static void main(String[] args) {
/*    */     try {
/*  8 */       Class<String> c = String.class;
/*  9 */       Class[] paraTypes = new Class[1];
/* 10 */       paraTypes[0] = String.class;
/* 11 */       Constructor<String> ct = c.getConstructor(paraTypes);
/* 12 */       System.out.println(ct);
/* 13 */       Object[] argList = new Object[1];
/* 14 */       argList[0] = "Hello world";
/* 15 */       Object gen = ct.newInstance(argList);
/* 16 */       System.out.println(gen);
/*    */     }
/* 18 */     catch (Exception e) {
/* 19 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/GenNormalObject1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */