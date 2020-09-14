/*    */ package ch12_io;
/*    */ import java.net.URL;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ReadFileFromURL {
/*    */   public static void main(String[] args) {
/*  7 */     System.out.print("Enter a URL: ");
/*  8 */     String URLString = (new Scanner(System.in)).next();
/*    */     
/*    */     try {
/* 11 */       URL url = new URL(URLString);
/* 12 */       int count = 0;
/* 13 */       Scanner input = new Scanner(url.openStream());
/* 14 */       while (input.hasNext()) {
/* 15 */         String line = input.nextLine();
/* 16 */         System.out.println(line);
/* 17 */         count += line.length();
/*    */       } 
/*    */       
/* 20 */       System.out.println("The file size is " + count + " bytes");
/*    */     }
/* 22 */     catch (MalformedURLException ex) {
/* 23 */       System.out.println("Invalid URL");
/*    */     }
/* 25 */     catch (IOException ex) {
/* 26 */       System.out.println("IO Errors");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12_io/ReadFileFromURL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */