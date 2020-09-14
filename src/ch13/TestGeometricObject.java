/*    */ package ch13;
/*    */ 
/*    */ 
/*    */ public class TestGeometricObject
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     GeometricObject geoObject1 = new Circle(5.0D);
/*  8 */     GeometricObject geoObject2 = new Rectangle(5.0D, 3.0D);
/*    */     
/* 10 */     System.out.println("The two objects have the same area? " + 
/* 11 */         equalArea(geoObject1, geoObject2));
/*    */ 
/*    */     
/* 14 */     displayGeometricObject(geoObject1);
/*    */ 
/*    */     
/* 17 */     displayGeometricObject(geoObject2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
/* 23 */     return (object1.getArea() == object2.getArea());
/*    */   }
/*    */ 
/*    */   
/*    */   public static void displayGeometricObject(GeometricObject object) {
/* 28 */     System.out.println();
/* 29 */     System.out.println("The area is " + object.getArea());
/* 30 */     System.out.println("The perimeter is " + object.getPerimeter());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/TestGeometricObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */