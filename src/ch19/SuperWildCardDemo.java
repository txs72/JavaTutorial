/*    */ package ch19;
/*    */ 
/*    */ public class SuperWildCardDemo {
/*    */   public static void main(String[] args) {
/*  5 */     GenericStack<String> stack1 = new GenericStack<>();
/*  6 */     GenericStack<Object> stack2 = new GenericStack();
/*  7 */     stack2.push("Java");
/*  8 */     stack2.push(Integer.valueOf(2));
/*  9 */     stack1.push("Sun");
/* 10 */     add(stack1, stack2);
/* 11 */     AnyWildCardDemo.print(stack2);
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) {
/* 16 */     while (!stack1.isEmpty())
/* 17 */       stack2.push(stack1.pop()); 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/SuperWildCardDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */