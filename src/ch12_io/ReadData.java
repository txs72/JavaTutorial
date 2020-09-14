/*    */ package ch12_io;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ReadData {
/*    */   public static void main(String[] args) throws Exception {
/*  8 */     File file = new File("scores.txt");
/*    */ 
/*    */     
/* 11 */     Scanner input = new Scanner(file);
/*    */ 
/*    */     
/* 14 */     while (input.hasNext()) {
/* 15 */       String firstName = input.next();
/* 16 */       String mi = input.next();
/* 17 */       String lastName = input.next();
/* 18 */       int score = input.nextInt();
/* 19 */       System.out.println(firstName + " " + mi + " " + lastName + " " + score);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 24 */     input.close();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12_io/ReadData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */