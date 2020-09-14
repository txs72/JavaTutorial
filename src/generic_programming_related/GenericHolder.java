/*    */ package generic_programming_related;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class GenericHolder<T>
/*    */ {
/*    */   private T obj;
/*    */   
/*    */   public T getObj() {
/* 38 */     return this.obj;
/*    */   }
/*    */   public void setObj(T obj) {
/* 41 */     this.obj = obj;
/*    */   }
/*    */   public void showClass() {
/* 44 */     System.out.println(this.obj.getClass().getName());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/generic_programming_related/GenericHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */