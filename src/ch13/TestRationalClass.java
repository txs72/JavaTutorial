/*    */ package ch13;
/*    */ 
/*    */ 
/*    */ public class TestRationalClass
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     Rational r1 = new Rational(4L, 2L);
/*  8 */     Rational r2 = new Rational(2L, 3L);
/*    */ 
/*    */     
/* 11 */     System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
/* 12 */     System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
/* 13 */     System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
/* 14 */     System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
/* 15 */     System.out.println(r2 + " is " + r2.doubleValue());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/TestRationalClass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */