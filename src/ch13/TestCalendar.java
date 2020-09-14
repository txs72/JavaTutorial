/*    */ package ch13;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ import java.util.GregorianCalendar;
/*    */ 
/*    */ public class TestCalendar {
/*    */   public static void main(String[] args) {
/*  8 */     Calendar calendar = new GregorianCalendar();
/*  9 */     System.out.println("Current time is " + new Date());
/* 10 */     System.out.println("YEAR: " + calendar.get(1));
/* 11 */     System.out.println("MONTH: " + calendar.get(2));
/* 12 */     System.out.println("DATE: " + calendar.get(5));
/* 13 */     System.out.println("HOUR: " + calendar.get(10));
/* 14 */     System.out.println("HOUR_OF_DAY: " + calendar
/* 15 */         .get(11));
/* 16 */     System.out.println("MINUTE: " + calendar.get(12));
/* 17 */     System.out.println("SECOND: " + calendar.get(13));
/* 18 */     System.out.println("DAY_OF_WEEK: " + calendar
/* 19 */         .get(7));
/* 20 */     System.out.println("DAY_OF_MONTH: " + calendar
/* 21 */         .get(5));
/* 22 */     System.out.println("DAY_OF_YEAR: " + calendar
/* 23 */         .get(6));
/* 24 */     System.out.println("WEEK_OF_MONTH: " + calendar
/* 25 */         .get(4));
/* 26 */     System.out.println("WEEK_OF _YEAR: " + calendar
/* 27 */         .get(3));
/* 28 */     System.out.println("AM_PM: " + calendar.get(9));
/*    */ 
/*    */     
/* 31 */     Calendar calendar1 = new GregorianCalendar(2017, 4, 18);
/* 32 */     String[] dayNameOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
/*    */     
/* 34 */     System.out.println("May 18, 2017 is a " + dayNameOfWeek[calendar1
/* 35 */           .get(7) - 1]);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/TestCalendar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */