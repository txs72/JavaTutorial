/*    */ package ch09;
/*    */ 
/*    */ public class TV {
/*  4 */   int channel = 1;
/*  5 */   int volumeLevel = 1;
/*    */ 
/*    */   
/*    */   boolean on = false;
/*    */ 
/*    */   
/*    */   public void turnOn() {
/* 12 */     this.on = true;
/*    */   }
/*    */   
/*    */   public void turnOff() {
/* 16 */     this.on = false;
/*    */   }
/*    */   
/*    */   public void setChannel(int newChannel) {
/* 20 */     if (this.on && newChannel >= 1 && newChannel <= 120)
/* 21 */       this.channel = newChannel; 
/*    */   }
/*    */   
/*    */   public void setVolume(int newVolumeLevel) {
/* 25 */     if (this.on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
/* 26 */       this.volumeLevel = newVolumeLevel; 
/*    */   }
/*    */   
/*    */   public void channelUp() {
/* 30 */     if (this.on && this.channel < 120)
/* 31 */       this.channel++; 
/*    */   }
/*    */   
/*    */   public void channelDown() {
/* 35 */     if (this.on && this.channel > 1)
/* 36 */       this.channel--; 
/*    */   }
/*    */   
/*    */   public void volumeUp() {
/* 40 */     if (this.on && this.volumeLevel < 7)
/* 41 */       this.volumeLevel++; 
/*    */   }
/*    */   
/*    */   public void volumeDown() {
/* 45 */     if (this.on && this.volumeLevel > 1)
/* 46 */       this.volumeLevel--; 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/TV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */