/*    */ package ch17;
/*    */ import java.io.*;
/*    */
/*    */

/*    */
/*    */ public class TestDataStream {
/*    */   public static void main(String[] args) throws IOException {
/*  8 */     try (DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"))) {
/*    */ 
/*    */ 
/*    */       
/* 12 */       output.writeUTF("John");
/* 13 */       output.writeDouble(85.5D);
/* 14 */       output.writeUTF("Jim");
/* 15 */       output.writeDouble(185.5D);
/* 16 */       output.writeUTF("George");
/* 17 */       output.writeDouble(105.25D);
/*    */     } 
/*    */ 
/*    */     
/* 21 */     try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"))) {
/*    */ 
/*    */ 
/*    */       
/* 25 */       System.out.println(input.readUTF() + " " + input.readDouble());
/* 26 */       System.out.println(input.readUTF() + " " + input.readDouble());
/* 27 */       System.out.println(input.readUTF() + " " + input.readDouble());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch17/TestDataStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */