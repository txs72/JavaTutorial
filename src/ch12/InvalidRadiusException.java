/*    */ package ch12;
/*    */ 
/*    */ public class InvalidRadiusException
/*    */   extends Exception {
/*    */   private double radius;
/*    */   
/*    */   public InvalidRadiusException(double radius) {
/*  8 */     super("Invalid radius " + radius);
/*  9 */     this.radius = radius;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getRadius() {
/* 14 */     return this.radius;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/InvalidRadiusException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */