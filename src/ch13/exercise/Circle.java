/*    */ package ch13.exercise;
/*    */ 
/*    */ public class Circle
/*    */   extends GeometricObject {
/*    */   private double radius;
/*    */   
/*    */   public Circle() {}
/*    */   
/*    */   public Circle(double radius) {
/* 10 */     this.radius = radius;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getRadius() {
/* 15 */     return this.radius;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setRadius(double radius) {
/* 20 */     this.radius = radius;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getArea() {
/* 25 */     return this.radius * this.radius * Math.PI;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getDiameter() {
/* 30 */     return 2.0D * this.radius;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getPerimeter() {
/* 35 */     return 2.0D * this.radius * Math.PI;
/*    */   }
/*    */ 
/*    */   
/*    */   public void printCircle() {
/* 40 */     System.out.println("The circle is created " + getDateCreated() + " and the radius is " + this.radius);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/exercise/Circle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */