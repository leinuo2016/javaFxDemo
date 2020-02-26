package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Create by leinuo on 19-9-2 上午9:35
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
@Service
public class  UserService extends BaseService<User,Long>{
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        super.setBaseRepository(userRepository);
    }

    public User findByName(String name) {
        List<User> users = userRepository.findByNameEquals(name);
        Optional<User> userOptional = users.stream().findFirst();
        if(userOptional.isPresent()){
            return userOptional.get();
        }
        return null;
    }
}
