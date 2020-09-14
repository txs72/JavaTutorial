/*    */ package ch19;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class GenericMatrix<E extends Number>
/*    */ {
/*    */   protected abstract E add(E paramE1, E paramE2);
/*    */   
/*    */   protected abstract E multiply(E paramE1, E paramE2);
/*    */   
/*    */   protected abstract E zero();
/*    */   
/*    */   public E[][] addMatrix(E[][] matrix1, E[][] matrix2) {
/* 16 */     if (matrix1.length != matrix2.length || (matrix1[0]).length != (matrix2[0]).length)
/*    */     {
/* 18 */       throw new RuntimeException("The matrices do not have the same size");
/*    */     }
/*    */ 
/*    */     
/* 22 */     Number[][] arrayOfNumber = new Number[matrix1.length][(matrix1[0]).length];
/*    */ 
/*    */ 
/*    */     
/* 26 */     for (int i = 0; i < arrayOfNumber.length; i++) {
/* 27 */       for (int j = 0; j < (arrayOfNumber[i]).length; j++) {
/* 28 */         arrayOfNumber[i][j] = (Number)add(matrix1[i][j], matrix2[i][j]);
/*    */       }
/*    */     } 
/* 31 */     return (E[][])arrayOfNumber;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2) {
/* 37 */     if ((matrix1[0]).length != matrix2.length) {
/* 38 */       throw new RuntimeException("The matrices do not have compatible size");
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 43 */     Number[][] arrayOfNumber = new Number[matrix1.length][(matrix2[0]).length];
/*    */ 
/*    */ 
/*    */     
/* 47 */     for (int i = 0; i < arrayOfNumber.length; i++) {
/* 48 */       for (int j = 0; j < (arrayOfNumber[0]).length; j++) {
/* 49 */         arrayOfNumber[i][j] = (Number)zero();
/*    */         
/* 51 */         for (int k = 0; k < (matrix1[0]).length; k++) {
/* 52 */           arrayOfNumber[i][j] = (Number)add((E)arrayOfNumber[i][j], 
/* 53 */               multiply(matrix1[i][k], matrix2[k][j]));
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 58 */     return (E[][])arrayOfNumber;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void printResult(Number[][] m1, Number[][] m2, Number[][] m3, char op) {
/* 64 */     for (int i = 0; i < m1.length; i++) {
/* 65 */       int j; for (j = 0; j < (m1[0]).length; j++) {
/* 66 */         System.out.print(" " + m1[i][j]);
/*    */       }
/* 68 */       if (i == m1.length / 2) {
/* 69 */         System.out.print("  " + op + "  ");
/*    */       } else {
/* 71 */         System.out.print("     ");
/*    */       } 
/* 73 */       for (j = 0; j < m2.length; j++) {
/* 74 */         System.out.print(" " + m2[i][j]);
/*    */       }
/* 76 */       if (i == m1.length / 2) {
/* 77 */         System.out.print("  =  ");
/*    */       } else {
/* 79 */         System.out.print("     ");
/*    */       } 
/* 81 */       for (j = 0; j < m3.length; j++) {
/* 82 */         System.out.print(m3[i][j] + " ");
/*    */       }
/* 84 */       System.out.println();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/GenericMatrix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */