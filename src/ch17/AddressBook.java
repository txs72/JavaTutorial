/*     */ package ch17;
/*     */ 
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.BevelBorder;
/*     */ 
/*     */ 
/*     */ public class AddressBook
/*     */   extends JFrame
/*     */ {
/*     */   static final int NAME_SIZE = 32;
/*     */   static final int STREET_SIZE = 32;
/*     */   static final int CITY_SIZE = 20;
/*  23 */   private JTextField jtfName = new JTextField(32); static final int STATE_SIZE = 2; static final int ZIP_SIZE = 5; static final int RECORD_SIZE = 91; private RandomAccessFile raf;
/*  24 */   private JTextField jtfStreet = new JTextField(32);
/*  25 */   private JTextField jtfCity = new JTextField(20);
/*  26 */   private JTextField jtfState = new JTextField(2);
/*  27 */   private JTextField jtfZip = new JTextField(5);
/*     */ 
/*     */   
/*  30 */   private JButton jbtAdd = new JButton("Add");
/*  31 */   private JButton jbtFirst = new JButton("First");
/*  32 */   private JButton jbtNext = new JButton("Next");
/*  33 */   private JButton jbtPrevious = new JButton("Previous");
/*  34 */   private JButton jbtLast = new JButton("Last");
/*     */ 
/*     */   
/*     */   public AddressBook() {
/*     */     try {
/*  39 */       this.raf = new RandomAccessFile("address.dat", "rw");
/*     */     }
/*  41 */     catch (IOException ex) {
/*  42 */       System.out.print("Error: " + ex);
/*  43 */       System.exit(1);
/*     */     } 
/*     */ 
/*     */     
/*  47 */     JPanel p1 = new JPanel();
/*  48 */     p1.setLayout(new GridLayout(3, 1));
/*  49 */     p1.add(new JLabel("Name"));
/*  50 */     p1.add(new JLabel("Street"));
/*  51 */     p1.add(new JLabel("City"));
/*     */ 
/*     */     
/*  54 */     JPanel jpState = new JPanel();
/*  55 */     jpState.setLayout(new BorderLayout());
/*  56 */     jpState.add(new JLabel("State"), "West");
/*  57 */     jpState.add(this.jtfState, "Center");
/*     */ 
/*     */     
/*  60 */     JPanel jpZip = new JPanel();
/*  61 */     jpZip.setLayout(new BorderLayout());
/*  62 */     jpZip.add(new JLabel("Zip"), "West");
/*  63 */     jpZip.add(this.jtfZip, "Center");
/*     */ 
/*     */     
/*  66 */     JPanel p2 = new JPanel();
/*  67 */     p2.setLayout(new BorderLayout());
/*  68 */     p2.add(jpState, "West");
/*  69 */     p2.add(jpZip, "Center");
/*     */ 
/*     */     
/*  72 */     JPanel p3 = new JPanel();
/*  73 */     p3.setLayout(new BorderLayout());
/*  74 */     p3.add(this.jtfCity, "Center");
/*  75 */     p3.add(p2, "East");
/*     */ 
/*     */     
/*  78 */     JPanel p4 = new JPanel();
/*  79 */     p4.setLayout(new GridLayout(3, 1));
/*  80 */     p4.add(this.jtfName);
/*  81 */     p4.add(this.jtfStreet);
/*  82 */     p4.add(p3);
/*     */ 
/*     */     
/*  85 */     JPanel jpAddress = new JPanel(new BorderLayout());
/*  86 */     jpAddress.add(p1, "West");
/*  87 */     jpAddress.add(p4, "Center");
/*     */ 
/*     */     
/*  90 */     jpAddress.setBorder(new BevelBorder(0));
/*     */ 
/*     */     
/*  93 */     JPanel jpButton = new JPanel();
/*  94 */     jpButton.add(this.jbtAdd);
/*  95 */     jpButton.add(this.jbtFirst);
/*  96 */     jpButton.add(this.jbtNext);
/*  97 */     jpButton.add(this.jbtPrevious);
/*  98 */     jpButton.add(this.jbtLast);
/*     */ 
/*     */     
/* 101 */     add(jpAddress, "Center");
/* 102 */     add(jpButton, "South");
/*     */     
/* 104 */     this.jbtAdd.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/* 107 */             AddressBook.this.writeAddress();
/*     */           }
/*     */         });
/* 110 */     this.jbtFirst.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/* 114 */               if (AddressBook.this.raf.length() > 0L) AddressBook.this.readAddress(0L);
/*     */             
/* 116 */             } catch (IOException ex) {
/* 117 */               ex.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/* 121 */     this.jbtNext.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/* 125 */               long currentPosition = AddressBook.this.raf.getFilePointer();
/* 126 */               if (currentPosition < AddressBook.this.raf.length()) {
/* 127 */                 AddressBook.this.readAddress(currentPosition);
/*     */               }
/* 129 */             } catch (IOException ex) {
/* 130 */               ex.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/* 134 */     this.jbtPrevious.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/* 138 */               long currentPosition = AddressBook.this.raf.getFilePointer();
/* 139 */               if (currentPosition - 182L > 0L) {
/*     */                 
/* 141 */                 AddressBook.this.readAddress(currentPosition - 364L);
/*     */               } else {
/* 143 */                 AddressBook.this.readAddress(0L);
/*     */               } 
/* 145 */             } catch (IOException ex) {
/* 146 */               ex.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/* 150 */     this.jbtLast.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/* 153 */               long lastPosition = AddressBook.this.raf.length();
/* 154 */               if (lastPosition > 0L)
/*     */               {
/* 156 */                 AddressBook.this.readAddress(lastPosition - 182L);
/*     */               }
/* 158 */             } catch (IOException ex) {
/* 159 */               ex.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */     
/*     */     try {
/* 166 */       if (this.raf.length() > 0L) readAddress(0L);
/*     */     
/* 168 */     } catch (IOException ex) {
/* 169 */       ex.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void writeAddress() {
/*     */     try {
/* 176 */       this.raf.seek(this.raf.length());
/* 177 */       FixedLengthStringIO.writeFixedLengthString(this.jtfName
/* 178 */           .getText(), 32, this.raf);
/* 179 */       FixedLengthStringIO.writeFixedLengthString(this.jtfStreet
/* 180 */           .getText(), 32, this.raf);
/* 181 */       FixedLengthStringIO.writeFixedLengthString(this.jtfCity
/* 182 */           .getText(), 20, this.raf);
/* 183 */       FixedLengthStringIO.writeFixedLengthString(this.jtfState
/* 184 */           .getText(), 2, this.raf);
/* 185 */       FixedLengthStringIO.writeFixedLengthString(this.jtfZip
/* 186 */           .getText(), 5, this.raf);
/*     */     }
/* 188 */     catch (IOException ex) {
/* 189 */       ex.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void readAddress(long position) throws IOException {
/* 195 */     this.raf.seek(position);
/* 196 */     String name = FixedLengthStringIO.readFixedLengthString(32, this.raf);
/*     */     
/* 198 */     String street = FixedLengthStringIO.readFixedLengthString(32, this.raf);
/*     */     
/* 200 */     String city = FixedLengthStringIO.readFixedLengthString(20, this.raf);
/*     */     
/* 202 */     String state = FixedLengthStringIO.readFixedLengthString(2, this.raf);
/*     */     
/* 204 */     String zip = FixedLengthStringIO.readFixedLengthString(5, this.raf);
/*     */ 
/*     */     
/* 207 */     this.jtfName.setText(name);
/* 208 */     this.jtfStreet.setText(street);
/* 209 */     this.jtfCity.setText(city);
/* 210 */     this.jtfState.setText(state);
/* 211 */     this.jtfZip.setText(zip);
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/* 215 */     AddressBook frame = new AddressBook();
/* 216 */     frame.pack();
/* 217 */     frame.setTitle("AddressBook");
/* 218 */     frame.setDefaultCloseOperation(3);
/* 219 */     frame.setVisible(true);
/*     */   }
/*     */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch17/AddressBook.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */