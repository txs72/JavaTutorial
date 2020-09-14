package annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class _03_UseRepeatableAnnotation {
    public static void main(String[] args) {
        try {
            Class<_03_UseRepeatableAnnotation> c = _03_UseRepeatableAnnotation.class;
            Method m1 = c.getMethod("test1", new Class[0]);
            Method m2 = c.getMethod("test2", new Class[0]);

            Annotation[] a1 = m1.getAnnotations();
            for (Annotation a : a1) {
                System.out.println(a);
                if (a instanceof Item) {
                    System.out.println("Item");
                    Item item = (Item) a;
                    System.out.println(((Item) a).description());
                    System.out.println(((Item) a).quantity());
                } else if (a instanceof MyContainer) {
                    System.out.println("MyContainer");
                    MyContainer myContainer = (MyContainer) a;
                    Item[] items = myContainer.value();
                    for (Item item : items) {
                        System.out.println(item.description());
                        System.out.println(item.quantity());
                    }
                }
            }

            Annotation[] a2 = m2.getAnnotations();
            for (Annotation a : a2) {
                System.out.println(a);
                if (a instanceof Item) {
                    System.out.println("Item");
                    Item item = (Item) a;
                    System.out.println(((Item) a).description());
                    System.out.println(((Item) a).quantity());
                } else if (a instanceof MyContainer) {
                    System.out.println("MyContainer");
                    MyContainer myContainer = (MyContainer) a;
                    Item[] items = myContainer.value();
                    for (Item item : items) {
                        System.out.println(item.description());
                        System.out.println(item.quantity());
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Item(description = "table")
    @Item(description = "desk", quantity = 400)
    public void test1() {
    }

    @MyContainer({@Item(description = "table"),
            @Item(description = "desk", quantity = 400)})
    public void test2() {
    }
}

@Repeatable(MyContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Item {
    String description();
    int quantity() default 100;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyContainer {
    Item[] value();
}
