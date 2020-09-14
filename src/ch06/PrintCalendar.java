/*     */ package ch06;
/*     */ 
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class PrintCalendar
/*     */ {
/*     */   public static void main(String[] args) {
/*   8 */     Scanner input = new Scanner(System.in);
/*     */ 
/*     */     
/*  11 */     System.out.print("Enter full year (e.g., 2001): ");
/*  12 */     int year = input.nextInt();
/*     */ 
/*     */     
/*  15 */     System.out.print("Enter month in number between 1 and 12: ");
/*  16 */     int month = input.nextInt();
/*     */ 
/*     */     
/*  19 */     printMonth(year, month);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void printMonth(int year, int month) {
/*  25 */     printMonthTitle(year, month);
/*     */ 
/*     */     
/*  28 */     printMonthBody(year, month);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void printMonthTitle(int year, int month) {
/*  33 */     System.out.println("         " + getMonthName(month) + " " + year);
/*     */     
/*  35 */     System.out.println("-----------------------------");
/*  36 */     System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
/*     */   }
/*     */ 
/*     */   
/*     */   public static String getMonthName(int month) {
/*  41 */     String monthName = "";
/*  42 */     switch (month) { case 1:
/*  43 */         monthName = "January"; break;
/*  44 */       case 2: monthName = "February"; break;
/*  45 */       case 3: monthName = "March"; break;
/*  46 */       case 4: monthName = "April"; break;
/*  47 */       case 5: monthName = "May"; break;
/*  48 */       case 6: monthName = "June"; break;
/*  49 */       case 7: monthName = "July"; break;
/*  50 */       case 8: monthName = "August"; break;
/*  51 */       case 9: monthName = "September"; break;
/*  52 */       case 10: monthName = "October"; break;
/*  53 */       case 11: monthName = "November"; break;
/*  54 */       case 12: monthName = "December";
/*     */         break; }
/*     */     
/*  57 */     return monthName;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void printMonthBody(int year, int month) {
/*  63 */     int startDay = getStartDay(year, month);
/*     */ 
/*     */     
/*  66 */     int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
/*     */ 
/*     */     
/*  69 */     int i = 0;
/*  70 */     for (i = 0; i < startDay; i++) {
/*  71 */       System.out.print("    ");
/*     */     }
/*  73 */     for (i = 1; i <= numberOfDaysInMonth; i++) {
/*  74 */       System.out.printf("%4d", new Object[] { Integer.valueOf(i) });
/*     */       
/*  76 */       if ((i + startDay) % 7 == 0) {
/*  77 */         System.out.println();
/*     */       }
/*     */     } 
/*  80 */     System.out.println();
/*     */   }
/*     */ 
/*     */   
/*     */   public static int getStartDay(int year, int month) {
/*  85 */     int START_DAY_FOR_JAN_1_1800 = 3;
/*     */     
/*  87 */     int totalNumberOfDays = getTotalNumberOfDays(year, month);
/*     */ 
/*     */     
/*  90 */     return (totalNumberOfDays + 3) % 7;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int getTotalNumberOfDays(int year, int month) {
/*  95 */     int total = 0;
/*     */     
/*     */     int i;
/*  98 */     for (i = 1800; i < year; i++) {
/*  99 */       if (isLeapYear(i)) {
/* 100 */         total += 366;
/*     */       } else {
/* 102 */         total += 365;
/*     */       } 
/*     */     } 
/* 105 */     for (i = 1; i < month; i++) {
/* 106 */       total += getNumberOfDaysInMonth(year, i);
/*     */     }
/* 108 */     return total;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int getNumberOfDaysInMonth(int year, int month) {
/* 113 */     if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
/*     */     {
/* 115 */       return 31;
/*     */     }
/* 117 */     if (month == 4 || month == 6 || month == 9 || month == 11) {
/* 118 */       return 30;
/*     */     }
/* 120 */     if (month == 2) return isLeapYear(year) ? 29 : 28;
/*     */     
/* 122 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isLeapYear(int year) {
/* 127 */     return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
/*     */   }
/*     */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/PrintCalendar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */