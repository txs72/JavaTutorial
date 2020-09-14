/*    */ package ch32;
/*    */ import javafx.application.Application;
/*    */ import javafx.application.Platform;
/*    */ import javafx.scene.Parent;
/*    */ import javafx.scene.Scene;
/*    */ import javafx.scene.control.Label;
/*    */ import javafx.scene.layout.StackPane;
/*    */ import javafx.stage.Stage;
/*    */ 
/*    */ public class FlashText extends Application {
/* 11 */   private String text = "";
/*    */   class inner {}
/*    */   
/*    */   class inner2 {}
/*    */   
/*    */   public void start(Stage primaryStage) {
/* 17 */     StackPane pane = new StackPane();
/* 18 */     final Label lblText = new Label("Programming is fun");
/* 19 */     pane.getChildren().add(lblText);
/*    */     
/* 21 */     (new Thread(new Runnable()
/*    */         {
/*    */           public void run() {
/*    */             try {
/*    */               while (true) {
/* 26 */                 if (lblText.getText().trim().length() == 0) {
/* 27 */                   FlashText.this.text = "Welcome";
/*    */                 } else {
/* 29 */                   FlashText.this.text = "";
/*    */                 } 
/* 31 */                 Platform.runLater(new Runnable()
/*    */                     {
/*    */                       public void run() {
/* 34 */                         lblText.setText(FlashText.this.text);
/*    */                       }
/*    */                     });
/*    */                 
/* 38 */                 Thread.sleep(200L);
/*    */               }
/*    */             
/* 41 */             } catch (InterruptedException interruptedException) {
/*    */               return;
/*    */             }  }
/* 44 */         })).start();
/*    */     
/* 46 */     (new Thread(new Runnable()
/*    */         {
/*    */           public void run() {
/*    */             try {
/*    */               while (true) {
/* 51 */                 if (lblText.getText().trim().length() == 0) {
/* 52 */                   FlashText.this.text = "Welcome";
/*    */                 } else {
/* 54 */                   FlashText.this.text = "";
/*    */                 } 
/* 56 */                 Platform.runLater(new Runnable()
/*    */                     {
/*    */                       public void run() {
/* 59 */                         lblText.setText(FlashText.this.text);
/*    */                       }
/*    */                     });
/*    */                 
/* 63 */                 Thread.sleep(200L);
/*    */               }
/*    */             
/* 66 */             } catch (InterruptedException interruptedException) {
/*    */               return;
/*    */             }  }
/* 69 */         })).start();
/*    */ 
/*    */     
/* 72 */     Scene scene = new Scene((Parent)pane, 200.0D, 50.0D);
/* 73 */     primaryStage.setTitle("FlashText");
/* 74 */     primaryStage.setScene(scene);
/* 75 */     primaryStage.show();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void main(String[] args) {
/* 83 */     launch(args);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch32/FlashText.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */