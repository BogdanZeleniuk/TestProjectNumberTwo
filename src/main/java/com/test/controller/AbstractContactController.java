package com.test.controller;

import com.test.model.Contact;
import com.test.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractContactController {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractContactController.class);

    @Autowired
    ContactService service;

    public List<Contact> getAllSorted(String nameFilter){
        LOG.debug("Regex parameter is " + "'" + nameFilter + "'");
        return service.getAllSorted(nameFilter);
    }
    public List<Contact> getAll(){
        LOG.debug("getAll() for startPage");
        return service.getAll();
    }
}
