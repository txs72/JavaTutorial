/*    */ package ch06;
/*    */ 
/*    */ public class TestRandomCharacter
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     int NUMBER_OF_CHARS = 175;
/*  7 */     int CHARS_PER_LINE = 25;
/*    */ 
/*    */     
/* 10 */     for (int i = 0; i < 175; i++) {
/* 11 */       char ch = RandomCharacter.getRandomCharacter('a', 'z');
/* 12 */       if ((i + 1) % 25 == 0) {
/* 13 */         System.out.println(ch);
/*    */       } else {
/* 15 */         System.out.print(ch);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/TestRandomCharacter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */