package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@MyAnnotation1
public class _01_UseAnnotation {
  @MyAnnotation1
  public static void main(@MyAnnotation1 String[] args) {
    @MyAnnotation1 int a;
  }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation1 {

}
