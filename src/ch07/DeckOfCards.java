/*    */ package ch07;
/*    */ 
/*    */ public class DeckOfCards {
/*    */   public static void main(String[] args) {
/*  5 */     int[] deck = new int[52];
/*  6 */     String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
/*  7 */     String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
/*    */     
/*    */     int i;
/*    */     
/* 11 */     for (i = 0; i < deck.length; i++) {
/* 12 */       deck[i] = i;
/*    */     }
/*    */     
/* 15 */     for (i = 0; i < deck.length; i++) {
/*    */       
/* 17 */       int index = (int)(Math.random() * deck.length);
/* 18 */       int temp = deck[i];
/* 19 */       deck[i] = deck[index];
/* 20 */       deck[index] = temp;
/*    */     } 
/*    */ 
/*    */     
/* 24 */     for (i = 0; i < 4; i++) {
/* 25 */       String suit = suits[deck[i] / 13];
/* 26 */       String rank = ranks[deck[i] % 13];
/* 27 */       System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch07/DeckOfCards.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */