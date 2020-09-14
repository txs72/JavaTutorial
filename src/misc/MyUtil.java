/*    */ package misc;
/*    */ 
/*    */ public class MyUtil {
/*    */   public static String decodeUnicode(String s) {
/*  5 */     String[] split = s.split("\\\\u");
/*  6 */     StringBuffer sb = new StringBuffer();
/*  7 */     for (int i = 1; i < split.length; i++) {
/*  8 */       int value = Integer.parseInt(split[i], 16);
/*  9 */       sb.append((char)value);
/*    */     } 
/* 11 */     return sb.toString();
/*    */   }
/*    */   
/*    */   public static String toUnicode(String s) {
/* 15 */     char[] chArray = s.toCharArray();
/* 16 */     StringBuffer sb = new StringBuffer();
/* 17 */     String unicode = null;
/* 18 */     for (int i = 0; i < chArray.length; i++) {
/* 19 */       unicode = Integer.toHexString(chArray[i]);
/* 20 */       if (unicode.length() == 2) {
/* 21 */         unicode = "00" + unicode;
/*    */       }
/* 23 */       sb.append("\\u" + unicode);
/*    */     } 
/* 25 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/misc/MyUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */