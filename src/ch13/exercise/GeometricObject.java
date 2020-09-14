/*    */ package ch13.exercise;

import java.util.Date;

/*    */
/*    */ public abstract class GeometricObject implements Comparable<GeometricObject> {
/*  4 */   private String color = "white";
/*    */   
/*    */   private boolean filled;
/*    */   private Date dateCreated;
/*    */   
/*    */   protected GeometricObject() {
/* 10 */     this.dateCreated = new Date();
/*    */   }
/*    */ 
/*    */   
/*    */   protected GeometricObject(String color, boolean filled) {
/* 15 */     this.dateCreated = new Date();
/* 16 */     this.color = color;
/* 17 */     this.filled = filled;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getColor() {
/* 22 */     return this.color;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setColor(String color) {
/* 27 */     this.color = color;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isFilled() {
/* 33 */     return this.filled;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setFilled(boolean filled) {
/* 38 */     this.filled = filled;
/*    */   }
/*    */ 
/*    */   
/*    */   public Date getDateCreated() {
/* 43 */     return this.dateCreated;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 48 */     return "" + getArea();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int compareTo(GeometricObject o) {
/* 58 */     if (getArea() < o.getArea()) {
/* 59 */       return -1;
/*    */     }
/* 61 */     if (getArea() > o.getArea()) {
/* 62 */       return 1;
/*    */     }
/* 64 */     return 0;
/*    */   }
/*    */   
/*    */   public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
/* 68 */     return (o1.getArea() > o2.getArea()) ? o1 : o2;
/*    */   }
/*    */   
/*    */   public abstract double getArea();
/*    */   
/*    */   public abstract double getPerimeter();
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/exercise/GeometricObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */