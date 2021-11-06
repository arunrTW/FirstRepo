package com.tryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputStream {
    public static void main(String[] args) throws IOException {
        BufferedReader br= null;
        try {
            System.out.println("Enter something");
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(br.readLine());
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            br.close();
        }
    }
}
