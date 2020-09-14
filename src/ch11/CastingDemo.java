/*    */ package ch11;
/*    */ 
/*    */ 
/*    */ public class CastingDemo
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     Object object1 = new CircleFromSimpleGeometricObject(1.0D);
/*  8 */     Object object2 = new RectangleFromSimpleGeometricObject(1.0D, 1.0D);
/*    */ 
/*    */     
/* 11 */     displayObject(object1);
/* 12 */     displayObject(object2);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void displayObject(Object object) {
/* 17 */     if (object instanceof CircleFromSimpleGeometricObject) {
/* 18 */       System.out.println("The circle area is " + ((CircleFromSimpleGeometricObject)object)
/* 19 */           .getArea());
/* 20 */       System.out.println("The circle diameter is " + ((CircleFromSimpleGeometricObject)object)
/* 21 */           .getDiameter());
/*    */     }
/* 23 */     else if (object instanceof RectangleFromSimpleGeometricObject) {
/*    */       
/* 25 */       System.out.println("The rectangle area is " + ((RectangleFromSimpleGeometricObject)object)
/* 26 */           .getArea());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/CastingDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */