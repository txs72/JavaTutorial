/*    */ package ch09;
/*    */ 
/*    */ public class TestTV {
/*    */   public static void main(String[] args) {
/*  5 */     TV tv1 = new TV();
/*  6 */     tv1.turnOn();
/*  7 */     tv1.setChannel(30);
/*  8 */     tv1.setVolume(3);
/*    */     
/* 10 */     TV tv2 = new TV();
/* 11 */     tv2.turnOn();
/* 12 */     tv2.channelUp();
/* 13 */     tv2.channelUp();
/* 14 */     tv2.volumeUp();
/*    */     
/* 16 */     System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
/*    */     
/* 18 */     System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/TestTV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */