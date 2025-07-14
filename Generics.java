package Java_Advance_3;

class MyGen <T1>{
    int val;
    private T1 t;

    public MyGen(int val, T1 t){
        this.val = val;
        this.t = t;
    }

    public int getVal() {
        return this.val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT() {
        return this.t;
    }

    public void setT(T1 t) {
        this.t = t;
    }
}

public class Generics {
    public static void main(String[] args) {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        MyGen m = new MyGen(1, "My name is Aryan Bhanot");
        System.out.println(m.getT());
        System.out.println(m.getVal());
    }
}
