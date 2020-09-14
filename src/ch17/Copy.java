/*    */ package ch17;
/*    */ 
/*    */ import java.io.BufferedInputStream;
/*    */ import java.io.BufferedOutputStream;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class Copy {
/*    */   public static void main(String[] args) throws IOException {
/* 12 */     if (args.length != 2) {
/* 13 */       System.out.println("Usage: java Copy sourceFile targetfile");
/*    */       
/* 15 */       System.exit(1);
/*    */     } 
/*    */ 
/*    */     
/* 19 */     File sourceFile = new File(args[0]);
/* 20 */     if (!sourceFile.exists()) {
/* 21 */       System.out.println("Source file " + args[0] + " does not exist");
/*    */       
/* 23 */       System.exit(2);
/*    */     } 
/*    */ 
/*    */     
/* 27 */     File targetFile = new File(args[1]);
/* 28 */     if (targetFile.exists()) {
/* 29 */       System.out.println("Target file " + args[1] + " already exists");
/*    */       
/* 31 */       System.exit(3);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 36 */     try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile)); 
/*    */ 
/*    */ 
/*    */         
/* 40 */         BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile))) {
/*    */ 
/*    */ 
/*    */       
/* 44 */       int numberOfBytesCopied = 0; int r;
/* 45 */       while ((r = input.read()) != -1) {
/* 46 */         output.write((byte)r);
/* 47 */         numberOfBytesCopied++;
/*    */       } 
/*    */ 
/*    */       
/* 51 */       System.out.println(numberOfBytesCopied + " bytes copied");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch17/Copy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */