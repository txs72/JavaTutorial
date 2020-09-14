/*    */ package ch03;
/*    */ 
/*    */ public class Ch03Q24 {
/*    */   public static void main(String[] args) {
/*  5 */     int card = (int)(Math.random() * 52.0D);
/*  6 */     String[] sizes = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
/*    */ 
/*    */ 
/*    */     
/* 10 */     String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
/* 11 */     int suit = card / 13;
/* 12 */     int size = card % 13;
/* 13 */     System.out.println("The card you picked is " + sizes[size] + " of " + suits[suit]);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch03/Ch03Q24.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */