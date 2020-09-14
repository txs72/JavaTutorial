/*    */ package awt;
/*    */ import java.awt.*;
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */

/*    */
/*    */ public class MessageGUI2 extends Frame {
/* 12 */   Label sentLabel = new Label("Messages Sent");
/* 13 */   Label recvLabel = new Label("Messages Received");
/*    */   
/* 15 */   TextArea sentTA = new TextArea();
/* 16 */   TextArea recvTA = new TextArea();
/*    */   
/* 18 */   TextField message = new TextField();
/* 19 */   Button send = new Button("SEND");
/* 20 */   Button read = new Button("READ");
/* 21 */   Button clear = new Button("CLEAR");
/* 22 */   Button exit = new Button("EXIT");
/*    */   public MessageGUI2() {
/* 24 */     Panel labelPanel = new Panel();
/* 25 */     labelPanel.setLayout(new GridLayout(1, 2));
/* 26 */     labelPanel.add(this.sentLabel);
/* 27 */     labelPanel.add(this.recvLabel);
/*    */     
/* 29 */     Panel taPanel = new Panel();
/* 30 */     taPanel.setLayout(new GridLayout(1, 2));
/* 31 */     taPanel.add(this.sentTA);
/* 32 */     taPanel.add(this.recvTA);
/*    */     
/* 34 */     Panel messagesPanel = new Panel();
/* 35 */     messagesPanel.setLayout(new BorderLayout());
/* 36 */     messagesPanel.add(labelPanel, "North");
/* 37 */     messagesPanel.add(taPanel, "Center");
/*    */     
/* 39 */     Panel buttonsPanel = new Panel();
/* 40 */     buttonsPanel.setLayout(new FlowLayout());
/* 41 */     buttonsPanel.add(this.send);
/* 42 */     buttonsPanel.add(this.read);
/* 43 */     buttonsPanel.add(this.clear);
/* 44 */     buttonsPanel.add(this.exit);
/*    */     
/* 46 */     Panel messagebuttonsPanel = new Panel();
/* 47 */     messagebuttonsPanel.setLayout(new GridLayout(2, 1));
/* 48 */     messagebuttonsPanel.add(this.message);
/* 49 */     messagebuttonsPanel.add(buttonsPanel);
/*    */ 
/*    */     
/* 52 */     setLayout(new BorderLayout());
/* 53 */     add(messagesPanel, "Center");
/* 54 */     add(messagebuttonsPanel, "South");
/*    */     
/* 56 */     setSize(800, 600);
/*    */     
/* 58 */     setVisible(true);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void main(String[] args) {
/* 63 */     MessageGUI2 messageGUI = new MessageGUI2();
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/awt/MessageGUI2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */