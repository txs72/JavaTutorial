/*    */ package ch10;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ 
/*    */ public class LargeFactorial {
/*    */   public static void main(String[] args) {
/*  7 */     System.out.println("5000! is \n" + factorial(5000L));
/*    */   }
/*    */   
/*    */   public static BigInteger factorial(long n) {
/* 11 */     BigInteger result = new BigInteger("1");
/* 12 */     for (int i = 1; i <= n; i++) {
/* 13 */       result = result.multiply(new BigInteger(i + ""));
/*    */     }
/* 15 */     return result;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/LargeFactorial.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */