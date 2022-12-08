package com.ltp.hellospring.controller;

import com.ltp.hellospring.pojo.Contact;
import com.ltp.hellospring.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {
  @Autowired
  private ContactService contactService;

  @GetMapping("/contact/{id}")
    public ResponseEntity<Contact> getContact(@PathVariable String id){
      Contact contact = contactService.getContactById(id);
      return new ResponseEntity<>(contact, HttpStatus.OK);
  }

  @PostMapping("/contact")
    public ResponseEntity<HttpStatus> createContact(@RequestBody Contact contact){
        contactService.saveContact(contact);
        return new ResponseEntity<>(HttpStatus.CREATED);
  }


}
