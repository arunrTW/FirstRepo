package com.junitbasics.test;

import com.junitbasics.main.ContactMain;
import com.junitbasics.main.ContactManager;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ContactManagerTest {

    ContactManager contact;

    @BeforeEach
    public void setup() {
        contact = new ContactManager();
    }

    @Test
    public void shouldCreateContact() {
        ContactManager contact = new ContactManager();
        contact.addContact("ArunR", "Rajachandar", "9629983177");
        Assertions.assertFalse(contact.getAllContacts().isEmpty(), "Contact is present");
        Assertions.assertEquals(1,contact.getAllContacts().size());

        Assertions.assertTrue(contact.getAllContacts().stream().filter(cont -> cont.getFirstName().equals("ArunR")
                && cont.getLastName().equals("Rajachandar")
                && cont.getPhoneNumber().equals("9629983177")).findAny().isPresent());

    }

    @Test
    @DisplayName("Should not create contact when First Name is null")
    public void shouldCaptureRunTimeExceptionWhenFirstNameIsNull() {
        Assertions.assertThrows(RuntimeException.class,
                ()-> {contact.addContact(null, "Rajachandar", "9629983177");});
    }

    @Test
    @DisplayName("Should not create contact when Phone Number is null")
    public void shouldCaptureRunTimeExceptionWhenPhoneNumberIsNull() {
        Assertions.assertThrows(RuntimeException.class,
                ()-> {contact.addContact("ArunR", "Rajachandar", null);});
    }

    @ParameterizedTest
    @DisplayName("Should not create contact when variety of Phone Number validations")
    @ValueSource(strings = {"9629983177", "1234567890", "1231230987"})
    public void doesPhoneNumberFormatsTicked(String phoneNum) {
        Assertions.assertDoesNotThrow(
                ()-> {contact.addContact("ArunR", "Rajachandar", phoneNum);});
    }

    @DisplayName("Repeat Contact Creation Test 5 Times")
    @RepeatedTest(value = 5, name ="repetition {currentRepetition} of {totalRepetitions}")
    public void shouldCreateContactRepeat() {
        contact.addContact("ArunR", "Rajachandar", "9629983177");
        Assertions.assertFalse(contact.getAllContacts().isEmpty(), "Contact is present");
        Assertions.assertEquals(1,contact.getAllContacts().size());
    }
}
