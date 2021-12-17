package com.example.contactbook.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

    @Entity
    @Table(name = "contacts")
    public class Contact {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

//        @NotEmpty(message = "Fill the Full Name area")
        @Column(name = "name")
        private String name;
//        @NotEmpty(message = "Fill the Type area")
        @Column(name = "type")
        private String type;
//        @NotEmpty(message = "Fill the Number area")
        @Column(name = "number")
        private String number;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }


