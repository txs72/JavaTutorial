/*    */ package ch12;
/*    */ 
/*    */ public class TestCircleWithCustomException {
/*    */   public static void main(String[] args) {
/*    */     try {
/*  6 */       new CircleWithCustomException(5.0D);
/*  7 */       new CircleWithCustomException(-5.0D);
/*  8 */       new CircleWithCustomException(0.0D);
/*    */     }
/* 10 */     catch (InvalidRadiusException ex) {
/* 11 */       System.out.println(ex);
/*    */     } 
/*    */     
/* 14 */     System.out.println("Number of objects created: " + 
/* 15 */         CircleWithCustomException.getNumberOfObjects());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/TestCircleWithCustomException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */