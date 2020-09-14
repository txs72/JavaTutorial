/*    */ package ch11;
/*    */ 
/*    */ public class CircleFromSimpleGeometricObject
/*    */   extends SimpleGeometricObject
/*    */ {
/*    */   private double radius;
/*    */   
/*    */   public CircleFromSimpleGeometricObject() {}
/*    */   
/*    */   public CircleFromSimpleGeometricObject(double radius) {
/* 11 */     this.radius = radius;
/*    */   }
/*    */ 
/*    */   
/*    */   public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
/* 16 */     this.radius = radius;
/* 17 */     setColor(color);
/* 18 */     setFilled(filled);
/*    */   }
/*    */ 
/*    */   
/*    */   public double getRadius() {
/* 23 */     return this.radius;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setRadius(double radius) {
/* 28 */     this.radius = radius;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getArea() {
/* 33 */     return this.radius * this.radius * Math.PI;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getDiameter() {
/* 38 */     return 2.0D * this.radius;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getPerimeter() {
/* 43 */     return 2.0D * this.radius * Math.PI;
/*    */   }
/*    */ 
/*    */   
/*    */   public void printCircle() {
/* 48 */     System.out.println("The circle is created " + getDateCreated() + " and the radius is " + this.radius);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 53 */     String s = super.toString();
/* 54 */     s = s + "\n";
/* 55 */     s = s + "radius: " + this.radius;
/* 56 */     return s;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/CircleFromSimpleGeometricObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */