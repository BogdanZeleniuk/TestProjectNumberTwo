package com.test.repository;

import com.test.model.Contact;

import java.util.List;

public interface ContactRepository {

    List<Contact> getAllSorted(String nameFilter);

    List<Contact> getAll();
}
