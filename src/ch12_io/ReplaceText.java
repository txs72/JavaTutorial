/*    */ package ch12_io;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ReplaceText {
/*    */   public static void main(String[] args) throws Exception {
/*  9 */     if (args.length != 4) {
/* 10 */       System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
/*    */       
/* 12 */       System.exit(1);
/*    */     } 
/*    */ 
/*    */     
/* 16 */     File sourceFile = new File(args[0]);
/* 17 */     if (!sourceFile.exists()) {
/* 18 */       System.out.println("Source file " + args[0] + " does not exist");
/* 19 */       System.exit(2);
/*    */     } 
/*    */ 
/*    */     
/* 23 */     File targetFile = new File(args[1]);
/* 24 */     if (targetFile.exists()) {
/* 25 */       System.out.println("Target file " + args[1] + " already exists");
/* 26 */       System.exit(3);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 31 */     try(Scanner input = new Scanner(sourceFile); 
/* 32 */         PrintWriter output = new PrintWriter(targetFile)) {
/*    */       
/* 34 */       while (input.hasNext()) {
/* 35 */         String s1 = input.nextLine();
/* 36 */         String s2 = s1.replaceAll(args[2], args[3]);
/* 37 */         output.println(s2);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12_io/ReplaceText.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */