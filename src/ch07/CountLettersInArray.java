/*    */ package ch07;
/*    */ 
/*    */ 
/*    */ public class CountLettersInArray
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     char[] chars = createArray();
/*    */ 
/*    */     
/* 10 */     System.out.println("The lowercase letters are:");
/* 11 */     displayArray(chars);
/*    */ 
/*    */     
/* 14 */     int[] counts = countLetters(chars);
/*    */ 
/*    */     
/* 17 */     System.out.println();
/* 18 */     System.out.println("The occurrences of each letter are:");
/* 19 */     displayCounts(counts);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static char[] createArray() {
/* 25 */     char[] chars = new char[100];
/*    */ 
/*    */ 
/*    */     
/* 29 */     for (int i = 0; i < chars.length; i++) {
/* 30 */       chars[i] = RandomCharacter.getRandomLowerCaseLetter();
/*    */     }
/*    */     
/* 33 */     return chars;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void displayArray(char[] chars) {
/* 39 */     for (int i = 0; i < chars.length; i++) {
/* 40 */       if ((i + 1) % 20 == 0) {
/* 41 */         System.out.println(chars[i]);
/*    */       } else {
/* 43 */         System.out.print(chars[i] + " ");
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static int[] countLetters(char[] chars) {
/* 50 */     int[] counts = new int[26];
/*    */ 
/*    */     
/* 53 */     for (int i = 0; i < chars.length; i++) {
/* 54 */       counts[chars[i] - 97] = counts[chars[i] - 97] + 1;
/*    */     }
/* 56 */     return counts;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void displayCounts(int[] counts) {
/* 61 */     for (int i = 0; i < counts.length; i++) {
/* 62 */       if ((i + 1) % 10 == 0) {
/* 63 */         System.out.println(counts[i] + " " + (char)(i + 97));
/*    */       } else {
/* 65 */         System.out.print(counts[i] + " " + (char)(i + 97) + " ");
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch07/CountLettersInArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */