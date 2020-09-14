/*    */ package ch09;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TestSimpleCircle
/*    */ {
/*    */   public static void main(String[] args) {
/*  9 */     SimpleCircle circle1 = new SimpleCircle();
/* 10 */     System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1
/* 11 */         .getArea());
/*    */ 
/*    */     
/* 14 */     SimpleCircle circle2 = new SimpleCircle(25.0D);
/* 15 */     System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2
/* 16 */         .getArea());
/*    */ 
/*    */     
/* 19 */     SimpleCircle circle3 = new SimpleCircle(125.0D);
/* 20 */     System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3
/* 21 */         .getArea());
/*    */ 
/*    */     
/* 24 */     circle2.radius = 100.0D;
/* 25 */     System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2
/* 26 */         .getArea());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/TestSimpleCircle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */