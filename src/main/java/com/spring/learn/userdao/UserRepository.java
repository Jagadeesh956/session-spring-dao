package com.spring.learn.userdao;


public interface UserRepository {

    long saveUser(long Id);
    User getUserById(long Id);

}
