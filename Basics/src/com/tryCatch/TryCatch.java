package com.tryCatch;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int arr[] = new int[4];
            arr[3] = 6;
            int i = 3;
            int j = 2;
            double k = (double)j/i;
            System.out.println(k);
            throw new OwnException("Yes");

        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit...");
        } catch (OwnException e) {
            System.out.println(e.getMessage());
        }
          catch(Exception e) {
            System.out.println("Something went wrong");
          } finally {
            System.out.println("Finally");
        }
    }
}
