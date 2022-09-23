package com.test2.service;

import com.test2.model.Author;
import com.test2.model.BasePerson;
import com.test2.model.Book;
import com.test2.model.UserBook;
import com.test2.repository.AuthorRepository;

public class BookService {
    public static boolean createBook(Book book, String firstname , String lastname ){
        Author author = new Author();
        author.setFirstName(firstname);
        author.setLastName(lastname);
        Author result = AuthorRepository.findByFirstnameLastname(author);
        book.setAuthor(result);
        System.out.println("Book created ! ");
        return true;
    }
    
    public static boolean updateBook(Book book){
        System.out.println("Book successfully update !! ");
        return true;
    }

    public static boolean deleteBook(Book book){
        System.out.println("Book deleted successfully");
        return true;
    }

    public static Book findById(int id){
        Book book = new Book();
        return book;
    }

    public static boolean getBook(UserBook userBook){
        System.out.println("User "+userBook.getUser().getCode()+" taked book "+ userBook.getBook().getTitle());
        return true;
    }



}
