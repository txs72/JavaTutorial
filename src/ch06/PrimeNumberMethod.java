/*    */ package ch06;
/*    */ 
/*    */ public class PrimeNumberMethod {
/*    */   public static void main(String[] args) {
/*  5 */     System.out.println("The first 50 prime numbers are \n");
/*  6 */     printPrimeNumbers(50);
/*    */   }
/*    */   
/*    */   public static void printPrimeNumbers(int numberOfPrimes) {
/* 10 */     int NUMBER_OF_PRIMES_PER_LINE = 10;
/* 11 */     int count = 0;
/* 12 */     int number = 2;
/*    */ 
/*    */     
/* 15 */     while (count < numberOfPrimes) {
/*    */       
/* 17 */       if (isPrime(number)) {
/* 18 */         count++;
/*    */         
/* 20 */         if (count % 10 == 0) {
/*    */           
/* 22 */           System.out.printf("%-5s\n", new Object[] { Integer.valueOf(number) });
/*    */         } else {
/*    */           
/* 25 */           System.out.printf("%-5s", new Object[] { Integer.valueOf(number) });
/*    */         } 
/*    */       } 
/*    */       
/* 29 */       number++;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean isPrime(int number) {
/* 35 */     for (int divisor = 2; divisor <= number / 2; divisor++) {
/* 36 */       if (number % divisor == 0) {
/* 37 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 41 */     return true;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/PrimeNumberMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */