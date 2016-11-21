package com.test.service;

import com.test.model.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getAllSorted(String nameFilter);

    List<Contact> getAll();
}
