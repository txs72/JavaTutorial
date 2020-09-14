/*    */ package reflection;
/*    */ 
/*    */ public class ClassHierarchy
/*    */ {
/*    */   public static void main(String[] args) {
/*  6 */     Class<Child> classType = Child.class;
/*    */     
/*  8 */     System.out.println(classType);
/*  9 */     classType = (Class)classType.getSuperclass();
/* 10 */     System.out.println(classType);
/*    */     
/* 12 */     classType = (Class)classType.getSuperclass();
/* 13 */     System.out.println(classType);
/* 14 */     classType = (Class)classType.getSuperclass();
/* 15 */     System.out.println(classType);
/* 16 */     classType = (Class)classType.getSuperclass();
/* 17 */     System.out.println(classType);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/ClassHierarchy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */