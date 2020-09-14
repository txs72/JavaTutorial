/*    */ package ch07;
/*    */ 
/*    */ public class RandomCharacter
/*    */ {
/*    */   public static char getRandomCharacter(char ch1, char ch2) {
/*  6 */     return (char)(int)(ch1 + Math.random() * (ch2 - ch1 + 1));
/*    */   }
/*    */ 
/*    */   
/*    */   public static char getRandomLowerCaseLetter() {
/* 11 */     return getRandomCharacter('a', 'z');
/*    */   }
/*    */ 
/*    */   
/*    */   public static char getRandomUpperCaseLetter() {
/* 16 */     return getRandomCharacter('A', 'Z');
/*    */   }
/*    */ 
/*    */   
/*    */   public static char getRandomDigitCharacter() {
/* 21 */     return getRandomCharacter('0', '9');
/*    */   }
/*    */ 
/*    */   
/*    */   public static char getRandomCharacter() {
/* 26 */     return getRandomCharacter(false, '￿');
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch07/RandomCharacter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */