package com.test.service;

import com.test.model.Contact;
import com.test.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository repository;

    @Override
    public List<Contact> getAllSorted(String nameFilter) {
        return repository.getAllSorted(nameFilter);
    }

    @Override
    public List<Contact> getAll() {
        return repository.getAll();
    }
}
