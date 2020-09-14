/*    */ package reflection;
/*    */ 
/*    */ import java.lang.reflect.Constructor;
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ public class ClassUtil
/*    */ {
/*    */   public static void printMethodMessage(Object obj) {
/* 10 */     Class<?> c = obj.getClass();
/*    */ 
/*    */ 
/*    */     
/* 14 */     Method[] methods = c.getMethods();
/*    */     
/* 16 */     for (Method method : methods) {
/* 17 */       Class<?> returnType = method.getReturnType();
/*    */       
/* 19 */       System.out.print(returnType.getSimpleName() + " " + method.getName() + "(");
/* 20 */       Class[] paramTypes = method.getParameterTypes();
/* 21 */       String strParams = "";
/* 22 */       for (Class paramType : paramTypes) {
/* 23 */         strParams = strParams + paramType.getSimpleName() + ", ";
/*    */       }
/* 25 */       if (strParams.length() > 0) {
/* 26 */         strParams = strParams.substring(0, strParams.length() - 2);
/*    */       }
/* 28 */       System.out.println(strParams + ")");
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static void printFieldMessage(Object o) {
/* 34 */     Class<?> c = o.getClass();
/*    */     
/* 36 */     Field[] fields = c.getDeclaredFields();
/*    */     
/* 38 */     for (Field field : fields) {
/* 39 */       Class<?> fieldType = field.getType();
/* 40 */       String typeName = fieldType.getName();
/* 41 */       String fieldName = field.getName();
/* 42 */       System.out.println(fieldName + ": " + typeName);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void printCtorMessage(Object o) {
/* 47 */     Class<?> c = o.getClass();
/*    */     
/* 49 */     Constructor[] ctors = (Constructor[])c.getDeclaredConstructors();
/* 50 */     for (Constructor ctor : ctors) {
/*    */       
/* 52 */       System.out.print(ctor.getName() + "(");
/* 53 */       Class[] paramTypes = ctor.getParameterTypes();
/* 54 */       String strParams = "";
/* 55 */       for (Class paramType : paramTypes) {
/* 56 */         System.out.print(strParams);
/* 57 */         System.out.print(paramType.getSimpleName());
/* 58 */         strParams = ", ";
/*    */       } 
/* 60 */       System.out.println(")");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/ClassUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */