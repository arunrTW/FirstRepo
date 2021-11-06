package com.collectionsTryout;

import com.javaTryout.Test.Student;

import java.util.*;

class Stud {
    int rollNo;
    String name;
    double salary;

    @Override
    public String toString() {
        return "Stud{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", Salary=" + salary +
                '}';
    }

    public Stud(int rollNo, String name, double salary) {
        this.rollNo = rollNo;
        this.name = name;
        this.salary = salary;
    }
}

public class CollectionObj {
    public static void main(String[] args) {
        //List
        List<Stud> objStudents = new ArrayList<>();
        objStudents.add(new Stud(24,"Arun", 333.3));
        objStudents.add(new Stud(25,"ArunR", 233.3));
        objStudents.add(new Stud(26,"ArunRR", 133.3));
        Collections.sort(objStudents, (i,j) -> i.rollNo > j.rollNo ? 1 : -1);
        for(Stud s: objStudents) {
            System.out.println(s.toString());
        }
        //Sets
        Set<Integer> s1 = new TreeSet<>();
        s1.add(18);
        s1.add(19);
        s1.add(3);
        s1.add(3);
        for(Integer o: s1) {
            System.out.println(o);
        }

        Map<Integer, String> m1 = new HashMap<>();
        m1.put(1,"Arun");
        m1.put(2, "Sriram");
        m1.put(3, "Aniruthya");
        for(Integer s: m1.keySet()) {
            System.out.println(m1.get(s));
        }
    }
}
