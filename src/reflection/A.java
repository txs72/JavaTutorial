/*    */ package reflection;
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
/*    */ class A
/*    */ {
/*    */   public int print(int a, int b) {
/* 30 */     System.out.println(a + b);
/* 31 */     return a + b;
/*    */   }
/*    */   
/*    */   public String print(String a, String b) {
/* 35 */     System.out.println(a.toUpperCase() + ", " + b.toUpperCase());
/* 36 */     return a + ", " + b;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */