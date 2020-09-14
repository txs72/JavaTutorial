/*    */ package ch10;
/*    */ 
/*    */ public class Course {
/*    */   private String courseName;
/*  5 */   private String[] students = new String[100];
/*    */   private int numberOfStudents;
/*    */   
/*    */   public Course(String courseName) {
/*  9 */     this.courseName = courseName;
/*    */   }
/*    */   
/*    */   public void addStudent(String student) {
/* 13 */     this.students[this.numberOfStudents] = student;
/* 14 */     this.numberOfStudents++;
/*    */   }
/*    */   
/*    */   public String[] getStudents() {
/* 18 */     return this.students;
/*    */   }
/*    */   
/*    */   public int getNumberOfStudents() {
/* 22 */     return this.numberOfStudents;
/*    */   }
/*    */   
/*    */   public String getCourseName() {
/* 26 */     return this.courseName;
/*    */   }
/*    */   
/*    */   public void dropStudent(String student) {}
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/Course.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */