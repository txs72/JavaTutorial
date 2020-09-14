/*    */ package ch10;
/*    */ 
/*    */ public class StackOfIntegers
/*    */ {
/*    */   private int[] elements;
/*    */   private int size;
/*    */   public static final int DEFAULT_CAPACITY = 16;
/*    */   
/*    */   public StackOfIntegers() {
/* 10 */     this(16);
/*    */   }
/*    */ 
/*    */   
/*    */   public StackOfIntegers(int capacity) {
/* 15 */     this.elements = new int[capacity];
/*    */   }
/*    */ 
/*    */   
/*    */   public void push(int value) {
/* 20 */     if (this.size >= this.elements.length) {
/* 21 */       int[] temp = new int[this.elements.length * 2];
/* 22 */       System.arraycopy(this.elements, 0, temp, 0, this.elements.length);
/* 23 */       this.elements = temp;
/*    */     } 
/*    */     
/* 26 */     this.elements[this.size++] = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public int pop() {
/* 31 */     return this.elements[--this.size];
/*    */   }
/*    */ 
/*    */   
/*    */   public int peek() {
/* 36 */     return this.elements[this.size - 1];
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean empty() {
/* 41 */     return (this.size == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getSize() {
/* 46 */     return this.size;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/StackOfIntegers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */