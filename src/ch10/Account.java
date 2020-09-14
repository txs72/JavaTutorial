/*     */ package ch10;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Account
/*     */ {
/*     */   private int id;
/*     */   private double balance;
/*  95 */   private double annualInterestRate = 0.0D;
/*  96 */   private Date dateCreated = new Date();
/*     */ 
/*     */   
/*     */   public Account() {}
/*     */   
/*     */   public Account(int id, double balance) {
/* 102 */     this.id = id;
/* 103 */     this.balance = balance;
/*     */   }
/*     */   
/*     */   public Date getDateCreated() {
/* 107 */     return this.dateCreated;
/*     */   }
/*     */   
/*     */   public double getBalance() {
/* 111 */     return this.balance;
/*     */   }
/*     */   
/*     */   public double getMonthlyInterestedRate() {
/* 115 */     return this.annualInterestRate / 12.0D;
/*     */   }
/*     */   
/*     */   public void withDraw(double amount) {
/* 119 */     this.balance -= amount;
/*     */   }
/*     */   
/*     */   public void deposit(double amount) {
/* 123 */     this.balance += amount;
/*     */   }
/*     */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/Account.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */