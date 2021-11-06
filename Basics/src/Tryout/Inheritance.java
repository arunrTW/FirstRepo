package Tryout;

class A {


    public A() {
        System.out.println("A Default constructor");
    }

    public void add(int i, int j) {
        System.out.println(i+j);
    }
}

class B extends A {
    static {
        System.out.println("B Static");
    }

    public B() {
        System.out.println("B Default Constructor");
    }

    public B(int o) {
        System.out.println("B Parameterised Constructor");
    }

    public void sub(int i, int j) {
        System.out.println(i-j);
    }
}

class C extends B {

    public C() {
        System.out.println("C Default Constructor");
    }

    public C(int o) {
        super(o);
        System.out.println("C Parameterised Constructor");
    }

    public void multi(int i, int j) {
        System.out.println(i*j);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        C instance = new C(3);
        instance.add(2,3);
        instance.sub(4,5);
        instance.multi(5,6);
    }
}
