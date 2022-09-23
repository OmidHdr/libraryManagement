package com.test2.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test2.Config.Database;
import com.test2.model.Author;

public class AuthorRepository {
    private static String queryAddAuthor = "insert into author values(Default,?,?,?);";
    private static String queryFindByFirstnameLastname = "select id from author where first_name = ? and last_name  =  ?;";

    
    public static void createAuthor(Author author){
        try {
            Connection connection = Database.getConnection();
            PreparedStatement statement = connection.prepareStatement(queryAddAuthor);
            statement.setString(1, author.getFirstName());
            statement.setString(2, author.getLastName());
            statement.setLong(3, author.getBirthDay());
            statement.execute();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Something wrong with add author");
        }
    }

    public static Author findByFirstnameLastname(Author author){
        try {
            Connection connection = Database.getConnection();
            PreparedStatement statement = connection.prepareStatement(queryFindByFirstnameLastname);
            statement.setString(1, author.getFirstName());
            statement.setString(2, author.getLastName());
            ResultSet result = statement.executeQuery();
            Author authorReturn = new Author();
            while(result.next()){
                authorReturn.setId(result.getLong("id"));
            }
            statement.close();
            connection.close();
            return authorReturn;
        } catch (Exception e) {
            System.out.println("Something wrong with add author");
            return null;
        }
    }


    
}
