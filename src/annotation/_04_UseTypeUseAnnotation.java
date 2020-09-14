/*    */ package annotation;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.AnnotatedType;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ public class _04_UseTypeUseAnnotation
/*    */ {
/*    */   public static void main(String[] args) {
/*    */     try {
/* 11 */       Class<?> c = Class.forName("annotation.TypeUseExample");
/*    */       
/* 13 */       Annotation[] allAnno = c.getDeclaredAnnotations();
/* 14 */       for (Annotation a : allAnno) {
/* 15 */         System.out.println(a);
/*    */       }
/*    */       
/* 18 */       System.out.println("=====================");
/*    */       
/* 20 */       AnnotatedType[] annotationInterfaces = c.getAnnotatedInterfaces();
/* 21 */       System.out.println(annotationInterfaces);
/* 22 */       for (AnnotatedType annotationInterface : annotationInterfaces) {
/* 23 */         for (Annotation a : annotationInterface.getAnnotations()) {
/* 24 */           System.out.println(a);
/*    */         }
/*    */       } 
/*    */       
/* 28 */       System.out.println(c.isAnnotationPresent((Class)MyNotNull.class));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 40 */       Method method = c.getMethod("foo", new Class[0]);
/* 41 */       AnnotatedType[] annotatedExceptions = method.getAnnotatedExceptionTypes();
/* 42 */       System.out.println(annotatedExceptions);
/*    */     
/*    */     }
/* 45 */     catch (Exception e) {
/* 46 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/annotation/_04_UseTypeUseAnnotation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */