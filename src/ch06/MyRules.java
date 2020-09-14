/*    */ package ch06;
/*    */ 
/*    */ public class MyRules {
/*    */   public static boolean isLengthValid(String s) {
/*  5 */     if (s.length() < 8) {
/*  6 */       return false;
/*    */     }
/*  8 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean isCharValid(String s) {
/* 13 */     boolean b = true;
/* 14 */     for (int i = 0; i < s.length(); i++) {
/* 15 */       if (!Character.isDigit(s.charAt(i)) && 
/* 16 */         !Character.isLetter(s.charAt(i))) {
/* 17 */         b = false;
/*    */         break;
/*    */       } 
/*    */     } 
/* 21 */     return b;
/*    */   }
/*    */   
/*    */   public static boolean isNumOfNumsValid(String s) {
/* 25 */     int counter = 0;
/* 26 */     for (int i = 0; i < s.length(); i++) {
/* 27 */       if (Character.isDigit(s.charAt(i))) {
/* 28 */         counter++;
/*    */       }
/*    */     } 
/* 31 */     if (counter >= 2) return true; 
/* 32 */     return false;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/MyRules.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */