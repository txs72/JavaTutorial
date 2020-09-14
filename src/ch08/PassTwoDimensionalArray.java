/*    */ package ch08;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class PassTwoDimensionalArray {
/*    */   public static void main(String[] args) {
/*  7 */     int[][] m = getArray();
/*    */ 
/*    */     
/* 10 */     System.out.println("\nSum of all elements is " + sum(m));
/*    */   }
/*    */ 
/*    */   
/*    */   public static int[][] getArray() {
/* 15 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 18 */     int[][] m = new int[3][4];
/* 19 */     System.out.println("Enter " + m.length + " rows and " + (m[0]).length + " columns: ");
/*    */     
/* 21 */     for (int i = 0; i < m.length; i++) {
/* 22 */       for (int j = 0; j < (m[i]).length; j++)
/* 23 */         m[i][j] = input.nextInt(); 
/*    */     } 
/* 25 */     return m;
/*    */   }
/*    */   
/*    */   public static int sum(int[][] m) {
/* 29 */     int total = 0;
/* 30 */     for (int row = 0; row < m.length; row++) {
/* 31 */       for (int column = 0; column < (m[row]).length; column++) {
/* 32 */         total += m[row][column];
/*    */       }
/*    */     } 
/*    */     
/* 36 */     return total;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch08/PassTwoDimensionalArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */