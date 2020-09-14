/*    */ package ch08;
/*    */ 
/*    */ public class FindNearestPoints {
/*    */   public static void main(String[] args) {
/*  5 */     double[][] points = { { -1.0D, 3.0D }, { -1.0D, -1.0D }, { 1.0D, 1.0D }, { 2.0D, 0.5D }, { 2.0D, -1.0D }, { 3.0D, 3.0D }, { 4.0D, 2.0D }, { 4.0D, -0.5D } };
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 10 */     double distance = 0.0D;
/* 11 */     double minDistance = 10000.0D;
/* 12 */     int minIndex1 = -1, minIndex2 = -1;
/* 13 */     for (int i = 0; i < points.length; i++) {
/* 14 */       for (int j = i + 1; j < points.length; j++) {
/* 15 */         distance = Math.sqrt((points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]));
/*    */         
/* 17 */         if (distance < minDistance) {
/* 18 */           minDistance = distance;
/* 19 */           minIndex1 = i;
/* 20 */           minIndex2 = j;
/*    */         } 
/*    */       } 
/*    */     } 
/* 24 */     System.out.println("Shortest distance = " + minDistance);
/* 25 */     System.out.println("between p[" + points[minIndex1][0] + "," + points[minIndex1][1] + "]");
/* 26 */     System.out.println("    and p[" + points[minIndex2][0] + "," + points[minIndex2][1] + "]");
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch08/FindNearestPoints.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */