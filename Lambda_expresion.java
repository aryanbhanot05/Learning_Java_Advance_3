package Java_Advance_3;
@FunctionalInterface
interface Demo1 {
    public void meth1();
    // public void meth2();
}

interface Demo2{
    public int add(int a, int b);
}

public class Lambda_expresion {
    // To use lambda expression,it is important that the interface we are implementing
    // is a functional interface.

    public static void main(String[] args) {
        Demo1 d = () -> System.out.println("Hello World!");
        d.meth1();
        System.out.println();
        Demo2 d2 = (int a , int b) -> a + b;
        System.out.println(d2.add(5, 7));
    }
}
