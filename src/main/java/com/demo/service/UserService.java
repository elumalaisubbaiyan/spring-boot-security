package com.demo.service;

import com.demo.exception.UserNotFoundException;
import com.demo.model.UserRecord;
import com.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserRecord getUserById(int id) {
        UserRecord userRecord = userRepository.findById(id);
        if (userRecord == null) {
            throw new UserNotFoundException("Unable to find user record with id " + id);
        }
        return userRecord;
    }

    public List<UserRecord> getAllUsers() {
        List<UserRecord> userRecords = new ArrayList<>();
        userRepository.findAll().forEach(userRecords::add);
        return userRecords;
    }

    public void addUser(UserRecord userRecord) {
        userRepository.save(userRecord);
    }

    public void updateUser(int id, UserRecord userRecord) {
        UserRecord existingUser = userRepository.findById(id);
        if (existingUser != null) {
            existingUser.setEmail(userRecord.getEmail());
            userRepository.save(existingUser);
        } else {
            throw new UserNotFoundException("Unable to find user record with id " + id);
        }
    }

}