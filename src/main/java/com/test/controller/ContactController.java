package com.test.controller;

import com.test.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController extends AbstractContactController{

    @RequestMapping(method = RequestMethod.GET, params = "nameFilter")
    @ResponseBody
    public List<Contact> getSortedPage(@RequestParam("nameFilter") String nameFilter){
        return super.getAllSorted(nameFilter);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Contact> getAllPage(){
        return super.getAll();
    }
}
