package com.test2.model;

public class Book {
    private long id;
private String title;
private Author author;
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}

public Author getAuthor() {
    return author;
}
public void setAuthor(Author author) {
    this.author = author;
}
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
    
}
