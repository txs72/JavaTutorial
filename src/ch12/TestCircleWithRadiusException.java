/*    */ package ch12;
/*    */ 
/*    */ public class TestCircleWithRadiusException
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     new CircleWithRadiusException(5.0D);
/*  7 */     new CircleWithRadiusException(-5.0D);
/*  8 */     new CircleWithRadiusException(0.0D);
/*    */ 
/*    */     
/* 11 */     System.out.println("Number of objects created: " + 
/* 12 */         CircleWithRadiusException.getNumberOfObjects());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/TestCircleWithRadiusException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */