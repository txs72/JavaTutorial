/*    */ package ch04;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class OrderTwoCities {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 10 */     System.out.print("Enter the first city: ");
/* 11 */     String city1 = input.nextLine();
/* 12 */     System.out.print("Enter the second city: ");
/* 13 */     String city2 = input.nextLine();
/*    */     
/* 15 */     if (city1.compareTo(city2) < 0) {
/* 16 */       System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
/*    */     } else {
/*    */       
/* 19 */       System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch04/OrderTwoCities.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */