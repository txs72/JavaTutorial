/*    */ package ch17;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.RandomAccessFile;
/*    */ 
/*    */ public class TestRandomAccessFile {
/*    */   public static void main(String[] args) throws IOException {
/*  8 */     try (RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw")) {
/*    */ 
/*    */       
/* 11 */       inout.setLength(0L);
/*    */ 
/*    */       
/* 14 */       for (int i = 0; i < 200; i++) {
/* 15 */         inout.writeInt(i);
/*    */       }
/*    */       
/* 18 */       System.out.println("Current file length is " + inout.length());
/*    */ 
/*    */       
/* 21 */       inout.seek(0L);
/* 22 */       System.out.println("The first number is " + inout.readInt());
/*    */ 
/*    */       
/* 25 */       inout.seek(4L);
/* 26 */       System.out.println("The second number is " + inout.readInt());
/*    */ 
/*    */       
/* 29 */       inout.seek(36L);
/* 30 */       System.out.println("The tenth number is " + inout.readInt());
/*    */ 
/*    */       
/* 33 */       inout.writeInt(555);
/*    */ 
/*    */       
/* 36 */       inout.seek(inout.length());
/* 37 */       inout.writeInt(999);
/*    */ 
/*    */       
/* 40 */       System.out.println("The new length is " + inout.length());
/*    */ 
/*    */       
/* 43 */       inout.seek(40L);
/* 44 */       System.out.println("The eleventh number is " + inout.readInt());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch17/TestRandomAccessFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */