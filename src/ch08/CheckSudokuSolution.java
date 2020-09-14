/*    */ package ch08;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class CheckSudokuSolution
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     int[][] grid = readASolution();
/*    */     
/* 10 */     System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static int[][] readASolution() {
/* 17 */     Scanner input = new Scanner(System.in);
/*    */     
/* 19 */     System.out.println("Enter a Sudoku puzzle solution:");
/* 20 */     int[][] grid = new int[9][9];
/* 21 */     for (int i = 0; i < 9; i++) {
/* 22 */       for (int j = 0; j < 9; j++)
/* 23 */         grid[i][j] = input.nextInt(); 
/*    */     } 
/* 25 */     return grid;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean isValid(int[][] grid) {
/* 30 */     for (int i = 0; i < 9; i++) {
/* 31 */       for (int j = 0; j < 9; j++)
/* 32 */       { if (grid[i][j] < 1 || grid[i][j] > 9 || 
/* 33 */           !isValid(i, j, grid))
/* 34 */           return false;  } 
/* 35 */     }  return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean isValid(int i, int j, int[][] grid) {
/* 41 */     for (int column = 0; column < 9; column++) {
/* 42 */       if (column != j && grid[i][column] == grid[i][j])
/* 43 */         return false; 
/*    */     } 
/*    */     int row;
/* 46 */     for (row = 0; row < 9; row++) {
/* 47 */       if (row != i && grid[row][j] == grid[i][j]) {
/* 48 */         return false;
/*    */       }
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 54 */     for (row = i / 3 * 3; row < i / 3 * 3 + 3; row++) {
/* 55 */       for (int col = j / 3 * 3; col < j / 3 * 3 + 3; col++) {
/* 56 */         if (row != i && col != j && grid[row][col] == grid[i][j])
/* 57 */           return false; 
/*    */       } 
/* 59 */     }  return true;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch08/CheckSudokuSolution.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */