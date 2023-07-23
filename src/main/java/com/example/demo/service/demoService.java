package com.example.demo.service;

import java.util.List;
// import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import com.example.demo.MODEL.User;
import com.example.demo.Repository.demoRepository;

@Service
public class demoService {

    @Autowired
    demoRepository repo;

    public void Add(User user){
       repo.save(user);
    }

    public List<User> show(){
       return repo.findAll(); 
    }

    public void deleteById(Integer id) {
        repo.deleteById(id);
    }

    public User getById(Integer id) {
        Optional<User> table = repo.findById(id);
        if(table.isPresent()){
            return table.get();
        }
        else{
            return null;
        }
        
    }

       
}
