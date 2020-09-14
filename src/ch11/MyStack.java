/*    */ package ch11;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class MyStack {
/*  6 */   private ArrayList<Object> list = new ArrayList();
/*    */   
/*    */   public boolean isEmpty() {
/*  9 */     return this.list.isEmpty();
/*    */   }
/*    */   
/*    */   public int getSize() {
/* 13 */     return this.list.size();
/*    */   }
/*    */   
/*    */   public Object peek() {
/* 17 */     return this.list.get(getSize() - 1);
/*    */   }
/*    */   
/*    */   public Object pop() {
/* 21 */     Object o = this.list.get(getSize() - 1);
/* 22 */     this.list.remove(getSize() - 1);
/* 23 */     return o;
/*    */   }
/*    */   
/*    */   public void push(Object o) {
/* 27 */     this.list.add(o);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 32 */     return "stack: " + this.list.toString();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/MyStack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */