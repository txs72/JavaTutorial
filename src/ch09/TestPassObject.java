/*    */ package ch09;
/*    */ 
/*    */ 
/*    */ public class TestPassObject
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1.0D);
/*    */ 
/*    */ 
/*    */     
/* 11 */     int n = 5;
/* 12 */     printAreas(myCircle, n);
/*    */ 
/*    */     
/* 15 */     System.out.println("\nRadius is " + myCircle.getRadius());
/* 16 */     System.out.println("n is " + n);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void printAreas(CircleWithPrivateDataFields c, int times) {
/* 22 */     System.out.println("Radius \t\tArea");
/* 23 */     while (times >= 1) {
/* 24 */       System.out.println(c.getRadius() + "\t\t" + c.getArea());
/* 25 */       c.setRadius(c.getRadius() + 1.0D);
/* 26 */       times--;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/TestPassObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */