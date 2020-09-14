/*    */ package ch11;
/*    */ 
/*    */ public class SimpleGeometricObject {
/*  4 */   private String color = "white";
/*    */   
/*    */   private boolean filled;
/*    */   private Date dateCreated;
/*    */   
/*    */   public SimpleGeometricObject() {
/* 10 */     this.dateCreated = new Date();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public SimpleGeometricObject(String color, boolean filled) {
/* 16 */     this.dateCreated = new Date();
/* 17 */     this.color = color;
/* 18 */     this.filled = filled;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getColor() {
/* 23 */     return this.color;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setColor(String color) {
/* 28 */     this.color = color;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isFilled() {
/* 34 */     return this.filled;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setFilled(boolean filled) {
/* 39 */     this.filled = filled;
/*    */   }
/*    */ 
/*    */   
/*    */   public Date getDateCreated() {
/* 44 */     return this.dateCreated;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch11/SimpleGeometricObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */