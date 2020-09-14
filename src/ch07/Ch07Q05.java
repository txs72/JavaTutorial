/*    */ package ch07;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch07Q05 {
/*    */   public static void main(String[] args) {
/*  7 */     int INPUT_COUNT = 10;
/*  8 */     Scanner scanner = new Scanner(System.in);
/*    */     
/* 10 */     int[] output = new int[10];
/* 11 */     int current = 0;
/* 12 */     System.out.print("Enter ten numbers: "); int i;
/* 13 */     for (i = 0; i < 10; i++) {
/* 14 */       int input = scanner.nextInt();
/* 15 */       if (!hasThisNumber(output, input)) {
/* 16 */         addToMyNumbers(output, input, current++);
/*    */       }
/*    */     } 
/* 19 */     System.out.println("The number of distinct number is " + current);
/* 20 */     System.out.print("The distinct numbers are: ");
/* 21 */     for (i = 0; i < current; i++) {
/* 22 */       System.out.print(output[i] + " ");
/*    */     }
/*    */   }
/*    */   
/*    */   public static void addToMyNumbers(int[] output, int key, int index) {
/* 27 */     output[index] = key;
/*    */   }
/*    */   
/*    */   public static boolean hasThisNumber(int[] myData, int key) {
/* 31 */     boolean found = false;
/* 32 */     for (int i = 0; i < myData.length; i++) {
/* 33 */       if (key == myData[i]) {
/* 34 */         found = true;
/*    */         break;
/*    */       } 
/*    */     } 
/* 38 */     return found;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch07/Ch07Q05.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */