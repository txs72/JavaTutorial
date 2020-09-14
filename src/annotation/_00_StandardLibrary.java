package annotation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class _00_StandardLibrary {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getDate());

        TestDeprecation.test();
    }

    public String toString() {
        return "std_lib";
    }

    @SuppressWarnings("deprecation")
    public void suppressDeprecatedWarning() {
        Date d = new Date();
        System.out.println(d.getDate());
    }


    @SuppressWarnings("unchecked")
    public void suppressUncheckedWarning() {
        List<String> myList = new ArrayList();
        myList.add("hello");
        System.out.println(myList);
    }
}

class TestDeprecation {
    @Deprecated
    static void test() {
    }
}

class SafeVarargsAnnotation<C>{
    private C[] args;

    @SafeVarargs
    public SafeVarargsAnnotation(C... args){
        this.args = args;
    }
}