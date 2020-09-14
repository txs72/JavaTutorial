/*    */ package ch07;
/*    */ 
/*    */ 
/*    */ public class Calculator
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     if (args.length != 3) {
/*  8 */       System.out.println("Usage: java Calculator operand1 operator operand2");
/*    */       
/* 10 */       System.exit(0);
/*    */     } 
/*    */ 
/*    */     
/* 14 */     int result = 0;
/*    */ 
/*    */     
/* 17 */     switch (args[1].charAt(0)) {
/*    */       case '+':
/* 19 */         result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
/*    */         break;
/*    */       case '-':
/* 22 */         result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
/*    */         break;
/*    */       case '.':
/* 25 */         result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
/*    */         break;
/*    */       case '/':
/* 28 */         result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
/*    */         break;
/*    */     } 
/*    */     
/* 32 */     System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch07/Calculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */