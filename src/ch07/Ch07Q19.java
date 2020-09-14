/*    */ package ch07;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch07Q19 {
/*    */   public static void main(String[] args) {
/*  8 */     Scanner scanner = new Scanner(System.in);
/*  9 */     System.out.print("Enter list: ");
/* 10 */     int totalNumbers = scanner.nextInt();
/* 11 */     int[] orig = new int[totalNumbers];
/* 12 */     for (int i = 0; i < totalNumbers; i++) {
/* 13 */       orig[i] = scanner.nextInt();
/*    */     }
/* 15 */     int[] sorted = new int[totalNumbers];
/* 16 */     System.arraycopy(orig, 0, sorted, 0, orig.length);
/* 17 */     Arrays.sort(sorted);
/* 18 */     boolean isSorted = true;
/* 19 */     for (int j = 0; j < sorted.length; j++) {
/* 20 */       if (orig[j] != sorted[j]) {
/* 21 */         isSorted = false;
/*    */         break;
/*    */       } 
/*    */     } 
/* 25 */     if (isSorted) {
/* 26 */       System.out.println("The list is already sorted");
/*    */     } else {
/*    */       
/* 29 */       System.out.println("The list is not sorted");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch07/Ch07Q19.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */