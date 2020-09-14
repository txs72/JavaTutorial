/*    */ package ch06;
/*    */ 
/*    */ public class TestVoidMethod {
/*    */   public static void main(String[] args) {
/*  5 */     System.out.print("The grade is ");
/*  6 */     printGrade(78.5D);
/*    */     
/*  8 */     System.out.print("The grade is ");
/*  9 */     printGrade(59.5D);
/*    */   }
/*    */   
/*    */   public static void printGrade(double score) {
/* 13 */     if (score >= 90.0D) {
/* 14 */       System.out.println('A');
/*    */     }
/* 16 */     else if (score >= 80.0D) {
/* 17 */       System.out.println('B');
/*    */     }
/* 19 */     else if (score >= 70.0D) {
/* 20 */       System.out.println('C');
/*    */     }
/* 22 */     else if (score >= 60.0D) {
/* 23 */       System.out.println('D');
/*    */     } else {
/*    */       
/* 26 */       System.out.println('F');
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/TestVoidMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */