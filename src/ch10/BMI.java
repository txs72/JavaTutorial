/*    */ package ch10;
/*    */ 
/*    */ public class BMI {
/*    */   private String name;
/*    */   private int age;
/*    */   private double weight;
/*    */   private double height;
/*    */   public static final double KILOGRAMS_PER_POUND = 0.45359237D;
/*    */   public static final double METERS_PER_INCH = 0.0254D;
/*    */   
/*    */   public BMI(String name, int age, double weight, double height) {
/* 12 */     this.name = name;
/* 13 */     this.age = age;
/* 14 */     this.weight = weight;
/* 15 */     this.height = height;
/*    */   }
/*    */   
/*    */   public BMI(String name, double weight, double height) {
/* 19 */     this(name, 20, weight, height);
/*    */   }
/*    */   
/*    */   public double getBMI() {
/* 23 */     double bmi = this.weight * 0.45359237D / this.height * 0.0254D * this.height * 0.0254D;
/*    */     
/* 25 */     return Math.round(bmi * 100.0D) / 100.0D;
/*    */   }
/*    */   
/*    */   public String getStatus() {
/* 29 */     double bmi = getBMI();
/* 30 */     if (bmi < 18.5D)
/* 31 */       return "Underweight"; 
/* 32 */     if (bmi < 25.0D)
/* 33 */       return "Normal"; 
/* 34 */     if (bmi < 30.0D) {
/* 35 */       return "Overweight";
/*    */     }
/* 37 */     return "Obese";
/*    */   }
/*    */   
/*    */   public String getName() {
/* 41 */     return this.name;
/*    */   }
/*    */   
/*    */   public int getAge() {
/* 45 */     return this.age;
/*    */   }
/*    */   
/*    */   public double getWeight() {
/* 49 */     return this.weight;
/*    */   }
/*    */   
/*    */   public double getHeight() {
/* 53 */     return this.height;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/BMI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */