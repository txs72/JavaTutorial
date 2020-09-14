/*    */ package ch05;
/*    */ 
/*    */ public class TestBreak {
/*    */   public static void main(String[] args) {
/*  5 */     int sum = 0;
/*  6 */     int number = 0;
/*    */     
/*  8 */     while (number < 20) {
/*  9 */       number++;
/* 10 */       sum += number;
/* 11 */       if (sum >= 100) {
/*    */         break;
/*    */       }
/*    */     } 
/* 15 */     System.out.println("The number is " + number);
/* 16 */     System.out.println("The sum is " + sum);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/TestBreak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */