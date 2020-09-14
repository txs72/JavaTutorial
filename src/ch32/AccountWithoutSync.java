/*    */ package ch32;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.Executors;
/*    */ 
/*    */ public class AccountWithoutSync {
/*  6 */   private static Account account = new Account();
/*    */   
/*    */   public static void main(String[] args) {
/*  9 */     ExecutorService executor = Executors.newCachedThreadPool();
/*    */ 
/*    */     
/* 12 */     for (int i = 0; i < 100; i++) {
/* 13 */       executor.execute(new AddAPennyTask());
/*    */     }
/*    */     
/* 16 */     executor.shutdown();
/*    */ 
/*    */     
/* 19 */     while (!executor.isTerminated());
/*    */ 
/*    */     
/* 22 */     System.out.println("What is balance? " + account.getBalance());
/*    */   }
/*    */   
/*    */   private static class AddAPennyTask implements Runnable {
/*    */     private AddAPennyTask() {}
/*    */     
/*    */     public void run() {
/* 29 */       AccountWithoutSync.account.deposit(1);
/*    */     }
/*    */   }
/*    */   
/*    */   private static class Account
/*    */   {
/* 35 */     private int balance = 0;
/* 36 */     private int counter = 0;
/*    */     public int getBalance() {
/* 38 */       return this.balance;
/*    */     }
/*    */     
/*    */     public void test() {
/* 42 */       synchronized (this) {
/* 43 */         System.out.println("test func + " + this.counter++);
/*    */       } 
/*    */     }
/*    */     
/*    */     public void deposit(int amount) {
/* 48 */       synchronized (this) {
/* 49 */         int newBalance = this.balance + amount;
/*    */ 
/*    */ 
/*    */         
/*    */         try {
/* 54 */           Thread.sleep(1L);
/* 55 */         } catch (InterruptedException interruptedException) {}
/*    */         
/* 57 */         test();
/* 58 */         this.balance = newBalance;
/*    */       } 
/*    */     }
/*    */     
/*    */     private Account() {}
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/AccountWithoutSync.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */