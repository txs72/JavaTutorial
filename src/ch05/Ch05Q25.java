/*    */ package ch05;
/*    */ 
/*    */ public class Ch05Q25 {
/*    */   public static void main(String[] args) {
/*  5 */     double pi = 0.0D;
/*  6 */     for (int i = 10000; i <= 100000; i += 10000) {
/*  7 */       int flag = 1;
/*  8 */       for (int j = 1; j <= i; j++) {
/*  9 */         pi += flag * 1.0D / (2 * j - 1);
/* 10 */         flag *= -1;
/*    */       } 
/* 12 */       System.out.println(pi * 4.0D);
/* 13 */       pi = 0.0D;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/Ch05Q25.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */