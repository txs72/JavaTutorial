/*     */ package awt;
/*     */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*     */ 
/*     */ public class MessageGUI implements ActionListener {
/*     */   private Label sentLabel;
/*     */   private Label recvLabel;
/*     */   private TextArea sentTA;
/*     */   private TextArea recvTA;
/*     */   
/*     */   public MessageGUI() {
/*  13 */     this.sentLabel = new Label("Messages Sent");
/*  14 */     this.recvLabel = new Label("Messages Received");
/*     */     
/*  16 */     this.sentTA = new TextArea();
/*  17 */     this.recvTA = new TextArea();
/*     */     
/*  19 */     this.message = new TextField();
/*  20 */     this.send = new Button("SEND");
/*  21 */     this.read = new Button("READ");
/*  22 */     this.clear = new Button("CLEAR");
/*  23 */     this.exit = new Button("EXIT");
/*     */ 
/*     */     
/*  26 */     this.send.addActionListener(this);
/*  27 */     this.read.addActionListener(this);
/*  28 */     this.clear.addActionListener(this);
/*  29 */     this.exit.addActionListener(this);
/*     */     
/*  31 */     Panel labelPanel = new Panel();
/*  32 */     labelPanel.setLayout(new GridLayout(1, 2));
/*  33 */     labelPanel.add(this.sentLabel);
/*  34 */     labelPanel.add(this.recvLabel);
/*     */     
/*  36 */     Panel taPanel = new Panel();
/*  37 */     taPanel.setLayout(new GridLayout(1, 2));
/*  38 */     taPanel.add(this.sentTA);
/*  39 */     taPanel.add(this.recvTA);
/*     */     
/*  41 */     Panel messagesPanel = new Panel();
/*  42 */     messagesPanel.setLayout(new BorderLayout());
/*  43 */     messagesPanel.add(labelPanel, "North");
/*  44 */     messagesPanel.add(taPanel, "Center");
/*     */     
/*  46 */     Panel buttonsPanel = new Panel();
/*  47 */     buttonsPanel.setLayout(new FlowLayout());
/*  48 */     buttonsPanel.add(this.send);
/*  49 */     buttonsPanel.add(this.read);
/*  50 */     buttonsPanel.add(this.clear);
/*  51 */     buttonsPanel.add(this.exit);
/*     */     
/*  53 */     Panel messagebuttonsPanel = new Panel();
/*  54 */     messagebuttonsPanel.setLayout(new GridLayout(2, 1));
/*  55 */     messagebuttonsPanel.add(this.message);
/*  56 */     messagebuttonsPanel.add(buttonsPanel);
/*     */     
/*  58 */     Frame frame = new Frame();
/*  59 */     frame.setLayout(new BorderLayout());
/*  60 */     frame.add(messagesPanel, "Center");
/*  61 */     frame.add(messagebuttonsPanel, "South");
/*     */     
/*  63 */     frame.addWindowListener(new WindowAdapter()
/*     */         {
/*     */           public void windowClosing(WindowEvent e) {
/*  66 */             super.windowClosing(e);
/*  67 */             System.exit(0);
/*     */           }
/*     */         });
/*     */     
/*  71 */     frame.addWindowListener(new WindowAdapter()
/*     */         {
/*     */           public void windowClosing(WindowEvent e) {
/*  74 */             super.windowClosing(e);
/*  75 */             System.exit(0);
/*     */           }
/*     */         });
/*     */     
/*  79 */     frame.setSize(800, 600);
/*  80 */     frame.pack();
/*  81 */     frame.setVisible(true);
/*     */   }
/*     */   private TextField message; private Button send; private Button read; private Button clear; private Button exit;
/*     */   
/*     */   public static void main(String[] args) {
/*  86 */     MessageGUI messageGUI = new MessageGUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void actionPerformed(ActionEvent e) {
/*  91 */     if (e.getSource() == this.send) {
/*  92 */       String msg = this.message.getText();
/*  93 */       String sendMsg = this.sentTA.getText();
/*  94 */       this.sentTA.setText(sendMsg + "\n" + msg);
/*     */     }
/*  96 */     else if (e.getSource() == this.read) {
/*  97 */       String recvMsg = this.recvTA.getText();
/*  98 */       this.recvTA.setText(recvMsg + "\nrecv msg...");
/*     */     }
/* 100 */     else if (e.getSource() == this.clear) {
/* 101 */       this.message.setText("");
/* 102 */       this.sentTA.setText("");
/* 103 */       this.recvTA.setText("");
/*     */     }
/* 105 */     else if (e.getSource() == this.exit) {
/* 106 */       System.exit(0);
/*     */     } 
/*     */   }
/*     */ }

