package com.example.contactbook.controller;

import com.example.contactbook.entity.Contact;
import com.example.contactbook.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//import com.example.contactbook.service.ContactService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/")
    @RestController
    public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    //get all contacts
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    // create contact rest api
    @PostMapping("/addnew")
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @GetMapping("/contacts/{id}")
    public Contact getContactId(@PathVariable  (value = "id") long id) {
        Optional<Contact> optional = contactRepository.findById(id);
        Contact contact = null;
        if(optional.isPresent()){
            contact = optional.get();
        }else{
            throw new RuntimeException("Contact not found for id ::" +id);
        }
        return contact;
    }

    @PutMapping("/updateContact/{id}")
    public Contact updateContact(@PathVariable (value="id") long id, @RequestBody Contact contact) {
        Contact recontact = contactRepository.findById(id).get();
        recontact.setName(contact.getName());
        recontact.setType(contact.getType());
        recontact.setNumber(contact.getNumber());

        return contactRepository.save(recontact);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContact(@PathVariable (value="id") long id){
        Contact recontact = contactRepository.findById(id).get();
         contactRepository.delete(recontact);

    }
    @GetMapping("/contactsbyname/{name}")
      public List<Contact> searchBar(@PathVariable String name){
        System.out.println(contactRepository.searchBar(name));
            return contactRepository.searchBar(name);
        }

}

   
