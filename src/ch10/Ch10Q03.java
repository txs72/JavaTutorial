/*     */ package ch10;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Ch10Q03
/*     */ {
/*     */   public static void main(String[] args) {
/*   9 */     int[] even = { 2, 4, 6, 8, 100 };
/*  10 */     int[] odd = { 1, 3, 5, 7, 19 };
/*  11 */     int[] prime = { 2, 3, 7, 11, 79 };
/*     */     
/*  13 */     System.out.println("Test 普通成员函数 - isEven"); int i;
/*  14 */     for (i = 0; i < even.length; i++) {
/*  15 */       MyInteger myInteger = new MyInteger(even[i]);
/*  16 */       System.out.print(myInteger.isEven() + " ");
/*     */     } 
/*  18 */     System.out.println();
/*  19 */     for (i = 0; i < odd.length; i++) {
/*  20 */       MyInteger myInteger = new MyInteger(odd[i]);
/*  21 */       System.out.print(myInteger.isEven() + " ");
/*     */     } 
/*  23 */     System.out.println();
/*     */     
/*  25 */     System.out.println("Test 普通成员函数 - isOdd");
/*  26 */     for (i = 0; i < odd.length; i++) {
/*  27 */       MyInteger myInteger = new MyInteger(odd[i]);
/*  28 */       System.out.print(myInteger.isOdd() + " ");
/*     */     } 
/*  30 */     System.out.println();
/*  31 */     for (i = 0; i < even.length; i++) {
/*  32 */       MyInteger myInteger = new MyInteger(even[i]);
/*  33 */       System.out.print(myInteger.isOdd() + " ");
/*     */     } 
/*  35 */     System.out.println();
/*     */     
/*  37 */     System.out.println("Test 普通成员函数 - isPrime");
/*  38 */     for (i = 0; i < prime.length; i++) {
/*  39 */       MyInteger myInteger = new MyInteger(prime[i]);
/*  40 */       System.out.print(myInteger.isPrime() + " ");
/*     */     } 
/*  42 */     System.out.println();
/*  43 */     for (i = 0; i < even.length; i++) {
/*  44 */       MyInteger myInteger = new MyInteger(even[i]);
/*  45 */       System.out.print(myInteger.isPrime() + " ");
/*     */     } 
/*  47 */     System.out.println();
/*     */ 
/*     */ 
/*     */     
/*  51 */     System.out.println("Test 普通静态成员函数 - isEven - int");
/*  52 */     for (i = 0; i < even.length; i++) {
/*  53 */       System.out.print(MyInteger.isEven(even[i]) + " ");
/*     */     }
/*  55 */     System.out.println();
/*  56 */     for (i = 0; i < odd.length; i++) {
/*  57 */       System.out.print(MyInteger.isEven(odd[i]) + " ");
/*     */     }
/*  59 */     System.out.println();
/*     */     
/*  61 */     System.out.println("Test 普通静态成员函数 - isOdd - int");
/*  62 */     for (i = 0; i < odd.length; i++) {
/*  63 */       System.out.print(MyInteger.isOdd(odd[i]) + " ");
/*     */     }
/*  65 */     System.out.println();
/*  66 */     for (i = 0; i < even.length; i++) {
/*  67 */       System.out.print(MyInteger.isOdd(even[i]) + " ");
/*     */     }
/*  69 */     System.out.println();
/*     */ 
/*     */     
/*  72 */     System.out.println("Test 普通静态成员函数 - isPrime - int");
/*  73 */     for (i = 0; i < prime.length; i++) {
/*  74 */       System.out.print(MyInteger.isPrime(prime[i]) + " ");
/*     */     }
/*  76 */     System.out.println();
/*  77 */     for (i = 0; i < even.length; i++) {
/*  78 */       System.out.print(MyInteger.isPrime(even[i]) + " ");
/*     */     }
/*  80 */     System.out.println();
/*     */ 
/*     */ 
/*     */     
/*  84 */     System.out.println("Test 普通静态成员函数 - isEven - MyInteger");
/*  85 */     for (i = 0; i < even.length; i++) {
/*  86 */       System.out.print(MyInteger.isEven(new MyInteger(even[i])) + " ");
/*     */     }
/*  88 */     System.out.println();
/*  89 */     for (i = 0; i < odd.length; i++) {
/*  90 */       System.out.print(MyInteger.isEven(new MyInteger(odd[i])) + " ");
/*     */     }
/*  92 */     System.out.println();
/*     */     
/*  94 */     System.out.println("Test 普通静态成员函数 - isOdd- MyInteger");
/*  95 */     for (i = 0; i < odd.length; i++) {
/*  96 */       System.out.print(MyInteger.isOdd(new MyInteger(odd[i])) + " ");
/*     */     }
/*  98 */     System.out.println();
/*  99 */     for (i = 0; i < even.length; i++) {
/* 100 */       System.out.print(MyInteger.isOdd(new MyInteger(even[i])) + " ");
/*     */     }
/* 102 */     System.out.println();
/*     */ 
/*     */     
/* 105 */     System.out.println("Test 普通静态成员函数 - isPrime- MyInteger");
/* 106 */     for (i = 0; i < prime.length; i++) {
/* 107 */       System.out.print(MyInteger.isPrime(new MyInteger(prime[i])) + " ");
/*     */     }
/* 109 */     System.out.println();
/* 110 */     for (i = 0; i < even.length; i++) {
/* 111 */       System.out.print(MyInteger.isPrime(new MyInteger(even[i])) + " ");
/*     */     }
/* 113 */     System.out.println();
/*     */ 
/*     */     
/* 116 */     System.out.println("Test 普通成员函数 equals - int");
/* 117 */     MyInteger myInteger1 = new MyInteger(10);
/* 118 */     System.out.println(myInteger1.equals(10));
/* 119 */     System.out.println(myInteger1.equals(111));
/*     */     
/* 121 */     System.out.println("Test 普通成员函数 equals - MyInteger");
/* 122 */     MyInteger myInteger2 = new MyInteger(10);
/* 123 */     System.out.println(myInteger2.equals(new MyInteger(10)));
/* 124 */     System.out.println(myInteger2.equals(new MyInteger(101)));
/*     */ 
/*     */     
/* 127 */     System.out.println("Test 普通成员函数 parseInt - String");
/* 128 */     String s = "12345";
/* 129 */     System.out.println(MyInteger.parseInt(s));
/*     */     
/* 131 */     System.out.println("Test 普通成员函数 parseInt - char[]");
/* 132 */     char[] c = { '1', '2', '3', '4', '5' };
/* 133 */     System.out.println(MyInteger.parseInt(c));
/*     */   }
/*     */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch10/Ch10Q03.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */