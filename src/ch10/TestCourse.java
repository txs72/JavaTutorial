/*    */ package ch10;
/*    */ 
/*    */ public class TestCourse {
/*    */   public static void main(String[] args) {
/*  5 */     Course course1 = new Course("Data Structures");
/*  6 */     Course course2 = new Course("Database Systems");
/*    */     
/*  8 */     course1.addStudent("Peter Jones");
/*  9 */     course1.addStudent("Brian Smith");
/* 10 */     course1.addStudent("Anne Kennedy");
/*    */     
/* 12 */     course2.addStudent("Peter Jones");
/* 13 */     course2.addStudent("Steve Smith");
/*    */     
/* 15 */     System.out.println("Number of students in course1: " + course1
/* 16 */         .getNumberOfStudents());
/* 17 */     String[] students = course1.getStudents();
/* 18 */     for (int i = 0; i < course1.getNumberOfStudents(); i++) {
/* 19 */       System.out.print(students[i] + ", ");
/*    */     }
/* 21 */     System.out.println();
/* 22 */     System.out.print("Number of students in course2: " + course2
/* 23 */         .getNumberOfStudents());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/TestCourse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */