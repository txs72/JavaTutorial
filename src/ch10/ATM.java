/*    */ package ch10;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class ATM
/*    */ {
/*    */   private Account[] accounts;
/* 18 */   int state = 0;
/*    */ 
/*    */ 
/*    */   
/* 22 */   int selectedID = 0;
/* 23 */   int operationID = 0;
/*    */   
/*    */   ATM() {
/* 26 */     this.accounts = new Account[10];
/* 27 */     for (int i = 0; i < this.accounts.length; i++) {
/* 28 */       this.accounts[i] = new Account(i, 100.0D);
/*    */     }
/* 30 */     this.scanner = new Scanner(System.in);
/*    */   }
/*    */   Scanner scanner;
/*    */   public void displayMessage() {
/*    */     while (true) {
/* 35 */       switch (this.state) {
/*    */         case 0:
/* 37 */           displayMainMenu();
/*    */         
/*    */         case 1:
/* 40 */           displayOperaitonSelection();
/*    */         
/*    */         case 2:
/* 43 */           doOperation();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void displayMainMenu() {
/* 50 */     System.out.print("Enter an id: ");
/* 51 */     this.selectedID = this.scanner.nextInt();
/* 52 */     this.state = 1;
/*    */   }
/*    */   
/*    */   public void displayOperaitonSelection() {
/* 56 */     System.out.println("Main menu");
/* 57 */     System.out.println("1. check balance");
/* 58 */     System.out.println("2. withdraw");
/* 59 */     System.out.println("3. deposit");
/* 60 */     System.out.println("4. exit");
/* 61 */     System.out.print("Enter a choice: ");
/* 62 */     this.operationID = this.scanner.nextInt();
/* 63 */     if (this.operationID == 1) {
/* 64 */       System.out.println("The balance is " + this.accounts[this.selectedID].getBalance());
/*    */     }
/* 66 */     else if (this.operationID == 2 || this.operationID == 3) {
/* 67 */       this.state = 2;
/*    */     }
/* 69 */     else if (this.operationID == 4) {
/* 70 */       this.state = 0;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void doOperation() {
/* 75 */     double amount = 0.0D;
/* 76 */     if (this.operationID == 2) {
/* 77 */       System.out.print("Enter an amount to withdraw: ");
/* 78 */       amount = this.scanner.nextDouble();
/* 79 */       this.accounts[this.selectedID].withDraw(amount);
/* 80 */       this.state = 1;
/*    */     } 
/* 82 */     if (this.operationID == 3) {
/* 83 */       System.out.print("Enter an amount to deposit: ");
/* 84 */       amount = this.scanner.nextDouble();
/* 85 */       this.accounts[this.selectedID].deposit(amount);
/* 86 */       this.state = 1;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/ATM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */