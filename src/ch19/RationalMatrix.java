/*    */ package ch19;
/*    */ 
/*    */ public class RationalMatrix
/*    */   extends GenericMatrix<Rational> {
/*    */   protected Rational add(Rational r1, Rational r2) {
/*  6 */     return r1.add(r2);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Rational multiply(Rational r1, Rational r2) {
/* 11 */     return r1.multiply(r2);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Rational zero() {
/* 16 */     return new Rational(0L, 1L);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/RationalMatrix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */