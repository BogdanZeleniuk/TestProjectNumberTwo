package com.test;

import com.test.model.Contact;

import java.util.Arrays;
import java.util.List;

public class ContactTestData {

    private static final Contact CONTACT1 = new Contact(1, "Bill");
    private static final Contact CONTACT2 = new Contact(2, "David");
    private static final Contact CONTACT3 = new Contact(3, "Michel");
    private static final Contact CONTACT4 = new Contact(4, "Steve");
    private static final Contact CONTACT5 = new Contact(5, "Joy");
    private static final Contact CONTACT6 = new Contact(6, "Jimmy");
    private static final Contact CONTACT7 = new Contact(7, "Nicolas");
    private static final Contact CONTACT8 = new Contact(8, "Ivan");
    private static final Contact CONTACT9 = new Contact(9, "Anna");
    private static final Contact CONTACT10 = new Contact(10, "David");
    private static final Contact CONTACT11 = new Contact(11, "Ivan");
    private static final Contact CONTACT12 = new Contact(12, "Bobbie");
    private static final Contact CONTACT13 = new Contact(13, "Dilan");
    private static final Contact CONTACT14 = new Contact(14, "Anabel");
    private static final Contact CONTACT15 = new Contact(15, "Jack");
    private static final Contact CONTACT16 = new Contact(16, "Tim");
    private static final Contact CONTACT17 = new Contact(17, "Mark");
    private static final Contact CONTACT18 = new Contact(18, "Susanne");
    private static final Contact CONTACT19 = new Contact(19, "Steve");
    private static final Contact CONTACT20 = new Contact(20, "Mary");
    private static final Contact CONTACT21 = new Contact(21, "Brad");
    private static final Contact CONTACT22 = new Contact(22, "Antony");
    private static final Contact CONTACT23 = new Contact(23, "Donna");
    private static final Contact CONTACT24 = new Contact(24, "Alessandro");
    private static final Contact CONTACT25 = new Contact(25, "Ivan");

    public static final List<Contact> CONTACTS = Arrays.asList(CONTACT1, CONTACT2, CONTACT3, CONTACT4,
            CONTACT5,CONTACT6, CONTACT7, CONTACT8, CONTACT9, CONTACT10, CONTACT11, CONTACT12, CONTACT13, CONTACT14,
            CONTACT15, CONTACT16, CONTACT17, CONTACT18, CONTACT19, CONTACT20, CONTACT21, CONTACT22, CONTACT23, CONTACT24, CONTACT25);

    public static final List<Contact> CONTACTS_WITHOUT_FIRST_A = Arrays.asList(CONTACT1, CONTACT2, CONTACT3, CONTACT4,
            CONTACT5,CONTACT6, CONTACT7, CONTACT8, CONTACT10, CONTACT11, CONTACT12, CONTACT13, CONTACT15, CONTACT16,
            CONTACT17, CONTACT18, CONTACT19, CONTACT20, CONTACT21, CONTACT23, CONTACT25);

    public static final List<Contact> CONTACTS_WITHOUT_FIRST_AEI = Arrays.asList(CONTACT5, CONTACT22);

    public static final List<Contact> CONTACTS_WITH_EXCEEDED = Arrays.asList(CONTACT1, CONTACT3, CONTACT4,
            CONTACT5,CONTACT6, CONTACT12, CONTACT16, CONTACT19, CONTACT22);
}
