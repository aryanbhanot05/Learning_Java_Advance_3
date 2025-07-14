package Java_Advance_3;

interface Demo {
    public void meth1();
    public void meth2();
}

public class Anonymous_Class {
    // Anonymous class can be used once only.
    // If we try to create another object of the same anonymous class, it will give error. 
    public static void main(String[] args) {
        Demo d = new Demo(){
            @Override
            public void meth1() {
               System.out.println("i am method 1"); 
            }

            @Override
            public void meth2() {
                System.out.println("i am method 2");
            }
        };

        d.meth1();
        d.meth2();
    }
}
