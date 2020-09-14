/*    */ package ch05;
/*    */ 
/*    */ public class TestContinue {
/*    */   public static void main(String[] args) {
/*  5 */     int sum = 0;
/*  6 */     int number = 0;
/*    */     
/*  8 */     while (number < 20) {
/*  9 */       number++;
/* 10 */       if (number == 10 || number == 11)
/*    */         continue; 
/* 12 */       sum += number;
/*    */     } 
/*    */     
/* 15 */     System.out.println("The sum is " + sum);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/TestContinue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */