/*    */ package ch12_io;
/*    */ import java.net.URL;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class WebCrawler {
/*    */   public static void main(String[] args) {
/*  8 */     Scanner input = new Scanner(System.in);
/*  9 */     System.out.print("Enter a URL: ");
/* 10 */     String url = input.nextLine();
/* 11 */     crawler(url);
/*    */   }
/*    */   
/*    */   public static void crawler(String startingURL) {
/* 15 */     ArrayList<String> listOfPendingURLs = new ArrayList<>();
/* 16 */     ArrayList<String> listOfTraversedURLs = new ArrayList<>();
/*    */     
/* 18 */     listOfPendingURLs.add(startingURL);
/* 19 */     while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs
/* 20 */       .size() <= 100) {
/* 21 */       String urlString = listOfPendingURLs.remove(0);
/* 22 */       if (!listOfTraversedURLs.contains(urlString)) {
/* 23 */         listOfTraversedURLs.add(urlString);
/* 24 */         System.out.println("Craw " + urlString);
/*    */         
/* 26 */         for (String s : getSubURLs(urlString)) {
/* 27 */           if (!listOfTraversedURLs.contains(s))
/* 28 */             listOfPendingURLs.add(s); 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static ArrayList<String> getSubURLs(String urlString) {
/* 35 */     ArrayList<String> list = new ArrayList<>();
/*    */     
/*    */     try {
/* 38 */       URL url = new URL(urlString);
/* 39 */       Scanner input = new Scanner(url.openStream());
/* 40 */       int current = 0;
/* 41 */       while (input.hasNext()) {
/* 42 */         String line = input.nextLine();
/* 43 */         current = line.indexOf("http:", current);
/* 44 */         while (current > 0) {
/* 45 */           int endIndex = line.indexOf(">", current);
/* 46 */           if (endIndex > 0) {
/* 47 */             list.add(line.substring(current, endIndex));
/* 48 */             current = line.indexOf("http:", endIndex);
/*    */             continue;
/*    */           } 
/* 51 */           current = -1;
/*    */         }
/*    */       
/*    */       } 
/* 55 */     } catch (Exception ex) {
/* 56 */       System.out.println("Error: " + ex.getMessage());
/*    */     } 
/*    */     
/* 59 */     return list;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12_io/WebCrawler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */