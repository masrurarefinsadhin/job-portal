package com.sadhin.jobportal.jobportal.Service;


import com.sadhin.jobportal.jobportal.Entity.UserEntity;
import com.sadhin.jobportal.jobportal.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean save(UserEntity userEntity) {
        try {
            userRepository.save(userEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public UserEntity findByEmailAndPassword(String email, String password) {
        return userRepository.findByPrimaryEmailAndPassword(email, password).orElse(null);
    }
}
