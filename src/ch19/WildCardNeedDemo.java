/*    */ package ch19;
/*    */ 
/*    */ public class WildCardNeedDemo {
/*    */   public static void main(String[] args) {
/*  5 */     GenericStack<Integer> intStack = new GenericStack<>();
/*  6 */     intStack.push(Integer.valueOf(1));
/*  7 */     intStack.push(Integer.valueOf(2));
/*  8 */     intStack.push(Integer.valueOf(-2));
/*    */ 
/*    */     
/* 11 */     System.out.print("The max number is " + max((GenericStack)intStack));
/*    */   }
/*    */ 
/*    */   
/*    */   public static double max(GenericStack<? extends Number> stack) {
/* 16 */     double max = ((Number)stack.pop()).doubleValue();
/*    */     
/* 18 */     while (!stack.isEmpty()) {
/* 19 */       double value = ((Number)stack.pop()).doubleValue();
/* 20 */       if (value > max) {
/* 21 */         max = value;
/*    */       }
/*    */     } 
/* 24 */     return max;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/WildCardNeedDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */