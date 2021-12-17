package com.example.contactbook.repository;

import com.example.contactbook.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {
//    List<Contact> findContactByName(String name);
    @Query(nativeQuery = true, value = "SELECT * FROM contactbook.contacts WHERE name LIKE %:keyword%")
    List<Contact>searchBar(@Param("keyword") String keyword);
}
