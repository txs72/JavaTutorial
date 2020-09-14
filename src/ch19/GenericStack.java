/*    */ package ch19;
/*    */ 
/*    */ public class GenericStack<E> {
/*  4 */   private ArrayList<E> list = new ArrayList<>();
/*    */   
/*    */   public int getSize() {
/*  7 */     return this.list.size();
/*    */   }
/*    */   
/*    */   public E peek() {
/* 11 */     return this.list.get(getSize() - 1);
/*    */   }
/*    */   
/*    */   public void push(E o) {
/* 15 */     this.list.add(o);
/*    */   }
/*    */   
/*    */   public E pop() {
/* 19 */     E o = this.list.get(getSize() - 1);
/* 20 */     this.list.remove(getSize() - 1);
/* 21 */     return o;
/*    */   }
/*    */   
/*    */   public boolean isEmpty() {
/* 25 */     return this.list.isEmpty();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 30 */     return "stack: " + this.list.toString();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/GenericStack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */