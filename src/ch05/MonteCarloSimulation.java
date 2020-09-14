/*    */ package ch05;
/*    */ 
/*    */ public class MonteCarloSimulation {
/*    */   public static void main(String[] args) {
/*  5 */     int NUMBER_OF_TRIALS = 1000000000;
/*  6 */     int numberOfHits = 0;
/*    */     
/*  8 */     for (int i = 0; i < 1000000000; i++) {
/*  9 */       double x = Math.random() * 2.0D - 1.0D;
/* 10 */       double y = Math.random() * 2.0D - 1.0D;
/* 11 */       if (x * x + y * y <= 1.0D) {
/* 12 */         numberOfHits++;
/*    */       }
/*    */     } 
/* 15 */     double pi = 4.0D * numberOfHits / 1.0E9D;
/* 16 */     System.out.println("PI is " + pi);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/MonteCarloSimulation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */