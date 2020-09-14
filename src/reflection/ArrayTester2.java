/*    */ package reflection;
/*    */ 
/*    */ import java.lang.reflect.Array;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ public class ArrayTester2 {
/*    */   public static void main(String[] args) throws Exception {
/*  8 */     int[] dims = { 5, 10, 15 };
/*  9 */     Object array = Array.newInstance(int.class, dims);
/* 10 */     Object arrayObj = Array.get(array, 3);
/* 11 */     arrayObj = Array.get(arrayObj, 5);
/* 12 */     Array.setInt(arrayObj, 10, 37);
/* 13 */     int[][][] arrayCast = (int[][][])array;
/* 14 */     System.out.println(arrayCast[3][5][10]);
/* 15 */     System.out.println(Arrays.asList((int[][][])array));
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/ArrayTester2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */