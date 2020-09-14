/*    */ package ch12_io;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch12Q11
/*    */ {
/*    */   public static void main(String[] args) throws Exception {
/* 10 */     if (args.length != 2) {
/* 11 */       System.out.println("Usage: java Ch12Q11 John filename");
/*    */       
/* 13 */       System.exit(1);
/*    */     } 
/*    */ 
/*    */     
/* 17 */     File sourceFile = new File(args[1]);
/* 18 */     if (!sourceFile.exists()) {
/* 19 */       System.out.println("Source file " + args[1] + " does not exist");
/* 20 */       System.exit(2);
/*    */     } 
/*    */ 
/*    */     
/* 24 */     File targetFile = new File(args[1]);
/* 25 */     String s2 = "";
/*    */ 
/*    */     
/* 28 */     try (Scanner input = new Scanner(sourceFile)) {
/*    */       
/* 30 */       while (input.hasNext()) {
/* 31 */         String s1 = input.nextLine();
/* 32 */         s2 = s2 + s1.replaceAll(args[0], "");
/* 33 */         s2 = s2 + "\n";
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 38 */     try (PrintWriter output = new PrintWriter(targetFile)) {
/*    */       
/* 40 */       output.println(s2);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12_io/Ch12Q11.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */