/*    */ package generic_programming_related;
/*    */ 
/*    */ public class AboutTypeEraser1 {
/*    */   public static void main(String[] args) {
/*  5 */     SimpleHolder holder1 = new SimpleHolder();
/*  6 */     holder1.setObj("Item");
/*  7 */     String ss = (String)holder1.getObj();
/*  8 */     System.out.println(ss);
/*  9 */     System.out.println("holder1's type: " + holder1.getClass().getName());
/*    */     
/* 11 */     System.out.println("Test type eraser: ");
/* 12 */     GenericHolder<String> holder2 = new GenericHolder<>();
/* 13 */     holder2.setObj("Item");
/*    */ 
/*    */     
/* 16 */     System.out.println("holder2's type: " + holder2.getClass().getName());
/*    */     
/* 18 */     GenericHolder<Integer> holder3 = new GenericHolder<>();
/* 19 */     holder3.setObj(Integer.valueOf(10));
/*    */     
/* 21 */     System.out.println("holder3's type: " + holder3.getClass().getName());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/generic_programming_related/AboutTypeEraser1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */