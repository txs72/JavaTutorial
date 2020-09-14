package reflection;

public class _01_ClassDemo {
    public static void main(String[] args) {
//        Class<int> c1 = int.class;
        Class<String> c2 = String.class;
        Class<Double> c3 = Double.class;
//        Class<void> c4 = void.class;
        Class<Foo> c5 = Foo.class;

//        System.out.println(c1.getName());
        System.out.println(c2.getSimpleName());
        System.out.println(c3.getSimpleName());
//        System.out.println(c4.getName());
        System.out.println(c5.getName());
        System.out.println(c5.getSimpleName());
    }
}

