package Tryout;

@FunctionalInterface
interface Abc {
    void show();
}

@FunctionalInterface
interface Demo {
    int num = 9;
    void fun();
    default void show() {
        System.out.println("Yes");
    }
    static void printInt() {
        System.out.println("OMG");
    }
}

class DemoImp implements  Demo {
    public void fun() {
        System.out.println("Fun"+ num);
    }
    public void show() {
        System.out.println("New Yes");
    }
}

public class Interface {
    public static void main(String[] args) {
        Abc a1 = () -> System.out.println("I'm the best");
        a1.show();
        DemoImp d1 = new DemoImp();
        d1.show();
        Demo.printInt();
    }
}
