/*     */ package ch10;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class MyInteger
/*     */ {
/*     */   private int value;
/*     */   
/*     */   public MyInteger(int value) {
/* 141 */     this.value = value;
/*     */   }
/*     */   
/*     */   public int getValue() {
/* 145 */     return this.value;
/*     */   }
/*     */   
/*     */   public boolean isEven() {
/* 149 */     return (this.value % 2 == 0); } public boolean isOdd() {
/* 150 */     return (this.value % 2 == 1);
/*     */   } public boolean isPrime() {
/* 152 */     boolean isPrime = true;
/* 153 */     if (this.value == 2) return true; 
/* 154 */     for (int i = 2; i < this.value; i++) {
/* 155 */       if (this.value % i == 0) {
/* 156 */         isPrime = false;
/*     */         break;
/*     */       } 
/*     */     } 
/* 160 */     return isPrime;
/*     */   }
/*     */   
/*     */   public static boolean isEven(int value) {
/* 164 */     return (value % 2 == 0); } public static boolean isOdd(int value) {
/* 165 */     return (value % 2 == 1);
/*     */   } public static boolean isPrime(int value) {
/* 167 */     boolean isPrime = true;
/* 168 */     for (int i = 2; i < value; i++) {
/* 169 */       if (value % i == 0) {
/* 170 */         isPrime = false;
/*     */         break;
/*     */       } 
/*     */     } 
/* 174 */     return isPrime;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isEven(MyInteger value) {
/* 179 */     return (value.getValue() % 2 == 0);
/*     */   }
/*     */   public static boolean isOdd(MyInteger value) {
/* 182 */     return (value.getValue() % 2 == 1);
/*     */   }
/*     */   public static boolean isPrime(MyInteger value) {
/* 185 */     boolean isPrime = true;
/* 186 */     for (int i = 2; i < value.getValue(); i++) {
/* 187 */       if (value.getValue() % i == 0) {
/* 188 */         isPrime = false;
/*     */         break;
/*     */       } 
/*     */     } 
/* 192 */     return isPrime;
/*     */   }
/*     */   
/*     */   public boolean equals(int value) {
/* 196 */     return (this.value == value);
/*     */   }
/*     */   
/*     */   public boolean equals(MyInteger value) {
/* 200 */     return (this.value == value.getValue());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int parseInt(String s) {
/* 207 */     int rv = 0;
/* 208 */     for (int i = 0; i < s.length(); i++) {
/*     */       
/* 210 */       int v = s.charAt(i) - 48;
/* 211 */       rv *= 10;
/* 212 */       rv += v;
/*     */     } 
/* 214 */     return rv;
/*     */   }
/*     */   
/*     */   public static int parseInt(char[] c) {
/* 218 */     String s = "";
/* 219 */     for (int i = 0; i < c.length; i++) {
/* 220 */       s = s + c[i];
/*     */     }
/* 222 */     return parseInt(s);
/*     */   }
/*     */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/MyInteger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */