package com.spring.learn.userdao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spring.learn.sessiondao.Session;
import jakarta.persistence.*;

import java.util.List;
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="id")
    private long UserID;

    public User(long userID) {
        UserID = userID;
    }



    public User() {
        UserID = System.currentTimeMillis();
    }


    public long getUserID() {
        return UserID;
    }

    public void setUserID(long userID) {
        this.UserID = userID;
    }


}
