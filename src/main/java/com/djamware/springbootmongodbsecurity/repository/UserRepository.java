package com.djamware.springbootmongodbsecurity.repository;
import  com.springauth.springsecurityauth.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User, String> {

    User findByEmail(String email);

 

}
