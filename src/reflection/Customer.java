/*    */ package reflection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class Customer
/*    */ {
/*    */   private long id;
/*    */   private String name;
/*    */   private int age;
/*    */   
/*    */   public Customer() {}
/*    */   
/*    */   public Customer(String name, int age) {
/* 57 */     this.name = name;
/* 58 */     this.age = age;
/*    */   }
/*    */   public long getId() {
/* 61 */     return this.id;
/*    */   }
/*    */   public void setId(long id) {
/* 64 */     this.id = id;
/*    */   }
/*    */   public String getName() {
/* 67 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 70 */     this.name = name;
/*    */   }
/*    */   public int getAge() {
/* 73 */     return this.age;
/*    */   }
/*    */   public void setAge(int age) {
/* 76 */     this.age = age;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 80 */     return "Customer [id=" + this.id + ", name=" + this.name + ", age=" + this.age + "]";
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/reflection/Customer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */