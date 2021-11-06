package Tryout;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        char character = 'A';
        System.out.println((int)character);
        int initCharNum = (int)character;
        char endChar = 'C';
        int endCharNum = (int)endChar;
        for(int i=0;i<=(endCharNum - initCharNum);i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(initCharNum + j) + " ");
            }
            System.out.println("");
        }
        int m = 7;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(i == 1 || i == m || j == 1 || j == m) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
