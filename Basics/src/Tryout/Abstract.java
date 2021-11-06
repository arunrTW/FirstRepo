package Tryout;

abstract class Writer {
    public abstract void writing();
}

interface Owner {
    void bookCount();
}

class Pen extends Writer implements Owner {
    public void writing() {
        System.out.println("First Book");
    }
    public void inkRefill() {
        System.out.println("Ink Refilled");
    }

    @Override
    public void bookCount() {
        System.out.println(5);
    }
}

class Pencil extends Writer {
    public final int i = 10;
    public final void writing() {
        System.out.println("First Notebook");
    }
}

class OverrideExam {

    public void doSomething(Writer p) {
        p.writing();
    }
}

public class Abstract {
    public static void main(String[] args) {
        Writer p1 = new Pen();
        Writer p2 = new Pencil();
        OverrideExam ov1 = new OverrideExam();
        Owner o1 = new Owner() {
            @Override
            public void bookCount() {
                System.out.println("7 Books");
            }
        };
        o1.bookCount();
        ov1.doSomething(p1);
        ov1.doSomething(p2);
    }
}
