/*    */ package annotation;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ public class _03_UseRepeatableAnnotation
/*    */ {
/*    */   public static void main(String[] args) {
/*    */     try {
/* 10 */       Class<_03_UseRepeatableAnnotation> c = _03_UseRepeatableAnnotation.class;
/* 11 */       Method m1 = c.getMethod("test1", new Class[0]);
/* 12 */       Method m2 = c.getMethod("test2", new Class[0]);
/*    */       
/* 14 */       Annotation[] a1 = m1.getAnnotations();
/* 15 */       for (Annotation a : a1) {
/* 16 */         System.out.println(a);
/* 17 */         if (a instanceof Item) {
/* 18 */           Item item = (Item)a;
/* 19 */           System.out.println(((Item)a).description());
/* 20 */           System.out.println(((Item)a).quantity());
/*    */         }
/* 22 */         else if (a instanceof MyContainer) {
/* 23 */           MyContainer myContainer = (MyContainer)a;
/* 24 */           Item[] items = myContainer.value();
/* 25 */           for (Item item : items) {
/* 26 */             System.out.println(item.description());
/* 27 */             System.out.println(item.quantity());
/*    */           } 
/*    */         } 
/*    */       } 
/*    */       
/* 32 */       Annotation[] a2 = m2.getAnnotations();
/* 33 */       for (Annotation a : a2) {
/* 34 */         System.out.println(a);
/* 35 */         if (a instanceof Item) {
/* 36 */           Item item = (Item)a;
/* 37 */           System.out.println(((Item)a).description());
/* 38 */           System.out.println(((Item)a).quantity());
/*    */         }
/* 40 */         else if (a instanceof MyContainer) {
/* 41 */           MyContainer myContainer = (MyContainer)a;
/* 42 */           Item[] items = myContainer.value();
/* 43 */           for (Item item : items) {
/* 44 */             System.out.println(item.description());
/* 45 */             System.out.println(item.quantity());
/*    */           }
/*    */         
/*    */         } 
/*    */       } 
/* 50 */     } catch (Exception e) {
/* 51 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */   
/*    */   @MyContainer({@Item(description = "machine1"), @Item(description = "desk1", quantity = 200)})
/*    */   public void test1() {}
/*    */   
/*    */   @MyContainer({@Item(description = "machine2"), @Item(description = "desk2", quantity = 300)})
/*    */   public void test2() {}
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/annotation/_03_UseRepeatableAnnotation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */