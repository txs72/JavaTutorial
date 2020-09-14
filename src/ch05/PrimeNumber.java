/*    */ package ch05;
/*    */ 
/*    */ public class PrimeNumber {
/*    */   public static void main(String[] args) {
/*  5 */     int NUMBER_OF_PRIMES = 50;
/*  6 */     int NUMBER_OF_PRIMES_PER_LINE = 10;
/*  7 */     int count = 0;
/*  8 */     int number = 2;
/*    */     
/* 10 */     System.out.println("The first 50 prime numbers are \n");
/*    */ 
/*    */     
/* 13 */     while (count < 50) {
/*    */       
/* 15 */       boolean isPrime = true;
/*    */ 
/*    */       
/* 18 */       for (int divisor = 2; divisor <= number / 2; divisor++) {
/* 19 */         if (number % divisor == 0) {
/* 20 */           isPrime = false;
/*    */           
/*    */           break;
/*    */         } 
/*    */       } 
/*    */       
/* 26 */       if (isPrime) {
/* 27 */         count++;
/*    */         
/* 29 */         if (count % 10 == 0) {
/*    */           
/* 31 */           System.out.println(number);
/*    */         } else {
/*    */           
/* 34 */           System.out.print(number + " ");
/*    */         } 
/*    */       } 
/*    */       
/* 38 */       number++;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/PrimeNumber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */