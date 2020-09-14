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
/*    */ class QuadraticEquation
/*    */ {
/*    */   private double a;
/*    */   private double b;
/*    */   private double c;
/*    */   
/*    */   public QuadraticEquation(double a, double b, double c) {
/* 31 */     this.a = a;
/* 32 */     this.b = b;
/* 33 */     this.c = c;
/*    */   }
/*    */   
/*    */   public double getA() {
/* 37 */     return this.a;
/*    */   }
/*    */   
/*    */   public double getB() {
/* 41 */     return this.b;
/*    */   }
/*    */   
/*    */   public double getC() {
/* 45 */     return this.c;
/*    */   }
/*    */   
/*    */   public double getDiscriminant() {
/* 49 */     return this.b * this.b - 4.0D * this.a * this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getRoot1() {
/* 54 */     double r = (-this.b + Math.sqrt(this.b * this.b - 4.0D * this.a * this.c)) / 2.0D * this.a;
/* 55 */     return r;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getRoot2() {
/* 60 */     double r = (-this.b - Math.sqrt(this.b * this.b - 4.0D * this.a * this.c)) / 2.0D * this.a;
/* 61 */     return r;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/QuadraticEquation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */