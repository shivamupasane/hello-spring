package com.ltp.hellospring.repository;

import com.ltp.hellospring.pojo.Contact;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ContactRepository {
    private List<Contact> contacts = new ArrayList<>();

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    public Contact getContact(int index){
        return contacts.get(index);
    }
    public void saveContact(Contact contact){
        contacts.add(contact);
    }
}
