package com.skywatchappfinal.skywatch.entities;

import jakarta.persistence.*;


@Entity
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false, updatable = false)
        private Integer id;

        @Column(name = "first_name", nullable = false, length = 30)
        private String firstName;

        @Column(name = "last_name", nullable = false, length = 30)
        private String lastName;


        @Column(name = "user_name", nullable = false, length = 30)
        private String username;

        @Column (nullable = false, length = 64)
        private String password;

        @Column(nullable = false, unique = true, length = 64)
        private String email;

        public User(Integer id, String firstName, String lastName, String email, String username, String password){
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
            this.lastName = lastName;
            this.firstName = firstName;
        }

        public User(){

        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstname) {
            this.firstName = firstname;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastname) {
            this.lastName = lastname;
        }
    }


