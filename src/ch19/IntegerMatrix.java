/*    */ package ch19;
/*    */ 
/*    */ public class IntegerMatrix
/*    */   extends GenericMatrix<Integer> {
/*    */   protected Integer add(Integer o1, Integer o2) {
/*  6 */     return Integer.valueOf(o1.intValue() + o2.intValue());
/*    */   }
/*    */ 
/*    */   
/*    */   protected Integer multiply(Integer o1, Integer o2) {
/* 11 */     return Integer.valueOf(o1.intValue() * o2.intValue());
/*    */   }
/*    */ 
/*    */   
/*    */   protected Integer zero() {
/* 16 */     return Integer.valueOf(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/IntegerMatrix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */