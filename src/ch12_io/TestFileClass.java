/*    */ package ch12_io;
/*    */ 
/*    */ public class TestFileClass {
/*    */   public static void main(String[] args) {
/*  5 */     File file = new File("src/ch12_io/TestFileClass.java");
/*    */     
/*  7 */     System.out.println("Does it exist? " + file.exists());
/*  8 */     System.out.println("The file has " + file.length() + " bytes");
/*  9 */     System.out.println("Can it be read? " + file.canRead());
/* 10 */     System.out.println("Can it be written? " + file.canWrite());
/* 11 */     System.out.println("Is it a directory? " + file.isDirectory());
/* 12 */     System.out.println("Is it a file? " + file.isFile());
/* 13 */     System.out.println("Is it absolute? " + file.isAbsolute());
/* 14 */     System.out.println("Is it hidden? " + file.isHidden());
/* 15 */     System.out.println("Absolute path is " + file
/* 16 */         .getAbsolutePath());
/* 17 */     System.out.println("Last modified on " + new Date(file
/* 18 */           .lastModified()));
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12_io/TestFileClass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */