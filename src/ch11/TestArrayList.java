/*    */ package ch11;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class TestArrayList
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     ArrayList<String> cityList = new ArrayList<>();
/*  9 */     ArrayList<String> myList = new ArrayList();
/* 10 */     myList.add("Hello");
/* 11 */     myList.add(new Integer(1));
/* 12 */     myList.add(new MyCircle());
/*    */ 
/*    */     
/* 15 */     cityList.add("London");
/*    */     
/* 17 */     cityList.add("Denver");
/*    */     
/* 19 */     cityList.add("Paris");
/*    */     
/* 21 */     cityList.add("Miami");
/*    */     
/* 23 */     cityList.add("Seoul");
/*    */     
/* 25 */     cityList.add("Tokyo");
/*    */ 
/*    */     
/* 28 */     System.out.println("List size? " + cityList.size());
/* 29 */     System.out.println("Is Miami in the list? " + cityList
/* 30 */         .contains("Miami"));
/* 31 */     System.out.println("The location of Denver in the list? " + cityList
/* 32 */         .indexOf("Denver"));
/* 33 */     System.out.println("Is the list empty? " + cityList
/* 34 */         .isEmpty());
/*    */ 
/*    */     
/* 37 */     cityList.add(2, "Xian");
/*    */ 
/*    */ 
/*    */     
/* 41 */     cityList.remove("Miami");
/*    */ 
/*    */ 
/*    */     
/* 45 */     cityList.remove(1);
/*    */ 
/*    */ 
/*    */     
/* 49 */     System.out.println(cityList.toString());
/*    */ 
/*    */     
/* 52 */     for (int i = cityList.size() - 1; i >= 0; i--)
/* 53 */       System.out.print((String)cityList.get(i) + " "); 
/* 54 */     System.out.println();
/*    */ 
/*    */     
/* 57 */     ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();
/*    */ 
/*    */ 
/*    */     
/* 61 */     list.add(new CircleFromSimpleGeometricObject(2.0D));
/* 62 */     list.add(new CircleFromSimpleGeometricObject(3.0D));
/*    */ 
/*    */     
/* 65 */     System.out.println("The area of the circle? " + ((CircleFromSimpleGeometricObject)list
/* 66 */         .get(0)).getArea());
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/TestArrayList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */