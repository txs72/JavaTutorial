/*    */ package ch19;
/*    */ 
/*    */ public class AnyWildCardDemo {
/*    */   public static void main(String[] args) {
/*  5 */     GenericStack<Integer> intStack = new GenericStack<>();
/*  6 */     intStack.push(Integer.valueOf(1));
/*  7 */     intStack.push(Integer.valueOf(2));
/*  8 */     intStack.push(Integer.valueOf(-2));
/*    */     
/* 10 */     print(intStack);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void print(GenericStack<?> stack) {
/* 15 */     while (!stack.isEmpty())
/* 16 */       System.out.print((new StringBuilder()).append(stack.pop()).append(" ").toString()); 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/AnyWildCardDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */