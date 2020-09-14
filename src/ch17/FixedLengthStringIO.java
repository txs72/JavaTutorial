/*    */ package ch17;
/*    */ 
/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class FixedLengthStringIO
/*    */ {
/*    */   public static String readFixedLengthString(int size, DataInput in) throws IOException {
/* 10 */     char[] chars = new char[size];
/*    */ 
/*    */     
/* 13 */     for (int i = 0; i < size; i++) {
/* 14 */       chars[i] = in.readChar();
/*    */     }
/* 16 */     return new String(chars);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void writeFixedLengthString(String s, int size, DataOutput out) throws IOException {
/* 22 */     char[] chars = new char[size];
/*    */ 
/*    */     
/* 25 */     s.getChars(0, Math.min(s.length(), size), chars, 0);
/*    */ 
/*    */     
/* 28 */     for (int i = Math.min(s.length(), size); i < chars.length; i++) {
/* 29 */       chars[i] = ' ';
/*    */     }
/*    */     
/* 32 */     out.writeChars(new String(chars));
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch17/FixedLengthStringIO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */