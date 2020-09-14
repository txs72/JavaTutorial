/*    */ package ch12;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CircleWithRadiusException
/*    */ {
/*    */   private double radius;
/*  8 */   private static int numberOfObjects = 0;
/*    */ 
/*    */   
/*    */   public CircleWithRadiusException() {
/* 12 */     this(1.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public CircleWithRadiusException(double newRadius) {
/*    */     try {
/* 18 */       setRadius(newRadius);
/* 19 */       numberOfObjects++;
/*    */     }
/* 21 */     catch (InvalidRadiusException ex) {
/* 22 */       ex.printStackTrace();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public double getRadius() {
/* 28 */     return this.radius;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRadius(double newRadius) throws InvalidRadiusException {
/* 34 */     if (newRadius >= 0.0D) {
/* 35 */       this.radius = newRadius;
/*    */     } else {
/* 37 */       throw new InvalidRadiusException(newRadius);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static int getNumberOfObjects() {
/* 42 */     return numberOfObjects;
/*    */   }
/*    */ 
/*    */   
/*    */   public double findArea() {
/* 47 */     return this.radius * this.radius * 3.14159D;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/CircleWithRadiusException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */