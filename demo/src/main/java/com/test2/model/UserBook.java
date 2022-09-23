package com.test2.model;

public class UserBook {
    private Book book;
    private User user;
    private Admin admin;
    private Long date;

    
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Admin getAdmin() {
        return admin;
    }
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public Long getDate() {
        return date;
    }
    public void setDate(Long date) {
        this.date = date;
    }
    
    
}
