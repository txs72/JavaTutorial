/*    */ package ch09;
/*    */ 
/*    */ public class CircleWithPrivateDataFields
/*    */ {
/*  5 */   private double radius = 1.0D;
/*    */ 
/*    */   
/*  8 */   private static int numberOfObjects = 0;
/*    */ 
/*    */   
/*    */   public CircleWithPrivateDataFields() {
/* 12 */     numberOfObjects++;
/*    */   }
/*    */ 
/*    */   
/*    */   public CircleWithPrivateDataFields(double newRadius) {
/* 17 */     this.radius = newRadius;
/* 18 */     numberOfObjects++;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getRadius() {
/* 23 */     return this.radius;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setRadius(double newRadius) {
/* 28 */     this.radius = (newRadius >= 0.0D) ? newRadius : 0.0D;
/*    */   }
/*    */ 
/*    */   
/*    */   public static int getNumberOfObjects() {
/* 33 */     return numberOfObjects;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getArea() {
/* 38 */     return this.radius * this.radius * Math.PI;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/CircleWithPrivateDataFields.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */