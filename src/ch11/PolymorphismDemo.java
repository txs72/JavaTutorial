/*    */ package ch11;
/*    */ 
/*    */ 
/*    */ public class PolymorphismDemo
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     displayObject(new CircleFromSimpleGeometricObject(1.0D, "red", false));
/*    */     
/*  9 */     displayObject(new RectangleFromSimpleGeometricObject(1.0D, 1.0D, "black", true));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void displayObject(SimpleGeometricObject object) {
/* 15 */     System.out.println("Created on " + object.getDateCreated() + ". Color is " + object
/* 16 */         .getColor());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/PolymorphismDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */