/*    */ package ch07;
/*    */ 
/*    */ public class AnalyzeNumbers {
/*    */   public static void main(String[] args) {
/*  5 */     Scanner input = new Scanner(System.in);
/*  6 */     System.out.print("Enter the number of items: ");
/*  7 */     int n = input.nextInt();
/*  8 */     double[] numbers = new double[n];
/*  9 */     double sum = 0.0D;
/*    */     
/* 11 */     System.out.print("Enter the numbers: ");
/* 12 */     for (int i = 0; i < n; i++) {
/* 13 */       numbers[i] = input.nextDouble();
/* 14 */       sum += numbers[i];
/*    */     } 
/*    */     
/* 17 */     double average = sum / n;
/*    */     
/* 19 */     int count = 0;
/* 20 */     for (int j = 0; j < n; j++) {
/* 21 */       if (numbers[j] > average)
/* 22 */         count++; 
/*    */     } 
/* 24 */     System.out.println("Average is " + average);
/* 25 */     System.out.println("Number of elements above the average " + count);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch07/AnalyzeNumbers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */