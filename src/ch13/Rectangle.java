/*    */ package ch13;
/*    */ 
/*    */ public class Rectangle
/*    */   extends GeometricObject {
/*    */   private double width;
/*    */   private double height;
/*    */   
/*    */   public Rectangle() {}
/*    */   
/*    */   public Rectangle(double width, double height) {
/* 11 */     this.width = width;
/* 12 */     this.height = height;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getWidth() {
/* 17 */     return this.width;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setWidth(double width) {
/* 22 */     this.width = width;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getHeight() {
/* 27 */     return this.height;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setHeight(double height) {
/* 32 */     this.height = height;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getArea() {
/* 37 */     return this.width * this.height;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getPerimeter() {
/* 42 */     return 2.0D * (this.width + this.height);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/Rectangle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */