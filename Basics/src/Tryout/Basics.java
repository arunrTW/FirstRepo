package Tryout;

public class Basics {
    public static void main(String[] args) {
//        int i = 5;
//        short s = 5;
//        System.out.println(i+ (int)s);
//        float d = 4.5f;
//        char c = 'A';
//        String str = "AA";
//        c = 88;
//        System.out.println(c);
        int m=3, n = 0;
        double d = (double)m/n;
        System.out.println(d);

        if(n == 35) {
            System.out.println("Yes");
        }
        else if(n > 0) {
            System.out.println("YesNo");
        }
        else {
            System.out.println("No");
        }

        switch(n) {
            case 35:
                System.out.println("Yes");
                break;
            case 0:
                System.out.println("YesNo");
            default:
                System.out.println("No");
        }
    }
}
