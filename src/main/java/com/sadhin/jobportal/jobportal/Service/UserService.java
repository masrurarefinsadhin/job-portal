package com.sadhin.jobportal.jobportal.Service;

import com.sadhin.jobportal.jobportal.Entity.UserEntity;

public interface UserService {
    boolean save(UserEntity userEntity);

    UserEntity findByEmailAndPassword(String email, String password);

}
