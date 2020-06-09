package com.solvd.mavenUberCarService.myBatis.models;

public class User {
    private Long id;
    private int userID;
    private String userName;
    private String userEmail;
    private int userContact;

    public User(Long id, int userID, String userName, String userEmail, int userContact) {
        this.id = id;
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userContact = userContact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUserContact() {
        return userContact;
    }

    public void setUserContact(int userContact) {
        this.userContact = userContact;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
