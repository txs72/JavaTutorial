/*    */ package extra.aboutreference;
/*    */ 
/*    */ import java.lang.ref.PhantomReference;
/*    */ import java.lang.ref.Reference;
/*    */ import java.lang.ref.ReferenceQueue;
/*    */ import java.util.LinkedList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class PhantomReferenceTest
/*    */ {
/* 11 */   private static final ReferenceQueue<M> QUEUE = new ReferenceQueue<>();
/* 12 */   private static final List<Object> LIST = new LinkedList();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void main(String[] args) {
/* 18 */     PhantomReference<M> phantomReference = new PhantomReference<>(new M(), QUEUE);
/* 19 */     (new Thread(() -> {
/*    */           while (true) {
/*    */             LIST.add(new byte[1048576]);
/*    */             
/*    */             try {
/*    */               Thread.sleep(1000L);
/* 25 */             } catch (InterruptedException e) {
/*    */               e.printStackTrace();
/*    */               Thread.currentThread().interrupt();
/*    */             } 
/*    */             System.out.println(phantomReference.get());
/*    */           } 
/* 31 */         })).start();
/*    */     
/* 33 */     (new Thread(() -> {
/*    */           while (true) {
/*    */             Reference<? extends M> poll = QUEUE.poll();
/*    */             if (poll != null) {
/*    */               System.out.println("---- 虚引用对象被jvm回收了 ----" + poll);
/*    */             }
/*    */           } 
/* 40 */         })).start();
/*    */     
/*    */     try {
/* 43 */       Thread.sleep(500L);
/*    */     }
/* 45 */     catch (InterruptedException e) {
/* 46 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/extra/aboutreference/PhantomReferenceTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */