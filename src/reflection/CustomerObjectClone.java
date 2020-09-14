/*    */ package reflection;
/*    */ 
/*    */ import java.lang.reflect.Constructor;
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ 
/*    */ public class CustomerObjectClone
/*    */ {
/*    */   public Object copy(Object object) throws Exception {
/* 11 */     Class<?> classType = object.getClass();
/*    */     
/* 13 */     Constructor<?> ctor = classType.getConstructor(new Class[0]);
/* 14 */     Object objCopy = ctor.newInstance(new Object[0]);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 19 */     Field[] fields = classType.getDeclaredFields();
/* 20 */     for (Field field : fields) {
/* 21 */       String name = field.getName();
/* 22 */       String firstLetter = name.substring(0, 1).toUpperCase();
/* 23 */       String getMethodName = "get" + firstLetter + name.substring(1);
/*    */       
/* 25 */       String setMethodName = "set" + firstLetter + name.substring(1);
/*    */       
/* 27 */       Method getMethod = classType.getMethod(getMethodName, new Class[0]);
/* 28 */       Method setMethod = classType.getMethod(setMethodName, new Class[] { field.getType() });
/*    */       
/* 30 */       Object value = getMethod.invoke(object, new Object[0]);
/* 31 */       setMethod.invoke(objCopy, new Object[] { value });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 36 */     return objCopy;
/*    */   }
/*    */   
/*    */   public static void main(String[] args) throws Exception {
/* 40 */     Customer customer1 = new Customer("Tom", 20);
/* 41 */     customer1.setId(1L);
/*    */     
/* 43 */     CustomerObjectClone test = new CustomerObjectClone();
/* 44 */     Customer customer2 = (Customer)test.copy(customer1);
/* 45 */     System.out.println(customer1);
/* 46 */     System.out.println(customer2);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/CustomerObjectClone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */