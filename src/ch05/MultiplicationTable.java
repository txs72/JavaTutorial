/*    */ package ch05;
/*    */ 
/*    */ 
/*    */ public class MultiplicationTable
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     System.out.println("           Multiplication Table");
/*    */ 
/*    */     
/* 10 */     System.out.print("    ");
/* 11 */     for (int j = 1; j <= 9; j++) {
/* 12 */       System.out.print("   " + j);
/*    */     }
/* 14 */     System.out.println("\n-----------------------------------------");
/*    */ 
/*    */     
/* 17 */     for (int i = 1; i <= 9; i++) {
/* 18 */       System.out.print(i + " | ");
/* 19 */       for (int k = 1; k <= 9; k++) {
/*    */         
/* 21 */         System.out.printf("%4d", new Object[] { Integer.valueOf(i * k) });
/*    */       } 
/* 23 */       System.out.println();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/MultiplicationTable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */