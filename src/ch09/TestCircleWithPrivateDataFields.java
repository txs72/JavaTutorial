/*    */ package ch09;
/*    */ 
/*    */ 
/*    */ public class TestCircleWithPrivateDataFields
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0D);
/*    */     
/*  9 */     System.out.println("The area of the circle of radius " + myCircle
/* 10 */         .getRadius() + " is " + myCircle.getArea());
/*    */ 
/*    */     
/* 13 */     myCircle.setRadius(myCircle.getRadius() * 1.1D);
/* 14 */     System.out.println("The area of the circle of radius " + myCircle
/* 15 */         .getRadius() + " is " + myCircle.getArea());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/TestCircleWithPrivateDataFields.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */