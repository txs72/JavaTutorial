/*    */ package ch11;
/*    */ 
/*    */ public class DynamicBindingDemo {
/*    */   public static void main(String[] args) {
/*  5 */     Object o = new GraduateStudent();
/*    */     
/*  7 */     Object o1 = new Object();
/*    */     
/*  9 */     if (o1 instanceof GraduateStudent) {
/* 10 */       System.out.println("Never got here");
/* 11 */       GraduateStudent graduateStudent = (GraduateStudent)o1;
/*    */     } 
/*    */     
/* 14 */     m(o);
/* 15 */     m(new Student());
/* 16 */     m(new Person());
/* 17 */     m(new Object());
/*    */   }
/*    */   
/*    */   public static void m(Object x) {
/* 21 */     System.out.println(x.toString());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/DynamicBindingDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */