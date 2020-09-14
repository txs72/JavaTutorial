/*   */ package reflection.classvsclassforname;
/*   */ 
/*   */ public class Initable {
/*   */   static final int staticFinal1 = 47;
/* 5 */   static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
/*   */   static {
/* 7 */     System.out.println("Initializing Initable");
/*   */   }
/*   */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/classvsclassforname/Initable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */