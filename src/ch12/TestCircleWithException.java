/*    */ package ch12;
/*    */ 
/*    */ public class TestCircleWithException {
/*    */   public static void main(String[] args) {
/*    */     try {
/*  6 */       CircleWithException c1 = new CircleWithException(5.0D);
/*  7 */       CircleWithException c2 = new CircleWithException(-5.0D);
/*  8 */       CircleWithException circleWithException1 = new CircleWithException(0.0D);
/*    */     }
/* 10 */     catch (IllegalArgumentException ex) {
/* 11 */       System.out.println(ex);
/*    */     } 
/*    */     
/* 14 */     System.out.println("Number of objects created: " + 
/* 15 */         CircleWithException.getNumberOfObjects());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/TestCircleWithException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */