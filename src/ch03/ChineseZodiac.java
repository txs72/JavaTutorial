/*    */ package ch03;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ChineseZodiac {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*    */     
/*  9 */     System.out.print("Enter a year: ");
/* 10 */     int year = input.nextInt();
/*    */     
/* 12 */     switch (year % 12) { case 0:
/* 13 */         System.out.println("monkey"); break;
/* 14 */       case 1: System.out.println("rooster"); break;
/* 15 */       case 2: System.out.println("dog"); break;
/* 16 */       case 3: System.out.println("pig"); break;
/* 17 */       case 4: System.out.println("rat"); break;
/* 18 */       case 5: System.out.println("ox"); break;
/* 19 */       case 6: System.out.println("tiger"); break;
/* 20 */       case 7: System.out.println("rabbit"); break;
/* 21 */       case 8: System.out.println("dragon"); break;
/* 22 */       case 9: System.out.println("snake"); break;
/* 23 */       case 10: System.out.println("horse"); break;
/* 24 */       case 11: System.out.println("sheep");
/*    */         break; }
/*    */   
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch03/ChineseZodiac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */