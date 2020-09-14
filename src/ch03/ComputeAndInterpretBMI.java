/*    */ package ch03;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ComputeAndInterpretBMI {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 10 */     System.out.print("Enter weight in pounds: ");
/* 11 */     double weight = input.nextDouble();
/*    */ 
/*    */     
/* 14 */     System.out.print("Enter height in inches: ");
/* 15 */     double height = input.nextDouble();
/*    */     
/* 17 */     double KILOGRAMS_PER_POUND = 0.45359237D;
/* 18 */     double METERS_PER_INCH = 0.0254D;
/*    */ 
/*    */     
/* 21 */     double weightInKilograms = weight * 0.45359237D;
/* 22 */     double heightInMeters = height * 0.0254D;
/* 23 */     double bmi = weightInKilograms / heightInMeters * heightInMeters;
/*    */ 
/*    */ 
/*    */     
/* 27 */     System.out.println("BMI is " + bmi);
/* 28 */     if (bmi < 18.5D) {
/* 29 */       System.out.println("Underweight");
/* 30 */     } else if (bmi < 25.0D) {
/* 31 */       System.out.println("Normal");
/* 32 */     } else if (bmi < 30.0D) {
/* 33 */       System.out.println("Overweight");
/*    */     } else {
/* 35 */       System.out.println("Obese");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch03/ComputeAndInterpretBMI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */