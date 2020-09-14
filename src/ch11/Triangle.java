/*    */ package ch11;
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
/*    */ class Triangle
/*    */   extends GeometricObject
/*    */ {
/* 26 */   private double side1 = 0.0D;
/* 27 */   private double side2 = 0.0D;
/* 28 */   private double side3 = 0.0D;
/*    */ 
/*    */   
/*    */   public Triangle() {}
/*    */   
/*    */   public Triangle(double side1, double side2, double side3) {
/* 34 */     this.side1 = side1;
/* 35 */     this.side2 = side2;
/* 36 */     this.side3 = side3;
/*    */   }
/*    */   
/*    */   public Triangle(String color, boolean filled, double side1, double side2, double side3) {
/* 40 */     super(color, filled);
/* 41 */     this.side1 = side1;
/* 42 */     this.side2 = side2;
/* 43 */     this.side3 = side3;
/*    */   }
/*    */   
/*    */   public double getSide1() {
/* 47 */     return this.side1;
/*    */   }
/*    */   
/*    */   public double getSide2() {
/* 51 */     return this.side2;
/*    */   }
/*    */   
/*    */   public double getSide3() {
/* 55 */     return this.side3;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getArea() {
/* 60 */     double s = getPerimeter() / 2.0D;
/* 61 */     double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
/*    */ 
/*    */     
/* 64 */     return area;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getPerimeter() {
/* 69 */     return this.side1 + this.side2 + this.side3;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 74 */     String s = super.toString();
/* 75 */     s = s + "\n";
/* 76 */     s = s + "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
/*    */     
/* 78 */     return s;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/Triangle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */