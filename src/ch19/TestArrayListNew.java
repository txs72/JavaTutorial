/*    */ package ch19;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class TestArrayListNew
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     ArrayList<String> cityList = new ArrayList<>();
/*    */ 
/*    */     
/* 11 */     cityList.add("London");
/* 12 */     cityList.add("New York");
/* 13 */     cityList.add("Paris");
/* 14 */     cityList.add("Toronto");
/* 15 */     cityList.add("Hong Kong");
/* 16 */     cityList.add("Singapore");
/*    */     
/* 18 */     System.out.println("List size? " + cityList.size());
/* 19 */     System.out.println("Is Toronto in the list? " + cityList
/* 20 */         .contains("Toronto"));
/* 21 */     System.out.println("The location of New York in the list? " + cityList
/* 22 */         .indexOf("New York"));
/* 23 */     System.out.println("Is the list empty? " + cityList
/* 24 */         .isEmpty());
/*    */ 
/*    */     
/* 27 */     cityList.add(2, "Beijing");
/*    */ 
/*    */     
/* 30 */     cityList.remove("Toronto");
/*    */ 
/*    */     
/* 33 */     cityList.remove(1);
/*    */ 
/*    */     
/* 36 */     for (int i = 0; i < cityList.size(); i++)
/* 37 */       System.out.print((String)cityList.get(i) + " "); 
/* 38 */     System.out.println();
/*    */ 
/*    */     
/* 41 */     ArrayList<Circle> list = new ArrayList<>();
/*    */ 
/*    */     
/* 44 */     list.add(new Circle(2.0D));
/* 45 */     list.add(new Circle(3.0D));
/*    */ 
/*    */     
/* 48 */     System.out.println("The area of the circle? " + ((Circle)list
/* 49 */         .get(0)).getArea());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch19/TestArrayListNew.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */