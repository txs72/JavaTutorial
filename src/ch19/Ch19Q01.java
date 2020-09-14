/*    */ package ch19;
/*    */ 
/*    */ public class Ch19Q01 {
/*    */   public static void main(String[] args) {
/*  5 */     GenericStack2<Integer> myStack = new GenericStack2<>();
/*  6 */     for (int i = 0; i < 20; i++) {
/*  7 */       myStack.push(Integer.valueOf(i));
/*    */     }
/*    */     try {
/* 10 */       System.out.println(myStack.peek());
/* 11 */       System.out.println(myStack.pop());
/* 12 */       System.out.println(myStack.pop());
/* 13 */       System.out.println(myStack.pop());
/* 14 */       System.out.println(myStack.pop());
/* 15 */       System.out.println(myStack.pop());
/* 16 */       myStack.push(Integer.valueOf(100));
/* 17 */       System.out.println(myStack.pop());
/* 18 */       System.out.println(myStack.pop());
/* 19 */       System.out.println(myStack.pop());
/* 20 */       System.out.println(myStack.pop());
/*    */     }
/* 22 */     catch (Exception e) {
/* 23 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/Ch19Q01.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */