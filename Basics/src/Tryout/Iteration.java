package Tryout;

public class Iteration {
    public static void main(String[] args) {
        int i = 0;
        for(; i< 5;i++) {
            System.out.println("Hello");
        }
        while(i > 0) {
            System.out.println("Hello");
            i--;
        }

        int[] numArr = {1,2,3,4,5};
        System.out.println(numArr.length);
        for(int item : numArr) {
            System.out.println(item);
        }


    }
}
