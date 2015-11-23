package com.example.ali.loginregister;

/**
 * Created by zhangshuzhe on 11/16/15.
 */
public class Book {
    private String owner_name;
    private String title;
    private String author;
    private String description;
    private String price;
    private String owner_Email;
    private String owner_Phone;

    public Book(String Owner_name,String Title,String Author,String Description,String Price,String Owner_Email,String Owner_Phone) {
        owner_name = Owner_name;
        title = Title;
        author = Author;
        description = Description;
        price = Price;
        owner_Email = Owner_Email;
        owner_Phone = Owner_Phone;
    }

    public boolean addBook(){
        DatabaseManager DbMan = DatabaseManager.getInstance();
        DbMan.addBook(owner_name,title,author,description,price,owner_Email,owner_Phone);
        return true;
    }

}