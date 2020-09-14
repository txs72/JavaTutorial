/*    */ package ch32;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.Executors;
/*    */ import java.util.concurrent.locks.Condition;
/*    */ 
/*    */ public class ThreadCooperation {
/*  7 */   private static Account account = new Account();
/*    */ 
/*    */   
/*    */   public static void main(String[] args) {
/* 11 */     ExecutorService executor = Executors.newFixedThreadPool(2);
/* 12 */     executor.execute(new DepositTask());
/* 13 */     executor.execute(new WithdrawTask());
/* 14 */     executor.shutdown();
/*    */     
/* 16 */     System.out.println("Thread 1\t\tThread 2\t\tBalance");
/*    */   }
/*    */   
/*    */   public static class DepositTask
/*    */     implements Runnable {
/*    */     public void run() {
/*    */       try {
/*    */         while (true) {
/* 24 */           ThreadCooperation.account.deposit((int)(Math.random() * 10.0D) + 1);
/* 25 */           Thread.sleep(1000L);
/*    */         }
/*    */       
/* 28 */       } catch (InterruptedException ex) {
/* 29 */         ex.printStackTrace();
/*    */         return;
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   public static class WithdrawTask implements Runnable {
/*    */     public void run() {
/*    */       while (true) {
/* 38 */         ThreadCooperation.account.withdraw((int)(Math.random() * 10.0D) + 1);
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   private static class Account
/*    */   {
/* 46 */     private static Lock lock = new ReentrantLock();
/*    */ 
/*    */     
/* 49 */     private static Condition newDeposit = lock.newCondition();
/*    */     
/* 51 */     private int balance = 0;
/*    */     
/*    */     public int getBalance() {
/* 54 */       return this.balance;
/*    */     }
/*    */     
/*    */     public void withdraw(int amount) {
/* 58 */       lock.lock();
/*    */       try {
/* 60 */         while (this.balance < amount) {
/* 61 */           System.out.println("\t\t\tWait for a deposit");
/* 62 */           newDeposit.await();
/*    */         } 
/*    */         
/* 65 */         this.balance -= amount;
/* 66 */         System.out.println("\t\t\tWithdraw " + amount + "\t\t" + 
/* 67 */             getBalance());
/*    */       }
/* 69 */       catch (InterruptedException ex) {
/* 70 */         ex.printStackTrace();
/*    */       } finally {
/*    */         
/* 73 */         lock.unlock();
/*    */       } 
/*    */     }
/*    */     
/*    */     public void deposit(int amount) {
/* 78 */       lock.lock();
/*    */       try {
/* 80 */         this.balance += amount;
/* 81 */         System.out.println("Deposit " + amount + "\t\t\t\t\t" + 
/* 82 */             getBalance());
/*    */ 
/*    */         
/* 85 */         newDeposit.signalAll();
/*    */       } finally {
/*    */         
/* 88 */         lock.unlock();
/*    */       } 
/*    */     }
/*    */     
/*    */     private Account() {}
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/ThreadCooperation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */