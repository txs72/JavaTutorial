/*    */ package ch08;
/*    */ 
/*    */ 
/*    */ public class GradeExam
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }, { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' }, { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' }, { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' }, { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }, { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }, { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }, { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
/*    */ 
/*    */     
/* 21 */     for (int i = 0; i < answers.length; i++) {
/*    */       
/* 23 */       int correctCount = 0;
/* 24 */       for (int j = 0; j < (answers[i]).length; j++) {
/* 25 */         if (answers[i][j] == keys[j]) {
/* 26 */           correctCount++;
/*    */         }
/*    */       } 
/* 29 */       System.out.println("Student " + i + "'s correct count is " + correctCount);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch08/GradeExam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */