/*    */ package ch12_io;

import java.io.File;
import java.io.PrintWriter;

/*    */
/*    */ public class WriteDataWithAutoClose {
/*    */   public static void main(String[] args) throws Exception {
/*  5 */     File file = new File("scores.txt");
/*  6 */     if (file.exists()) {
/*  7 */       System.out.println("File already exists");
/*  8 */       System.exit(0);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 13 */     try (PrintWriter output = new PrintWriter(file)) {
/*    */ 
/*    */       
/* 16 */       output.print("John T Smith ");
/* 17 */       output.println(90);
/* 18 */       output.print("Eric K Jones ");
/* 19 */       output.println(85);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12_io/WriteDataWithAutoClose.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */