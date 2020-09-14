/*    */ package ch19;
/*    */ 
/*    */ public class TestIntegerMatrix
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     Integer[][] m1 = { { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3) }, { Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6) }, { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1) } };
/*  7 */     Integer[][] m2 = { { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1) }, { Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2) }, { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) } };
/*    */ 
/*    */     
/* 10 */     IntegerMatrix integerMatrix = new IntegerMatrix();
/*    */     
/* 12 */     System.out.println("\nm1 + m2 is ");
/* 13 */     GenericMatrix.printResult((Number[][])m1, (Number[][])m2, (Number[][])integerMatrix
/* 14 */         .addMatrix(m1, m2), '+');
/*    */     
/* 16 */     System.out.println("\nm1 * m2 is ");
/* 17 */     GenericMatrix.printResult((Number[][])m1, (Number[][])m2, (Number[][])integerMatrix
/* 18 */         .multiplyMatrix(m1, m2), '*');
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/TestIntegerMatrix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */