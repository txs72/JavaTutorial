/*    */ package ch03;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ComputeTax
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 11 */     System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of household) Enter the filing status: ");
/*    */ 
/*    */     
/* 14 */     int status = input.nextInt();
/*    */ 
/*    */     
/* 17 */     System.out.print("Enter the taxable income: ");
/* 18 */     double income = input.nextDouble();
/*    */ 
/*    */     
/* 21 */     double tax = 0.0D;
/*    */     
/* 23 */     if (status == 0) {
/* 24 */       if (income <= 8350.0D) {
/* 25 */         tax = income * 0.1D;
/* 26 */       } else if (income <= 33950.0D) {
/* 27 */         tax = 835.0D + (income - 8350.0D) * 0.15D;
/* 28 */       } else if (income <= 82250.0D) {
/* 29 */         tax = 4675.0D + (income - 33950.0D) * 0.25D;
/*    */       }
/* 31 */       else if (income <= 171550.0D) {
/* 32 */         tax = 16750.0D + (income - 82250.0D) * 0.28D;
/*    */       }
/* 34 */       else if (income <= 372950.0D) {
/* 35 */         tax = 41754.0D + (income - 171550.0D) * 0.33D;
/*    */       }
/*    */       else {
/*    */         
/* 39 */         tax = 108216.0D + (income - 372950.0D) * 0.35D;
/*    */       }
/*    */     
/*    */     }
/* 43 */     else if (status != 1) {
/*    */ 
/*    */       
/* 46 */       if (status != 2)
/*    */       {
/*    */         
/* 49 */         if (status != 3) {
/*    */ 
/*    */ 
/*    */           
/* 53 */           System.out.println("Error: invalid status");
/* 54 */           System.exit(1);
/*    */         } 
/*    */       }
/*    */     } 
/* 58 */     System.out.println("Tax is " + ((int)(tax * 100.0D) / 100.0D));
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch03/ComputeTax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */