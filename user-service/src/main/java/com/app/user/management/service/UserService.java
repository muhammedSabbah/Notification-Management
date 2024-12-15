package com.app.user.management.service;

import com.app.user.management.dto.model.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    String createUser(User user);
    User getUser(String id);

    List<User> getUsers(Pageable pageable);
}
