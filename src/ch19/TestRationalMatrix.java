/*    */ package ch19;
/*    */ 
/*    */ public class TestRationalMatrix
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     Rational[][] m1 = new Rational[3][3];
/*  7 */     Rational[][] m2 = new Rational[3][3];
/*  8 */     for (int i = 0; i < m1.length; i++) {
/*  9 */       for (int j = 0; j < (m1[0]).length; j++) {
/* 10 */         m1[i][j] = new Rational((i + 1), (j + 5));
/* 11 */         m2[i][j] = new Rational((i + 1), (j + 6));
/*    */       } 
/*    */     } 
/*    */     
/* 15 */     RationalMatrix rationalMatrix = new RationalMatrix();
/*    */     
/* 17 */     System.out.println("\nm1 + m2 is ");
/* 18 */     GenericMatrix.printResult((Number[][])m1, (Number[][])m2, (Number[][])rationalMatrix
/* 19 */         .addMatrix(m1, m2), '+');
/*    */     
/* 21 */     System.out.println("\nm1 * m2 is ");
/* 22 */     GenericMatrix.printResult((Number[][])m1, (Number[][])m2, (Number[][])rationalMatrix
/* 23 */         .multiplyMatrix(m1, m2), '*');
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/TestRationalMatrix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */