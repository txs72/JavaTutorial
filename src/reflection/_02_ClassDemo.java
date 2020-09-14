/*    */ package reflection;
/*    */ 
/*    */ public class _02_ClassDemo {
/*    */   public static void main(String[] args) {
/*  5 */     String s = "hello";
/*    */     
/*  7 */     System.out.println("类名称：" + s.getClass().getName());
/*    */     
/*  9 */     System.out.println("类成员: ");
/* 10 */     ClassUtil.printFieldMessage(s);
/*    */     
/* 12 */     System.out.println("构造函数: ");
/* 13 */     ClassUtil.printCtorMessage(s);
/*    */     
/* 15 */     System.out.println("类方法: ");
/* 16 */     ClassUtil.printMethodMessage(s);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/_02_ClassDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */