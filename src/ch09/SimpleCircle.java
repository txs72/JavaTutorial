/*    */ package ch09;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class SimpleCircle
/*    */ {
/*    */   double radius;
/*    */   
/*    */   SimpleCircle() {
/* 37 */     this.radius = 1.0D;
/*    */   }
/*    */ 
/*    */   
/*    */   SimpleCircle(double newRadius) {
/* 42 */     this.radius = newRadius;
/*    */   }
/*    */ 
/*    */   
/*    */   double getArea() {
/* 47 */     return this.radius * this.radius * Math.PI;
/*    */   }
/*    */ 
/*    */   
/*    */   double getPerimeter() {
/* 52 */     return 2.0D * this.radius * Math.PI;
/*    */   }
/*    */ 
/*    */   
/*    */   void setRadius(double newRadius) {
/* 57 */     this.radius = newRadius;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/SimpleCircle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */