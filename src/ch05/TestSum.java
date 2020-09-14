/*    */ package ch05;
/*    */ 
/*    */ public class TestSum
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     float sum = 0.0F;
/*    */ 
/*    */     
/*  9 */     for (float i = 0.01F; i <= 1.0F; i += 0.01F) {
/* 10 */       sum += i;
/*    */     }
/*    */     
/* 13 */     System.out.println("The sum is " + sum);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/TestSum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */