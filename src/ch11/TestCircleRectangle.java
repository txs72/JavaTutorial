/*    */ package ch11;
/*    */ 
/*    */ public class TestCircleRectangle {
/*    */   public static void main(String[] args) {
/*  5 */     CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1.0D);
/*    */     
/*  7 */     System.out.println("A circle " + circle.toString());
/*  8 */     System.out.println("The color is " + circle.getColor());
/*  9 */     System.out.println("The radius is " + circle.getRadius());
/* 10 */     System.out.println("The area is " + circle.getArea());
/* 11 */     System.out.println("The diameter is " + circle.getDiameter());
/*    */     
/* 13 */     RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2.0D, 4.0D);
/*    */     
/* 15 */     System.out.println("\nA rectangle " + rectangle.toString());
/* 16 */     System.out.println("The area is " + rectangle.getArea());
/* 17 */     System.out.println("The perimeter is " + rectangle
/* 18 */         .getPerimeter());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/TestCircleRectangle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */