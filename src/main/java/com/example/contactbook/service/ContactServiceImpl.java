//package com.example.contactbook.service;
//
//import com.example.contactbook.entity.Contact;
//import com.example.contactbook.repository.ContactRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;

//@Service
//public class ContactServiceImpl  implements ContactService{
//    @Autowired
//    ContactRepository contactRepository;


//    @Override
//    public List<Contact> getAllContact() {
//        return contactRepository.findByOrderByNameAsc() ;
//    }
//
//    @Override
//    public void saveContact(Contact contact) {
//        this.contactRepository.save(contact);
//    }
//
//    @Override
//    public Contact getContactById(long id) {
//        Optional<Contact> optional = contactRepository.findById(id);
//        Contact contact = null;
//        if(optional.isPresent()){
//            contact = optional.get();
//        }else{
//            throw new RuntimeException("Contact not found for id ::" +id);
//        }
//        return contact;
//    }
//
//    @Override
//    public void deleteContactById(long id) {
//        this.contactRepository.deleteById(id);
//    }
//
//}
