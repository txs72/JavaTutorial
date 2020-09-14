/*    */ package ch10;
/*    */ 
/*    */ public class TestStackOfIntegers {
/*    */   public static void main(String[] args) {
/*  5 */     StackOfIntegers stack = new StackOfIntegers();
/*    */     
/*  7 */     for (int i = 0; i < 10; i++) {
/*  8 */       stack.push(i);
/*    */     }
/* 10 */     while (!stack.empty())
/* 11 */       System.out.print(stack.pop() + " "); 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/TestStackOfIntegers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */