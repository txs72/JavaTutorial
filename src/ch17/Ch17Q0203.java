/*    */ package ch17;
/*    */ import java.io.*;
/*    */
/*    */

/*    */
/*    */ public class Ch17Q0203 {
/*    */   public static void main(String[] args) {
/*  8 */     File f = new File("ex17.dat");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 35 */     long sum = 0L;
/* 36 */     int counter = 0;
/*    */     
/* 38 */     try(FileInputStream fis = new FileInputStream(f); 
/* 39 */         DataInputStream dis = new DataInputStream(fis)) {
/*    */       
/* 41 */       while (dis.available() != 0) {
/* 42 */         sum += dis.readInt();
/* 43 */         counter++;
/*    */       } 
/* 45 */     } catch (IOException ioe) {
/* 46 */       ioe.printStackTrace();
/*    */     }
    /* 48 */     System.out.println("numbers sum: " + sum);
/* 49 */     System.out.println("numbers read: " + counter);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch17/Ch17Q0203.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */