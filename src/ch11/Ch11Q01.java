/*    */ package ch11;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch11Q01 {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner scanner = new Scanner(System.in);
/*  8 */     System.out.print("Please input side1,2,3: ");
/*    */     
/* 10 */     double s1 = scanner.nextDouble();
/* 11 */     double s2 = scanner.nextDouble();
/* 12 */     double s3 = scanner.nextDouble();
/* 13 */     String color = scanner.next();
/* 14 */     boolean filled = scanner.nextBoolean();
/*    */     
/* 16 */     Triangle triangle = new Triangle(color, filled, s1, s2, s3);
/* 17 */     System.out.println("Triangle's area: " + triangle.getArea());
/* 18 */     System.out.println("Triangle's perimeter: " + triangle.getPerimeter());
/* 19 */     System.out.println("Triangle's color: " + triangle.getColor());
/* 20 */     System.out.println("Triangle's filled: " + triangle.isFilled());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/Ch11Q01.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */