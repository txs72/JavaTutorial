/*    */ package ch13;
/*    */ import java.math.BigInteger;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ public class SortComparableObjects {
/*    */   public static void main(String[] args) {
/*  7 */     String[] cities = { "Savannah", "Boston", "Atlanta", "Tampa" };
/*  8 */     Arrays.sort((Object[])cities);
/*  9 */     for (String city : cities)
/* 10 */       System.out.print(city + " "); 
/* 11 */     System.out.println();
/*    */     
/* 13 */     BigInteger[] hugeNumbers = { new BigInteger("2323231092923992"), new BigInteger("432232323239292"), new BigInteger("54623239292") };
/*    */ 
/*    */     
/* 16 */     Arrays.sort((Object[])hugeNumbers);
/* 17 */     for (BigInteger number : hugeNumbers)
/* 18 */       System.out.print(number + " "); 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/SortComparableObjects.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */