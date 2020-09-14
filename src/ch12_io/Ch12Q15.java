/*    */ package ch12_io;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.Arrays;
/*    */ import java.util.Random;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch12Q15 {
/*    */   public static void main(String[] args) {
/* 11 */     File f = new File("Exercise12_15.txt");
/* 12 */     if (f.exists()) {
/* 13 */       System.out.println("File already exists.");
/* 14 */       System.exit(1);
/*    */     } 
/*    */     
/* 17 */     try (PrintWriter output = new PrintWriter(f)) {
/*    */       
/* 19 */       Random r = new Random();
/*    */       
/* 21 */       for (int i = 0; i < 100; i++) {
/* 22 */         int data = r.nextInt() % 1000;
/* 23 */         output.print(data);
/* 24 */         output.print(' ');
/*    */       } 
/* 26 */     } catch (IOException ioe) {
/* 27 */       ioe.printStackTrace();
/*    */     } 
/*    */     
/* 30 */     int[] d = new int[100];
/*    */     
/* 32 */     try (Scanner input = new Scanner(f)) {
/*    */       int i;
/* 34 */       for (i = 0; i < d.length; i++) {
/* 35 */         d[i] = input.nextInt();
/*    */       }
/* 37 */       for (i = 0; i < d.length; i++) {
/* 38 */         System.out.print(d[i] + " ");
/*    */       }
/* 40 */       System.out.println();
/* 41 */       Arrays.sort(d);
/* 42 */       for (i = 0; i < d.length; i++) {
/* 43 */         System.out.print(d[i] + " ");
/*    */       }
/* 45 */       System.out.println();
/*    */     }
/* 47 */     catch (IOException ioe) {
/* 48 */       ioe.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12_io/Ch12Q15.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */