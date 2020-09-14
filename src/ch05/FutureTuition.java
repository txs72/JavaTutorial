/*    */ package ch05;
/*    */ 
/*    */ public class FutureTuition {
/*    */   public static void main(String[] args) {
/*  5 */     double tuition = 10000.0D;
/*  6 */     int year = 0;
/*  7 */     while (tuition < 40000.0D) {
/*  8 */       tuition *= 1.07D;
/*  9 */       year++;
/*    */     } 
/*    */     
/* 12 */     System.out.println("Tuition will be doubled in " + year + " years");
/*    */     
/* 14 */     System.out.printf("Tuition will be $%.2f in %1d years", new Object[] {
/* 15 */           Double.valueOf(tuition), Integer.valueOf(year)
/*    */         });
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/FutureTuition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */