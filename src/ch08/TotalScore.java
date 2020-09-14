/*    */ package ch08;
/*    */ 
/*    */ public class TotalScore
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     double[][][] scores = { { { 7.5D, 20.5D }, { 9.0D, 22.5D }, { 15.0D, 33.5D }, { 13.0D, 21.5D }, { 15.0D, 2.5D } }, { { 4.5D, 21.5D }, { 9.0D, 22.5D }, { 15.0D, 34.5D }, { 12.0D, 20.5D }, { 14.0D, 9.5D } }, { { 6.5D, 30.5D }, { 9.4D, 10.5D }, { 11.0D, 33.5D }, { 11.0D, 23.5D }, { 10.0D, 2.5D } }, { { 6.5D, 23.5D }, { 9.4D, 32.5D }, { 13.0D, 34.5D }, { 11.0D, 20.5D }, { 16.0D, 7.5D } }, { { 8.5D, 26.5D }, { 9.4D, 52.5D }, { 13.0D, 36.5D }, { 13.0D, 24.5D }, { 16.0D, 2.5D } }, { { 9.5D, 20.5D }, { 9.4D, 42.5D }, { 13.0D, 31.5D }, { 12.0D, 20.5D }, { 16.0D, 6.5D } }, { { 1.5D, 29.5D }, { 6.4D, 22.5D }, { 14.0D, 30.5D }, { 10.0D, 30.5D }, { 16.0D, 6.0D } } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     for (int i = 0; i < scores.length; i++) {
/* 17 */       double totalScore = 0.0D;
/* 18 */       for (int j = 0; j < (scores[i]).length; j++) {
/* 19 */         for (int k = 0; k < (scores[i][j]).length; k++)
/* 20 */           totalScore += scores[i][j][k]; 
/*    */       } 
/* 22 */       System.out.println("Student " + i + "'s score is " + totalScore);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch08/TotalScore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */