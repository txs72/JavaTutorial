/*    */ package multithreads;
/*    */ 
/*    */ import java.util.concurrent.TimeUnit;
/*    */ 
/*    */ public class AboutThreadLocal {
/*  6 */   static ThreadLocal<Person> tl = new ThreadLocal<>();
/*    */   
/*    */   public static void main(String[] args) {
/*  9 */     (new Thread(() -> {
/*    */           
/*    */           try {
/*    */             TimeUnit.SECONDS.sleep(2L);
/* 13 */           } catch (InterruptedException e) {
/*    */             e.printStackTrace();
/*    */           } 
/*    */           System.out.println(tl.get());
/* 17 */         })).start();
/*    */     
/* 19 */     (new Thread(() -> {
/*    */           
/*    */           try {
/*    */             TimeUnit.SECONDS.sleep(1L);
/* 23 */           } catch (InterruptedException e) {
/*    */             e.printStackTrace();
/*    */           } 
/*    */           tl.set(new Person());
/* 27 */         })).start();
/*    */   }
/*    */   
/*    */   static class Person
/*    */   {
/* 32 */     String name = "zhangsan";
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/multithreads/AboutThreadLocal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */