/*    */ package exercise;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.util.Arrays;
/*    */ import java.util.HashSet;
/*    */ import java.util.Scanner;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class CountKeywords {
/*    */   public static void main(String[] args) throws Exception {
/* 11 */     Scanner input = new Scanner(System.in);
/* 12 */     System.out.println("Enter a Java source file: ");
/* 13 */     String filename = input.nextLine();
/* 14 */     File file = new File(filename);
/* 15 */     if (file.exists()) {
/* 16 */       System.out.println("The number of keywords in " + filename + " is " + 
/* 17 */           countKeywords(file));
/*    */     } else {
/*    */       
/* 20 */       System.out.println("File " + filename + " does not exist");
/*    */     } 
/*    */   }
/*    */   
/*    */   public static int countKeywords(File file) throws Exception {
/* 25 */     String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "extends", "for", "final", "finally", "float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while", "true", "false", "null" };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
/*    */     
/* 40 */     int count = 0;
/* 41 */     Scanner input = new Scanner(file);
/* 42 */     while (input.hasNext()) {
/* 43 */       String word = input.next();
/* 44 */       if (keywordSet.contains(word)) {
/* 45 */         count++;
/* 46 */         System.out.print(word + " ");
/*    */       } 
/*    */     } 
/* 49 */     System.out.println();
/* 50 */     return count;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/exercise/CountKeywords.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */