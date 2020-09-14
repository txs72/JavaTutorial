/*    */ package ch17;
/*    */ 
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.ObjectInputStream;
/*    */ import java.util.Date;
/*    */ 
/*    */ public class TestObjectInputStream
/*    */ {
/*    */   public static void main(String[] args) throws ClassNotFoundException, IOException {
/* 11 */     try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"))) {
/*    */ 
/*    */ 
/*    */       
/* 15 */       String name = input.readUTF();
/* 16 */       double score = input.readDouble();
/* 17 */       Date date = (Date)input.readObject();
/* 18 */       System.out.println(name + " " + score + " " + date);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch17/TestObjectInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */