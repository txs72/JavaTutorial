/*    */ package ch09;
/*    */ 
/*    */ public class TestCircleWithStaticMembers
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     System.out.println("Before creating objects");
/*  7 */     System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfObjects);
/*    */ 
/*    */ 
/*    */     
/* 11 */     CircleWithStaticMembers c1 = new CircleWithStaticMembers();
/*    */ 
/*    */     
/* 14 */     System.out.println("\nAfter creating c1");
/* 15 */     System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     CircleWithStaticMembers c2 = new CircleWithStaticMembers(5.0D);
/*    */ 
/*    */     
/* 23 */     c1.radius = 9.0D;
/*    */ 
/*    */     
/* 26 */     System.out.println("\nAfter creating c2 and modifying c1");
/* 27 */     System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");
/*    */ 
/*    */     
/* 30 */     System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/TestCircleWithStaticMembers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */