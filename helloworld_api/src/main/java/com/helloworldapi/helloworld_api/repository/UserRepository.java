package com.helloworldapi.helloworld_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helloworldapi.helloworld_api.Entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
