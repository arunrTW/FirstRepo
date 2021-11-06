package com.junitbasics.main;

public class ContactMain {
    public static void main(String[] args) {
        ContactManager c1 = new ContactManager();
        c1.addContact("ArunRR", "Rajachandar","9629983177");
        c1.addContact("ArunRRR", "Rajachandar","9629983177");
        c1.addContact("ArunRRRR", "Rajachandar","9629983177");

        System.out.println(c1.getAllContacts());
    }
}
