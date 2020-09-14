package annotation;

/**
 * JVM option
 * jdk8 -Dsun.misc.ProxyGenerator.saveGeneratedFiles
 * jdk8+ -Djdk.proxy.ProxyGenerator.saveGeneratedFiles=true
 */

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class _02_UseAnnotation {
    @MyAnnotation1
    @MyAnnotation2(name = "zhangsan", age = 32)
    public void test() {
    }

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("annotation._02_UseAnnotation");

            System.out.println("==========");
            Method method = clazz.getMethod("test", new Class[0]);

            System.out.println(method.isAnnotationPresent(MyAnnotation2.class));

            Annotation annotation = method.getAnnotation((Class) MyAnnotation2.class);
            System.out.println(annotation);
            System.out.println(((MyAnnotation2) annotation).name());
            System.out.println(((MyAnnotation2) annotation).age());

            System.out.println("==========");
            Annotation[] annotations = method.getAnnotations();
            for (Annotation a : annotations) {
                System.out.println(a.annotationType());
                if (a instanceof MyAnnotation2) {
                    MyAnnotation2 myAnnotation2 = (MyAnnotation2) a;
                    System.out.println(myAnnotation2.name());
                    System.out.println(myAnnotation2.age());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface MyAnnotation2 {
    String name();
    int age() default 20;
}
