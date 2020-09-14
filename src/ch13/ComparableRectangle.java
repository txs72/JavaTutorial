/*    */ package ch13;
/*    */ 
/*    */ public class ComparableRectangle
/*    */   extends Rectangle
/*    */   implements Comparable<ComparableRectangle> {
/*    */   public ComparableRectangle(double width, double height) {
/*  7 */     super(width, height);
/*    */   }
/*    */ 
/*    */   
/*    */   public int compareTo(ComparableRectangle o) {
/* 12 */     if (getArea() > o.getArea())
/* 13 */       return 1; 
/* 14 */     if (getArea() < o.getArea()) {
/* 15 */       return -1;
/*    */     }
/* 17 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 22 */     return "Width: " + getWidth() + " Height: " + getHeight() + " Area: " + 
/* 23 */       getArea();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/ComparableRectangle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */