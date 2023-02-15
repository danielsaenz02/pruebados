package com.example.demo2.service;

import com.example.demo2.entity.User;
import com.example.demo2.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUserRepository iUserRepository;

    public List<User> getAll(){
        return iUserRepository.findAll();
    }

    public User save(User user){
        return iUserRepository.save(user);
    }

    public User findById(Long id){
        return iUserRepository.findById(id).orElse(null);
    }

    public Optional<User> findByEmail (String email){ return iUserRepository.findByEmail(email);}
}
