/*    */ package ch17;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.ObjectOutputStream;
import java.util.Date;

/*    */
/*    */ public class TestObjectOutputStream {
/*    */   public static void main(String[] args) throws IOException {
/*  8 */     try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"))) {
/*    */ 
/*    */ 
/*    */       
/* 12 */       output.writeUTF("John");
/* 13 */       output.writeDouble(85.5D);
/* 14 */       output.writeObject(new Date());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch17/TestObjectOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */