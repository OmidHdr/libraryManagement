package com.test2;

import java.time.ZonedDateTime;

import com.test2.model.Author;
import com.test2.repository.AuthorRepository;
import com.test2.service.AuthorService;

public class App 
{
    public static void main( String[] args )
    {
        Author author = new Author("omid","heidary",ZonedDateTime.now().toEpochSecond());
        // AuthorService.create(author);
        Author result = AuthorRepository.findByFirstnameLastname(author);
        System.out.println(result.getId());
    }
}
