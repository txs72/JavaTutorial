/*    */ package ch04;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class GuessBirthday {
/*    */   public static void main(String[] args) {
/*  7 */     String set1 = " 1  3  5  7\n 9 11 13 15\n17 19 21 23\n25 27 29 31";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     String set2 = " 2  3  6  7\n10 11 14 15\n18 19 22 23\n26 27 30 31";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 19 */     String set3 = " 4  5  6  7\n12 13 14 15\n20 21 22 23\n28 29 30 31";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     String set4 = " 8  9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 31 */     String set5 = "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     int day = 0;
/*    */ 
/*    */     
/* 40 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 43 */     System.out.print("Is your birthday in Set1?\n");
/* 44 */     System.out.print(set1);
/* 45 */     System.out.print("\nEnter 0 for No and 1 for Yes: ");
/* 46 */     int answer = input.nextInt();
/*    */     
/* 48 */     if (answer == 1) {
/* 49 */       day++;
/*    */     }
/*    */     
/* 52 */     System.out.print("\nIs your birthday in Set2?\n");
/* 53 */     System.out.print(set2);
/* 54 */     System.out.print("\nEnter 0 for No and 1 for Yes: ");
/* 55 */     answer = input.nextInt();
/*    */     
/* 57 */     if (answer == 1) {
/* 58 */       day += 2;
/*    */     }
/*    */     
/* 61 */     System.out.print("Is your birthday in Set3?\n");
/* 62 */     System.out.print(set3);
/* 63 */     System.out.print("\nEnter 0 for No and 1 for Yes: ");
/* 64 */     answer = input.nextInt();
/*    */     
/* 66 */     if (answer == 1) {
/* 67 */       day += 4;
/*    */     }
/*    */     
/* 70 */     System.out.print("\nIs your birthday in Set4?\n");
/* 71 */     System.out.print(set4);
/* 72 */     System.out.print("\nEnter 0 for No and 1 for Yes: ");
/* 73 */     answer = input.nextInt();
/*    */     
/* 75 */     if (answer == 1) {
/* 76 */       day += 8;
/*    */     }
/*    */     
/* 79 */     System.out.print("\nIs your birthday in Set5?\n");
/* 80 */     System.out.print(set5);
/* 81 */     System.out.print("\nEnter 0 for No and 1 for Yes: ");
/* 82 */     answer = input.nextInt();
/*    */     
/* 84 */     if (answer == 1) {
/* 85 */       day += 16;
/*    */     }
/* 87 */     System.out.println("\nYour birthday is " + day + "!");
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch04/GuessBirthday.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */