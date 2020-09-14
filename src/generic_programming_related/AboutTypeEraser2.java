/*    */ package generic_programming_related;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AboutTypeEraser2
/*    */ {
/*    */   public static void main(String[] args) {
/* 12 */     MyNode<String> mn = new MyNode(Integer.valueOf(5));
/* 13 */     Node<String> n = mn;
/* 14 */     n.setData("Hello");
/* 15 */     System.out.println(mn.data);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/generic_programming_related/AboutTypeEraser2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */