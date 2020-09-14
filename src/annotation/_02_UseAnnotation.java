/*    */ package annotation;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class _02_UseAnnotation
/*    */ {
/*    */   @MyAnnotation2(name = "zhangsan", age = 32)
/*    */   public void test() {}
/*    */   
/*    */   public static void main(String[] args) {
/*    */     try {
/* 15 */       Class<?> clazz = Class.forName("annotation._02_UseAnnotation");
/*    */       
/* 17 */       System.out.println("==========");
/* 18 */       Method method = clazz.getMethod("test", new Class[0]);
/* 19 */       Annotation annotation = method.getAnnotation((Class)MyAnnotation2.class);
/* 20 */       System.out.println(annotation);
/* 21 */       System.out.println(((MyAnnotation2)annotation).name());
/* 22 */       System.out.println(((MyAnnotation2)annotation).age());
/*    */       
/* 24 */       System.out.println("==========");
/* 25 */       Annotation[] annotations = method.getAnnotations();
/* 26 */       for (Annotation a : annotations) {
/* 27 */         if (a instanceof MyAnnotation2) {
/* 28 */           System.out.println(a.annotationType());
/* 29 */           MyAnnotation2 myAnnotation2 = (MyAnnotation2)a;
/* 30 */           System.out.println(myAnnotation2.name());
/* 31 */           System.out.println(myAnnotation2.age());
/*    */         }
/*    */       
/*    */       }
/*    */     
/* 36 */     } catch (Exception e) {
/* 37 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/annotation/_02_UseAnnotation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */