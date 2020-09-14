/*     */ package ch13;
/*     */ 
/*     */ public class Rational
/*     */   extends Number implements Comparable<Rational> {
/*   5 */   private long numerator = 0L;
/*   6 */   private long denominator = 1L;
/*     */ 
/*     */   
/*     */   public Rational() {
/*  10 */     this(0L, 1L);
/*     */   }
/*     */ 
/*     */   
/*     */   public Rational(long numerator, long denominator) {
/*  15 */     long gcd = gcd(numerator, denominator);
/*  16 */     this.numerator = ((denominator > 0L) ? 1L : -1L) * numerator / gcd;
/*  17 */     this.denominator = Math.abs(denominator) / gcd;
/*     */   }
/*     */ 
/*     */   
/*     */   private static long gcd(long n, long d) {
/*  22 */     long n1 = Math.abs(n);
/*  23 */     long n2 = Math.abs(d);
/*  24 */     int gcd = 1;
/*     */     
/*  26 */     for (int k = 1; k <= n1 && k <= n2; k++) {
/*  27 */       if (n1 % k == 0L && n2 % k == 0L) {
/*  28 */         gcd = k;
/*     */       }
/*     */     } 
/*  31 */     return gcd;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getNumerator() {
/*  36 */     return this.numerator;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getDenominator() {
/*  41 */     return this.denominator;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Rational add(Rational secondRational) {
/*  47 */     long n = this.numerator * secondRational.getDenominator() + this.denominator * secondRational.getNumerator();
/*  48 */     long d = this.denominator * secondRational.getDenominator();
/*  49 */     return new Rational(n, d);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Rational subtract(Rational secondRational) {
/*  55 */     long n = this.numerator * secondRational.getDenominator() - this.denominator * secondRational.getNumerator();
/*  56 */     long d = this.denominator * secondRational.getDenominator();
/*  57 */     return new Rational(n, d);
/*     */   }
/*     */ 
/*     */   
/*     */   public Rational multiply(Rational secondRational) {
/*  62 */     long n = this.numerator * secondRational.getNumerator();
/*  63 */     long d = this.denominator * secondRational.getDenominator();
/*  64 */     return new Rational(n, d);
/*     */   }
/*     */ 
/*     */   
/*     */   public Rational divide(Rational secondRational) {
/*  69 */     long n = this.numerator * secondRational.getDenominator();
/*  70 */     long d = this.denominator * secondRational.numerator;
/*  71 */     return new Rational(n, d);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  76 */     if (this.denominator == 1L) {
/*  77 */       return this.numerator + "";
/*     */     }
/*  79 */     return this.numerator + "/" + this.denominator;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object other) {
/*  84 */     if (subtract((Rational)other).getNumerator() == 0L) {
/*  85 */       return true;
/*     */     }
/*  87 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int intValue() {
/*  92 */     return (int)doubleValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public float floatValue() {
/*  97 */     return (float)doubleValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public double doubleValue() {
/* 102 */     return this.numerator * 1.0D / this.denominator;
/*     */   }
/*     */ 
/*     */   
/*     */   public long longValue() {
/* 107 */     return (long)doubleValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public int compareTo(Rational o) {
/* 112 */     if (subtract(o).getNumerator() > 0L)
/* 113 */       return 1; 
/* 114 */     if (subtract(o).getNumerator() < 0L) {
/* 115 */       return -1;
/*     */     }
/* 117 */     return 0;
/*     */   }
/*     */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch13/Rational.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */