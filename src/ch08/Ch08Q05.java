/*    */ package ch08;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch08Q05 {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner scanner = new Scanner(System.in);
/*  8 */     double[][] matrix1 = new double[3][3];
/*  9 */     double[][] matrix2 = new double[3][3];
/* 10 */     System.out.print("Enter matrix1: "); int i;
/* 11 */     for (i = 0; i < matrix1.length; i++) {
/* 12 */       for (int k = 0; k < (matrix1[i]).length; k++) {
/* 13 */         matrix1[i][k] = scanner.nextDouble();
/*    */       }
/*    */     } 
/* 16 */     System.out.print("Enter matrix2: ");
/* 17 */     for (i = 0; i < matrix2.length; i++) {
/* 18 */       for (int k = 0; k < (matrix2[i]).length; k++) {
/* 19 */         matrix2[i][k] = scanner.nextDouble();
/*    */       }
/*    */     } 
/* 22 */     double[][] result = addMatrix(matrix1, matrix2);
/* 23 */     System.out.println("The matrices are added as follows");
/* 24 */     for (int j = 0; j < result.length; j++) {
/* 25 */       int k; for (k = 0; k < (result[j]).length; k++) {
/* 26 */         System.out.printf("%3.0f", new Object[] { Double.valueOf(matrix1[j][k]) });
/*    */       } 
/* 28 */       if (j != 1) {
/* 29 */         System.out.print("\t\t");
/*    */       } else {
/*    */         
/* 32 */         System.out.print("\t+\t");
/*    */       } 
/* 34 */       for (k = 0; k < (result[j]).length; k++) {
/* 35 */         System.out.printf("%3.0f", new Object[] { Double.valueOf(matrix2[j][k]) });
/*    */       } 
/* 37 */       if (j != 1) {
/* 38 */         System.out.print("\t\t");
/*    */       } else {
/*    */         
/* 41 */         System.out.print("\t=\t");
/*    */       } 
/* 43 */       for (k = 0; k < (result[j]).length; k++) {
/* 44 */         System.out.printf("%3.0f", new Object[] { Double.valueOf(result[j][k]) });
/*    */       } 
/* 46 */       System.out.println();
/*    */     } 
/*    */   }
/*    */   
/*    */   public static double[][] addMatrix(double[][] a, double[][] b) {
/* 51 */     double[][] result = new double[3][3];
/* 52 */     for (int i = 0; i < a.length; i++) {
/* 53 */       for (int j = 0; j < (a[i]).length; j++) {
/* 54 */         result[i][j] = a[i][j] + b[i][j];
/*    */       }
/*    */     } 
/* 57 */     return result;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch08/Ch08Q05.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */