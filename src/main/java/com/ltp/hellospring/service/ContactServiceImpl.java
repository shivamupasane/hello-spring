package com.ltp.hellospring.service;

import com.ltp.hellospring.pojo.Contact;
import com.ltp.hellospring.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class ContactServiceImpl implements ContactService{
   @Autowired
    private ContactRepository contactRepository;
    @Override
    public Contact getContactById(String id){
            return contactRepository.getContact(findIndexById(id));
   }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.saveContact(contact);
    }

    private int findIndexById(String id){
      return IntStream.range(0, contactRepository.getContacts().size()).filter(index -> contactRepository.getContacts().get(index).getId().equals(id)).findFirst().orElseThrow();
   }
}
