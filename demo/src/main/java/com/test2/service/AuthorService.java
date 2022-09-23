package com.test2.service;

import com.test2.model.Author;
import com.test2.repository.AuthorRepository;

public class AuthorService {

    public static void create(Author author){
        AuthorRepository.createAuthor(author);   
    }
    
    public static Author findByFirstnameLastname(Author author){
        AuthorRepository.findByFirstnameLastname(Author author);
    }
}
