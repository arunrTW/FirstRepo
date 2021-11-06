package com.junitbasics.main;


import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager extends ContactValidations {
    Map<String, Contact> contactList = new ConcurrentHashMap<>();

    public void addContact(String firstName, String lastName, String phoneNumber) {
        Contact c = new Contact(firstName, lastName, phoneNumber);
        validateContact(c);
        doesContactExist(c);
            contactList.put(generateKey(c), c);
    }

    public Collection<Contact> getAllContacts() {
        return contactList.values();
    }
    private void doesContactExist(Contact contact) {
        if(contactList.containsKey(generateKey(contact)))
            throw new RuntimeException("Contact already exists");
    }

    private void validateContact(Contact contact) {
        nameCheck(contact.getFirstName());
        nameCheck(contact.getLastName());
        phoneNumberCheck(contact.getPhoneNumber());
    }

    private String generateKey(Contact contact) {
        return String.format("%s-%s", contact.getFirstName(),contact.getLastName());
    }
}