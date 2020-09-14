/*    */ package ch32;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.Executors;
/*    */ import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*    */
/*    */ public class AccountWithSyncUsingLock {
/*  7 */   private static Account account = new Account();
/*    */   
/*    */   public static void main(String[] args) {
/* 10 */     ExecutorService executor = Executors.newCachedThreadPool();
/*    */ 
/*    */     
/* 13 */     for (int i = 0; i < 100; i++) {
/* 14 */       executor.execute(new AddAPennyTask());
/*    */     }
/*    */     
/* 17 */     executor.shutdown();
/*    */ 
/*    */     
/* 20 */     while (!executor.isTerminated());
/*    */ 
/*    */     
/* 23 */     System.out.println("What is balance ? " + account.getBalance());
/*    */   }
/*    */   
/*    */   public static class AddAPennyTask
/*    */     implements Runnable {
/*    */     public void run() {
/* 29 */       AccountWithSyncUsingLock.account.deposit(1);
/*    */     }
/*    */   }
/*    */   
/*    */   public static class Account
/*    */   {
/* 35 */     private static Lock lock = new ReentrantLock();
/* 36 */     private int balance = 0;
/*    */     
/*    */     public int getBalance() {
/* 39 */       return this.balance;
/*    */     }
/*    */     
/*    */     public void deposit(int amount) {
/* 43 */       lock.lock();
/*    */       
/*    */       try {
/* 46 */         int newBalance = this.balance + amount;
/*    */ 
/*    */ 
/*    */         
/* 50 */         Thread.sleep(5L);
/*    */         
/* 52 */         this.balance = newBalance;
/*    */       }
/* 54 */       catch (InterruptedException interruptedException) {
/*    */       
/*    */       } finally {
/* 57 */         lock.unlock();
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/AccountWithSyncUsingLock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */