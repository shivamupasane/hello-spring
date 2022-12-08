package com.ltp.hellospring.service;


import com.ltp.hellospring.pojo.Contact;

public interface ContactService {
    Contact getContactById(String id);
    void saveContact(Contact contact);
}
