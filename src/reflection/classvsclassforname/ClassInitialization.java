/*    */ package reflection.classvsclassforname;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class ClassInitialization
/*    */ {
/*  8 */   public static Random rand = new Random(47L);
/*    */   public static void main(String[] args) throws ClassNotFoundException {
/* 10 */     Class<Initable> initable = Initable.class;
/* 11 */     System.out.println("after creating Initable ref");
/*    */     
/* 13 */     System.out.println(47);
/*    */     
/* 15 */     System.out.println(Initable.staticFinal2);
/*    */     
/* 17 */     System.out.println(Initable2.staticNonFinal);
/* 18 */     Class<?> initable3 = Class.forName("reflection.classvsclassforname.Initable3");
/* 19 */     System.out.println("after creating Initable3 ref");
/* 20 */     System.out.println(Initable3.staticNonFinal);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/classvsclassforname/ClassInitialization.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */