/*    */ package ch12_io;

import java.io.File;
import java.io.PrintWriter;

/*    */
/*    */ public class WriteData {
/*    */   public static void main(String[] args) throws Exception {
/*  5 */     File file = new File("scores.txt");
/*  6 */     if (file.exists()) {
/*  7 */       System.out.println("File already exists");
/*  8 */       System.exit(0);
/*    */     } 
/*    */ 
/*    */     
/* 12 */     PrintWriter output = new PrintWriter(file);
/*    */ 
/*    */     
/* 15 */     output.print("John T Smith ");
/* 16 */     output.println(90);
/* 17 */     output.print("Eric K Jones ");
/* 18 */     output.println(85);
/*    */ 
/*    */     
/* 21 */     output.close();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12_io/WriteData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */