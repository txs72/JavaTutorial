/*    */ package ch19;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class GenericStack2<E>
/*    */ {
/* 30 */   int capacity = 10;
/* 31 */   int count = 0;
/* 32 */   private E[] list = (E[])new Object[this.capacity];
/*    */   
/*    */   public int getSize() {
/* 35 */     return this.count;
/*    */   }
/*    */   
/*    */   public E peek() throws Exception {
/* 39 */     if (isEmpty()) {
/* 40 */       throw new Exception("stack empty");
/*    */     }
/* 42 */     return this.list[this.count - 1];
/*    */   }
/*    */   
/*    */   public void push(E o) {
/* 46 */     if (this.count < this.capacity) {
/* 47 */       this.list[this.count++] = o;
/*    */     } else {
/* 49 */       System.out.println("capacity changed...");
/* 50 */       System.out.println("before: capacity = " + this.capacity);
/* 51 */       System.out.println("before: count = " + this.count);
/* 52 */       E[] temp = (E[])new Object[this.capacity * 2];
/*    */       
/* 54 */       System.arraycopy(this.list, 0, temp, 0, this.capacity);
/* 55 */       this.list = temp;
/* 56 */       this.list[this.count++] = o;
/* 57 */       this.capacity *= 2;
/* 58 */       System.out.println("after: capacity = " + this.capacity);
/* 59 */       System.out.println("after: count = " + this.count);
/*    */     } 
/*    */   }
/*    */   
/*    */   public E pop() throws Exception {
/* 64 */     if (isEmpty()) {
/* 65 */       throw new Exception("stack empty");
/*    */     }
/* 67 */     E o = this.list[this.count - 1];
/* 68 */     this.count--;
/* 69 */     return o;
/*    */   }
/*    */   
/*    */   public boolean isEmpty() {
/* 73 */     return (this.count == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 78 */     return "stack: " + this.list.toString();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/GenericStack2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */