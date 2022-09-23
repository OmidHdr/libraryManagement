package com.example.configure;

import java.sql.Connection;
import java.sql.Statement;

import com.test2.Config.Database;

public class Config {
    public static void createTable(){
        // final String queryBuildDatabase = "CREATE DATABASE bookstore if not exist";
        final String queryBuildTableUser = "CREATE TABLE if not exists users( user_id serial UNIQUE PRIMARY KEY , username VARCHAR(30) not null unique , national_code VARCHAR(11) unique, birthday DATE, user_pass varchar(50) );";
        final String queryBuildTableArticle = "CREATE TABLE IF NOT EXISTS article( article_id serial UNIQUE , title varchar(30) , brief varchar(50), article_content varchar(100), CREATE_date date , is_published bool, user_id int , FOREIGN KEY (user_id) REFERENCES users(user_id) );";
        try {
            Connection connection = Database.getConnection();
            if(connection != null){
                Statement st = connection.createStatement();
                st.addBatch(queryBuildTableUser);
                st.addBatch(queryBuildTableArticle);
                st.executeBatch();
                st.close();
                System.out.println("Table created ... ");   
            }
        } catch (Exception e) {
            System.out.println("Can't create tables");
        }
    }
    
}
