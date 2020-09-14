/*    */ package misc;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class Overloading
/*    */ {
/*    */   public static void say(Object arg) {
/*  8 */     System.out.println("hello object");
/*    */   }
/*    */ 
/*    */   
/*    */   public static void say(int arg) {
/* 13 */     System.out.println("hello int");
/*    */   }
/*    */ 
/*    */   
/*    */   public static void say(long arg) {
/* 18 */     System.out.println("hello long");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void say(char arg) {
/* 24 */     System.out.println("hello char");
/*    */   }
/*    */ 
/*    */   
/*    */   public static void say(Character arg) {
/* 29 */     System.out.println("hello character");
/*    */   }
/*    */ 
/*    */   
/*    */   public static void say(char... arg) {
/* 34 */     System.out.println("hello char...");
/*    */   }
/*    */ 
/*    */   
/*    */   public static void say(Serializable arg) {
/* 39 */     System.out.println("hello serializable");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void main(String[] args) {
/* 48 */     say('a');
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/misc/Overloading.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */