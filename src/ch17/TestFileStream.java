/*    */ package ch17;
/*    */ 
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class TestFileStream {
/*    */   public static void main(String[] args) throws IOException {
/*  9 */     try (FileOutputStream output = new FileOutputStream("temp.dat")) {
/*    */ 
/*    */       
/* 12 */       for (int i = 1; i <= 10; i++) {
/* 13 */         output.write(i);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 18 */     try (FileInputStream input = new FileInputStream("temp.dat")) {
/*    */       int value;
/*    */ 
/*    */       
/* 22 */       while ((value = input.read()) != -1)
/* 23 */         System.out.print(value + " "); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch17/TestFileStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */