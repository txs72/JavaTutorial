/*    */ package ch06;
/*    */ 
/*    */ public class Increment {
/*    */   public static void main(String[] args) {
/*  5 */     String s = "hello";
/*  6 */     System.out.println("Before the call, s is " + s);
/*  7 */     change(s);
/*  8 */     System.out.println("after the call, s is " + s);
/*    */   }
/*    */   
/*    */   public static void change(String s1) {
/* 12 */     s1 = "world";
/* 13 */     System.out.println(s1);
/*    */   }
/*    */   
/*    */   public static void increment(int n) {
/* 17 */     n++;
/* 18 */     System.out.println("n inside the method is " + n);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/Increment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */