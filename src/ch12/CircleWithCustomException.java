/*    */ package ch12;
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
/*    */ class CircleWithCustomException
/*    */ {
/*    */   private double radius;
/* 24 */   private static int numberOfObjects = 0;
/*    */ 
/*    */   
/*    */   public CircleWithCustomException() throws InvalidRadiusException {
/* 28 */     this(1.0D);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
/* 34 */     setRadius(newRadius);
/* 35 */     numberOfObjects++;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getRadius() {
/* 40 */     return this.radius;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRadius(double newRadius) throws InvalidRadiusException {
/* 46 */     if (newRadius >= 0.0D) {
/* 47 */       this.radius = newRadius;
/*    */     } else {
/* 49 */       throw new InvalidRadiusException(newRadius);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static int getNumberOfObjects() {
/* 54 */     return numberOfObjects;
/*    */   }
/*    */ 
/*    */   
/*    */   public double findArea() {
/* 59 */     return this.radius * this.radius * 3.14159D;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/CircleWithCustomException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */