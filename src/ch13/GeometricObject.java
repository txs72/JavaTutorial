/*    */ package ch13;

import java.util.Date;

/*    */
/*    */ public abstract class GeometricObject {
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
/* 48 */     return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
/*    */   }
/*    */   
/*    */   public abstract double getArea();
/*    */   
/*    */   public abstract double getPerimeter();
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/GeometricObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */