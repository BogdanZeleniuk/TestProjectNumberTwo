package com.test;

import com.test.model.Contact;

import java.util.Arrays;
import java.util.List;

public class ContactTestData {

    public static final Contact CONTACT1 = new Contact(50, "Bill");
    public static final Contact CONTACT2 = new Contact(51, "David");
    public static final Contact CONTACT3 = new Contact(52, "Michel");
    public static final Contact CONTACT4 = new Contact(53, "Steve");
    public static final Contact CONTACT5 = new Contact(54, "Joy");
    public static final Contact CONTACT6 = new Contact(55, "Jimmy");
    public static final Contact CONTACT7 = new Contact(56, "Nicolas");
    public static final Contact CONTACT8 = new Contact(57, "Ivan");
    public static final Contact CONTACT9 = new Contact(58, "Anna");
    public static final Contact CONTACT10 = new Contact(59, "David");
    public static final Contact CONTACT11 = new Contact(60, "Ivan");
    public static final Contact CONTACT12 = new Contact(61, "Bobbie");
    public static final Contact CONTACT13 = new Contact(62, "Dilan");
    public static final Contact CONTACT14 = new Contact(63, "Anabel");
    public static final Contact CONTACT15 = new Contact(64, "Jack");
    public static final Contact CONTACT16 = new Contact(65, "Tim");
    public static final Contact CONTACT17 = new Contact(66, "Mark");
    public static final Contact CONTACT18 = new Contact(67, "Susanne");
    public static final Contact CONTACT19 = new Contact(68, "Steve");
    public static final Contact CONTACT20 = new Contact(69, "Mary");
    public static final Contact CONTACT21 = new Contact(70, "Brad");
    public static final Contact CONTACT22 = new Contact(71, "Antony");
    public static final Contact CONTACT23 = new Contact(72, "Donna");
    public static final Contact CONTACT24 = new Contact(73, "Alessandro");
    public static final Contact CONTACT25 = new Contact(74, "Ivan");

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
