/*    */ package ch13;
/*    */ import java.math.BigDecimal;
/*    */ import java.math.BigInteger;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class LargestNumbers {
/*    */   public static void main(String[] args) {
/*  8 */     ArrayList<Number> list = new ArrayList<>();
/*    */     
/* 10 */     list.add(Integer.valueOf(45));
/* 11 */     list.add(Double.valueOf(3445.53D));
/*    */     
/* 13 */     list.add(new BigInteger("3432323234344343101"));
/*    */     
/* 15 */     list.add(new BigDecimal("2.0909090989091343433344343"));
/*    */     
/* 17 */     System.out.println("The largest number is " + 
/* 18 */         getLargestNumber(list));
/*    */   }
/*    */   
/*    */   public static Number getLargestNumber(ArrayList<Number> list) {
/* 22 */     if (list == null || list.size() == 0) {
/* 23 */       return null;
/*    */     }
/* 25 */     Number number = list.get(0);
/* 26 */     for (int i = 1; i < list.size(); i++) {
/* 27 */       if (number.doubleValue() < ((Number)list.get(i)).doubleValue())
/* 28 */         number = list.get(i); 
/*    */     } 
/* 30 */     return number;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/LargestNumbers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */