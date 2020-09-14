/*    */ package ch13;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ public class House implements Cloneable, Comparable<House> {
/*    */   private int id;
/*    */   
/*    */   public House(int id, double area) {
/*  9 */     this.id = id;
/* 10 */     this.area = area;
/* 11 */     this.whenBuilt = new Date();
/*    */   }
/*    */   private double area; private Date whenBuilt;
/*    */   public int getId() {
/* 15 */     return this.id;
/*    */   }
/*    */   
/*    */   public double getArea() {
/* 19 */     return this.area;
/*    */   }
/*    */   
/*    */   public Date getWhenBuilt() {
/* 23 */     return this.whenBuilt;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() {
/*    */     try {
/* 30 */       return super.clone();
/*    */     }
/* 32 */     catch (CloneNotSupportedException ex) {
/* 33 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int compareTo(House o) {
/* 39 */     if (this.area > o.area)
/* 40 */       return 1; 
/* 41 */     if (this.area < o.area) {
/* 42 */       return -1;
/*    */     }
/* 44 */     return 0;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/House.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */