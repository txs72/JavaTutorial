/*    */ package ch17;
/*    */ import java.io.*;
/*    */
/*    */

/*    */
/*    */ public class TestObjectStreamForArray {
/*    */   public static void main(String[] args) throws ClassNotFoundException, IOException {
/*  8 */     int[] numbers = { 1, 2, 3, 4, 5 };
/*  9 */     String[] strings = { "John", "Susan", "Kim" };
/*    */ 
/*    */     
/* 12 */     try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat", true))) {
/*    */ 
/*    */ 
/*    */       
/* 16 */       output.writeObject(numbers);
/* 17 */       output.writeObject(strings);
/*    */     } 
/*    */ 
/*    */     
/* 21 */     try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"))) {
/*    */ 
/*    */       
/* 24 */       int[] newNumbers = (int[])input.readObject();
/* 25 */       String[] newStrings = (String[])input.readObject();
/*    */       
/*    */       int i;
/* 28 */       for (i = 0; i < newNumbers.length; i++)
/* 29 */         System.out.print(newNumbers[i] + " "); 
/* 30 */       System.out.println();
/*    */       
/* 32 */       for (i = 0; i < newStrings.length; i++)
/* 33 */         System.out.print(newStrings[i] + " "); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch17/TestObjectStreamForArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */