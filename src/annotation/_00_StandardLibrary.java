/*    */ package annotation;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ 
/*    */ public class _00_StandardLibrary
/*    */ {
/*    */   public static void main(String[] args) {
/* 10 */     Date d = new Date();
/* 11 */     System.out.println(d.getDate());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 20 */     return "std_lib";
/*    */   }
/*    */ 
/*    */   
/*    */   public void suppressDeprecatedWarning() {
/* 25 */     Date d = new Date();
/* 26 */     System.out.println(d.getDate());
/*    */   }
/*    */ 
/*    */   
/*    */   public void suppressUncheckedWarning() {
/* 31 */     List<String> myList = new ArrayList<>();
/*    */   }
/*    */ 
/*    */   
/*    */   @SafeVarargs
/*    */   public static void safeVarargs(int... a) {
/* 37 */     List<Integer> l1 = new ArrayList();
/* 38 */     List<Integer> l2 = l1;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/annotation/_00_StandardLibrary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */