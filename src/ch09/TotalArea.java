/*    */ package ch09;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TotalArea
/*    */ {
/*    */   public static void main(String[] args) {
/* 10 */     CircleWithPrivateDataFields[] circleArray = createCircleArray();
/*    */ 
/*    */     
/* 13 */     printCircleArray(circleArray);
/*    */   }
/*    */ 
/*    */   
/*    */   public static CircleWithPrivateDataFields[] createCircleArray() {
/* 18 */     CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
/*    */ 
/*    */     
/* 21 */     for (int i = 0; i < circleArray.length; i++) {
/* 22 */       circleArray[i] = new CircleWithPrivateDataFields(
/* 23 */           Math.random() * 100.0D);
/*    */     }
/*    */ 
/*    */     
/* 27 */     return circleArray;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
/* 33 */     System.out.printf("%-30s%-15s\n", new Object[] { "Radius", "Area" });
/* 34 */     for (int i = 0; i < circleArray.length; i++) {
/* 35 */       System.out.printf("%-30f%-15f\n", new Object[] { Double.valueOf(circleArray[i].getRadius()), 
/* 36 */             Double.valueOf(circleArray[i].getArea()) });
/*    */     } 
/*    */     
/* 39 */     System.out.println("-----------------------------------------");
/*    */ 
/*    */     
/* 42 */     System.out.printf("%-30s%-15f\n", new Object[] { "The total areas of circles is", 
/* 43 */           Double.valueOf(sum(circleArray)) });
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static double sum(CircleWithPrivateDataFields[] circleArray) {
/* 50 */     double sum = 0.0D;
/*    */ 
/*    */     
/* 53 */     for (int i = 0; i < circleArray.length; i++) {
/* 54 */       sum += circleArray[i].getArea();
/*    */     }
/* 56 */     return sum;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/TotalArea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */