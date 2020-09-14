/*    */ package ch06;
/*    */ 
/*    */ public class TestReturnGradeMethod {
/*    */   public static void main(String[] args) {
/*  5 */     System.out.print("The grade is " + getGrade(78.5D));
/*  6 */     System.out.print("\nThe grade is " + getGrade(59.5D));
/*    */   }
/*    */   
/*    */   public static char getGrade(double score) {
/* 10 */     if (score >= 90.0D)
/* 11 */       return 'A'; 
/* 12 */     if (score >= 80.0D)
/* 13 */       return 'B'; 
/* 14 */     if (score >= 70.0D)
/* 15 */       return 'C'; 
/* 16 */     if (score >= 60.0D) {
/* 17 */       return 'D';
/*    */     }
/* 19 */     return 'F';
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/TestReturnGradeMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */