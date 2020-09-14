/*    */ package ch10;
/*    */ 
/*    */ public class UseBMIClass {
/*    */   public static void main(String[] args) {
/*  5 */     BMI bmi1 = new BMI("John Doe", 18, 145.0D, 70.0D);
/*  6 */     System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1
/*  7 */         .getBMI() + " " + bmi1.getStatus());
/*    */     
/*  9 */     BMI bmi2 = new BMI("Peter King", 215.0D, 70.0D);
/* 10 */     System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2
/* 11 */         .getBMI() + " " + bmi2.getStatus());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/UseBMIClass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */