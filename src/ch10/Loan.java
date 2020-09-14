/*    */ package ch10;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ public class Loan
/*    */ {
/*    */   private double annualInterestRate;
/*    */   private int numberOfYears;
/*    */   
/*    */   public Loan() {
/* 11 */     this(2.5D, 1, 1000.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   private double loanAmount;
/*    */   private Date loanDate;
/*    */   
/*    */   public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
/* 19 */     this.annualInterestRate = annualInterestRate;
/* 20 */     this.numberOfYears = numberOfYears;
/* 21 */     this.loanAmount = loanAmount;
/* 22 */     this.loanDate = new Date();
/*    */   }
/*    */ 
/*    */   
/*    */   public double getAnnualInterestRate() {
/* 27 */     return this.annualInterestRate;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setAnnualInterestRate(double annualInterestRate) {
/* 32 */     this.annualInterestRate = annualInterestRate;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getNumberOfYears() {
/* 37 */     return this.numberOfYears;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setNumberOfYears(int numberOfYears) {
/* 42 */     this.numberOfYears = numberOfYears;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getLoanAmount() {
/* 47 */     return this.loanAmount;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setLoanAmount(double loanAmount) {
/* 52 */     this.loanAmount = loanAmount;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getMonthlyPayment() {
/* 57 */     double monthlyInterestRate = this.annualInterestRate / 1200.0D;
/*    */     
/* 59 */     double monthlyPayment = this.loanAmount * monthlyInterestRate / (1.0D - 1.0D / Math.pow(1.0D + monthlyInterestRate, (this.numberOfYears * 12)));
/* 60 */     return monthlyPayment;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getTotalPayment() {
/* 65 */     double totalPayment = getMonthlyPayment() * this.numberOfYears * 12.0D;
/* 66 */     return totalPayment;
/*    */   }
/*    */ 
/*    */   
/*    */   public Date getLoanDate() {
/* 71 */     return this.loanDate;
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/Loan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */