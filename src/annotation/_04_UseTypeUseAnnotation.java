package annotation;

import java.io.Serializable;
import java.lang.annotation.*;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.LinkedList;
import java.util.List;

public class _04_UseTypeUseAnnotation {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("annotation.TypeUseExample");

            System.out.println("---------interface --------");

            // 读取实现接口添加的注解
            AnnotatedType[] annotationInterfaces = c.getAnnotatedInterfaces();
            System.out.println(annotationInterfaces);
            for (AnnotatedType annotationInterface : annotationInterfaces) {
                for (Annotation a : annotationInterface.getAnnotations()) {
                    System.out.println(a);
                    if(a instanceof MyNotNull){
                        MyNotNull myNotNull = (MyNotNull)a;
                        System.out.println(myNotNull.value());
                    }
                }
            }
            System.out.println("-----------------");

            // 读取抛出方法异常的注解
            Method method = c.getMethod("foo", new Class[]{List.class});
            AnnotatedType[] annotatedExceptions = method.getAnnotatedExceptionTypes();
            System.out.println(annotatedExceptions);
            for (AnnotatedType annotationException : annotatedExceptions) {
                for (Annotation a : annotationException.getAnnotations()) {
                    System.out.println(a);
                    if(a instanceof MyNotNull){
                        MyNotNull myNotNull = (MyNotNull)a;
                        System.out.println(myNotNull.value());
                    }
                }
            }
            System.out.println("-----------------");
            Parameter[] parameters = method.getParameters();
            for(Parameter parameter: parameters){
                System.out.println(parameter);
                AnnotatedType annotationType = parameter.getAnnotatedType();
                System.out.println(annotationType);
                for(Annotation a : annotationType.getAnnotations()){
                    System.out.println(a);
                }
            }

            System.out.println("-----------------");
            AnnotatedType annotatedReturnTypes = method.getAnnotatedReturnType();
            System.out.println(annotatedReturnTypes);

            for(Annotation a: annotatedReturnTypes.getDeclaredAnnotations()){
                System.out.println(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface MyNotNull {
    String value() default "";
}

class TypeUseExample implements @MyNotNull(value="Serializable") Serializable {
    public @MyNotNull("Before Return Value") List foo(@MyNotNull("Function Parameter") List list)
            throws @MyNotNull(value="ClassNotFoundException") ClassNotFoundException {
        Object obj = new @MyNotNull String("annotation.Test");

        String str = (String) obj;
        return new LinkedList();
    }
}
