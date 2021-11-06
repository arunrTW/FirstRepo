package com.collectionsTryout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> lv = new ArrayList<>();

        lv.add(404);
        lv.add(503);
        lv.add(208);


        Collections.sort(lv, (o1, o2) -> o1%10 > o2%10 ? 1 : -1);
        for(Integer ele: lv) {
            System.out.println(ele);
        }
    }
}
