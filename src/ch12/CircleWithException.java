/*    */ package ch12;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CircleWithException
/*    */ {
/*    */   private double radius;
/*  8 */   private static int numberOfObjects = 0;
/*    */ 
/*    */   
/*    */   public CircleWithException() {
/* 12 */     this(1.0D);
/* 13 */     numberOfObjects++;
/*    */   }
/*    */ 
/*    */   
/*    */   public CircleWithException(double newRadius) {
/* 18 */     setRadius(newRadius);
/* 19 */     numberOfObjects++;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getRadius() {
/* 24 */     return this.radius;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRadius(double newRadius) throws IllegalArgumentException {
/* 30 */     if (newRadius >= 0.0D) {
/* 31 */       this.radius = newRadius;
/*    */     } else {
/* 33 */       throw new IllegalArgumentException("Radius cannot be negative");
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static int getNumberOfObjects() {
/* 39 */     return numberOfObjects;
/*    */   }
/*    */ 
/*    */   
/*    */   public double findArea() {
/* 44 */     return this.radius * this.radius * 3.14159D;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/CircleWithException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */