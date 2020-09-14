/*    */ package ch11;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class DistinctNumbers {
/*    */   public static void main(String[] args) {
/*    */     int value;
/*  8 */     ArrayList<Integer> list = new ArrayList<>();
/*    */     
/* 10 */     Scanner input = new Scanner(System.in);
/* 11 */     System.out.print("Enter integers (input ends with 0): ");
/*    */ 
/*    */     
/*    */     do {
/* 15 */       value = input.nextInt();
/*    */       
/* 17 */       if (list.contains(Integer.valueOf(value)) || value == 0)
/* 18 */         continue;  list.add(Integer.valueOf(value));
/* 19 */     } while (value != 0);
/*    */ 
/*    */     
/* 22 */     for (int i = 0; i < list.size(); i++)
/* 23 */       System.out.print((new StringBuilder()).append(list.get(i)).append(" ").toString()); 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/DistinctNumbers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */