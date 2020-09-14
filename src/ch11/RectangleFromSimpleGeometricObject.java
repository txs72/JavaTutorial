/*    */ package ch11;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RectangleFromSimpleGeometricObject
/*    */   extends SimpleGeometricObject
/*    */ {
/*    */   private double width;
/*    */   private double height;
/*    */   
/*    */   public RectangleFromSimpleGeometricObject() {}
/*    */   
/*    */   public RectangleFromSimpleGeometricObject(double width, double height) {
/* 14 */     this.width = width;
/* 15 */     this.height = height;
/*    */   }
/*    */ 
/*    */   
/*    */   public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
/* 20 */     this.width = width;
/* 21 */     this.height = height;
/* 22 */     setColor(color);
/* 23 */     setFilled(filled);
/*    */   }
/*    */ 
/*    */   
/*    */   public double getWidth() {
/* 28 */     return this.width;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setWidth(double width) {
/* 33 */     this.width = width;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getHeight() {
/* 38 */     return this.height;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setHeight(double height) {
/* 43 */     this.height = height;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getArea() {
/* 48 */     return this.width * this.height;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getPerimeter() {
/* 53 */     return 2.0D * (this.width + this.height);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/RectangleFromSimpleGeometricObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */