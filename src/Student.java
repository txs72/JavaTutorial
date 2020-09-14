/*    */ public class Student extends Exception {
/*    */   String name;
/*    */   
/*    */   public Student(String name) {
/*  5 */     super(name);
/*  6 */     this.name = name;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 11 */     Student s = null;
/* 12 */     if (obj instanceof Student) {
/* 13 */       s = (Student)obj;
/* 14 */       if (this.name.equals(s.name)) {
/* 15 */         return true;
/*    */       }
/*    */     } 
/* 18 */     return false;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 22 */     return "I am student: " + this.name;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/Student.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */