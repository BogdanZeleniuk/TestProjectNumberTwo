package com.test.repository;

import com.test.exception.NotFoundException;
import com.test.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;

@Repository
public class ContactRepositoryImpl implements ContactRepository{

    private static final Logger LOG = LoggerFactory.getLogger(ContactRepositoryImpl.class);

    @Autowired
    private ProxyContactRepository proxyContactRepository;

    private Pattern regexPattern;

    @Override
    public List<Contact> getAllSorted(String nameFilter) {
        List<Contact> listOfAllContacts = new CopyOnWriteArrayList<>();
        try {
            regexPattern = Pattern.compile(nameFilter);
            if (!nameFilter.isEmpty() || nameFilter.length() != 0) {
                listOfAllContacts.addAll(getAll().stream().filter(contact -> notDoMatch(contact.getName())).collect(Collectors.toList()));
            } else {
                LOG.warn("Regex parameter " + "'" + nameFilter + "'" + " is empty");
                throw new NotFoundException("Regex parameter is empty");
            }
            return listOfAllContacts;
        }
        catch (PatternSyntaxException exception){
            LOG.error("Regex parameter " + "'" + nameFilter + "'" + " is invalid");
            throw new NotFoundException("Regex parameter is invalid");
        }
    }

    @Override
    public List<Contact> getAll() {
        return proxyContactRepository.findAll();
    }

    private boolean notDoMatch(String word){
        Matcher matcher = regexPattern.matcher(word);
        return !matcher.matches();
    }
}
