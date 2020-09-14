/*    */ package reflection;
/*    */ 
/*    */ import java.lang.reflect.Array;
/*    */ 
/*    */ public class ArrayTester1
/*    */ {
/*    */   public static void main(String[] args) throws Exception {
/*  8 */     Class<?> classType = Class.forName("java.lang.String");
/*  9 */     Object array = Array.newInstance(classType, 10);
/* 10 */     Array.set(array, 5, "hello");
/* 11 */     String str = (String)Array.get(array, 5);
/* 12 */     System.out.println(str);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/ArrayTester1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */