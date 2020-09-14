/*    */ package reflection;
/*    */ 
/*    */ public class _01_ClassDemo {
/*    */   public static void main(String[] args) {
/*  5 */     Class<int> c1 = int.class;
/*  6 */     Class<String> c2 = String.class;
/*  7 */     Class<Double> c3 = Double.class;
/*  8 */     Class<void> c4 = void.class;
/*  9 */     Class<Foo> c5 = Foo.class;
/*    */     
/* 11 */     System.out.println(c1.getName());
/* 12 */     System.out.println(c2.getSimpleName());
/* 13 */     System.out.println(c3.getSimpleName());
/* 14 */     System.out.println(c4.getName());
/* 15 */     System.out.println(c5.getName());
/* 16 */     System.out.println(c5.getSimpleName());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/_01_ClassDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */