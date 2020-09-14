/*    */ package ch08;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Weather {
/*    */   public static void main(String[] args) {
/*  7 */     int NUMBER_OF_DAYS = 10;
/*  8 */     int NUMBER_OF_HOURS = 24;
/*  9 */     double[][][] data = new double[10][24][2];
/*    */ 
/*    */     
/* 12 */     Scanner input = new Scanner(System.in);
/*    */     
/* 14 */     for (int k = 0; k < 240; k++) {
/* 15 */       int day = input.nextInt();
/* 16 */       int hour = input.nextInt();
/* 17 */       double temperature = input.nextDouble();
/* 18 */       double humidity = input.nextDouble();
/* 19 */       data[day - 1][hour - 1][0] = temperature;
/* 20 */       data[day - 1][hour - 1][1] = humidity;
/*    */     } 
/*    */ 
/*    */     
/* 24 */     for (int i = 0; i < 10; i++) {
/* 25 */       double dailyTemperatureTotal = 0.0D, dailyHumidityTotal = 0.0D;
/* 26 */       for (int j = 0; j < 24; j++) {
/* 27 */         dailyTemperatureTotal += data[i][j][0];
/* 28 */         dailyHumidityTotal += data[i][j][1];
/*    */       } 
/*    */ 
/*    */       
/* 32 */       System.out.println("Day  " + i + "'s average temperature is " + (dailyTemperatureTotal / 24.0D));
/*    */       
/* 34 */       System.out.println("Day  " + i + "'s average humidity is " + (dailyHumidityTotal / 24.0D));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch08/Weather.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */