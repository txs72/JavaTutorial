/*    */ package reflection;
/*    */ 
/*    */ public class _00_ClassDemo {
/*    */   public static void main(String[] args) {
/*  5 */     Foo foo1 = new Foo(1);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 10 */     Class<Foo> c1 = Foo.class;
/*    */ 
/*    */ 
/*    */     
/* 14 */     Class<?> c2 = foo1.getClass();
/*    */ 
/*    */     
/* 17 */     System.out.println((c1 == c2));
/*    */ 
/*    */     
/* 20 */     Class<?> c3 = null;
/*    */     try {
/* 22 */       c3 = Class.forName("reflection.Foo");
/* 23 */       System.out.println((c2 == c3));
/* 24 */     } catch (ClassNotFoundException cnfe) {
/* 25 */       cnfe.printStackTrace();
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 31 */       Foo foo2 = c1.newInstance();
/* 32 */       System.out.println(foo2);
/* 33 */       foo2.print();
/* 34 */     } catch (Exception e) {
/* 35 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/_00_ClassDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */