/*    */ package ch13;
/*    */ 
/*    */ public class TestEdible {
/*    */   public static void main(String[] args) {
/*  5 */     Object[] objects = { new Tiger(), new Chicken(), new Apple() };
/*  6 */     for (int i = 0; i < objects.length; i++) {
/*  7 */       if (objects[i] instanceof Edible) {
/*  8 */         System.out.println(((Edible)objects[i]).howToEat());
/*    */       }
/* 10 */       if (objects[i] instanceof Animal)
/* 11 */         System.out.println(((Animal)objects[i]).sound()); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/TestEdible.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */