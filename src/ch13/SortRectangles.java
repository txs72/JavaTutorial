/*    */ package ch13;

import java.util.Arrays;

/*    */
/*    */ public class SortRectangles {
/*    */   public static void main(String[] args) {
/*  5 */     ComparableRectangle[] rectangles = { new ComparableRectangle(3.4D, 5.4D), new ComparableRectangle(13.24D, 55.4D), new ComparableRectangle(7.4D, 35.4D), new ComparableRectangle(1.4D, 25.4D) };
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 10 */     Arrays.sort((Object[])rectangles);
/* 11 */     for (Rectangle rectangle : rectangles) {
/* 12 */       System.out.print(rectangle + " ");
/* 13 */       System.out.println();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/SortRectangles.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */