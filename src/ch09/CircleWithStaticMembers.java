/*    */ package ch09;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CircleWithStaticMembers
/*    */ {
/*    */   double radius;
/*  8 */   static int numberOfObjects = 0;
/*    */ 
/*    */   
/*    */   CircleWithStaticMembers() {
/* 12 */     this.radius = 1.0D;
/* 13 */     numberOfObjects++;
/*    */   }
/*    */ 
/*    */   
/*    */   CircleWithStaticMembers(double newRadius) {
/* 18 */     this.radius = newRadius;
/* 19 */     numberOfObjects++;
/*    */   }
/*    */ 
/*    */   
/*    */   static int getNumberOfObjects() {
/* 24 */     return numberOfObjects;
/*    */   }
/*    */ 
/*    */   
/*    */   double getArea() {
/* 29 */     return this.radius * this.radius * Math.PI;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/CircleWithStaticMembers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */