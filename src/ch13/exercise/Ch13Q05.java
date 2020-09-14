/*    */ package ch13.exercise;
/*    */ 
/*    */ public class Ch13Q05 {
/*    */   public static void main(String[] args) {
/*  5 */     GeometricObject g1 = new Circle(5.0D);
/*  6 */     GeometricObject g2 = new Circle(6.0D);
/*  7 */     GeometricObject g3 = new Rectangle(2.0D, 4.0D);
/*  8 */     GeometricObject g4 = new Rectangle(3.0D, 5.0D);
/*    */ 
/*    */     
/* 11 */     if (g1.compareTo(g2) > 0) {
/* 12 */       System.out.println(g1);
/*    */     } else {
/*    */       
/* 15 */       System.out.println(g2);
/*    */     } 
/*    */ 
/*    */     
/* 19 */     System.out.println(GeometricObject.max(g3, g4));
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/exercise/Ch13Q05.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */