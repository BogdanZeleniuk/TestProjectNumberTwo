package com.test.repository;

import com.test.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProxyContactRepository extends JpaRepository<Contact, Integer>{

    @Override
    List<Contact> findAll();
}
