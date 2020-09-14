package annotation;

import java.lang.annotation.*;

public class TestInheritedAnnotation {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Inherited
@interface Inheritable {}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
    String name();
    int age() default 20;
}


@MyAnnotation1
@MyAnnotation3(name="zs")
@Inheritable
class Parent{
    public Parent(){
        System.out.println("Parent Inherited: " + Parent.class.isAnnotationPresent(Inheritable.class));
        System.out.println("Parent MyAnnotation1: " + Parent.class.isAnnotationPresent(MyAnnotation1.class));
        System.out.println("Parent MyAnnotation3: " + Parent.class.isAnnotationPresent(MyAnnotation3.class));
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Inherited: " + Child.class.isAnnotationPresent(Inheritable.class));
        System.out.println("Child MyAnnotation1: " + Child.class.isAnnotationPresent(MyAnnotation1.class));
        System.out.println("Child MyAnnotation3: " + Child.class.isAnnotationPresent(MyAnnotation3.class));
    }
}