/*    */ package reflection;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DumpMethods
/*    */ {
/*    */   public static void main(String[] args) throws Exception {
/* 11 */     String s = "temp";
/* 12 */     Class<?> classType = s.getClass();
/* 13 */     Method[] methods = classType.getDeclaredMethods();
/* 14 */     for (Method method : methods)
/* 15 */       System.out.println(method); 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/DumpMethods.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */