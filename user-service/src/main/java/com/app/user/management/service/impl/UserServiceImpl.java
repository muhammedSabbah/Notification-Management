package com.app.user.management.service.impl;

import com.app.user.management.dto.mapper.UserMapper;
import com.app.user.management.dto.model.User;
import com.app.user.management.entity.BusinessUser;
import com.app.user.management.entity.Role;
import com.app.user.management.repo.RoleRepository;
import com.app.user.management.repo.UserRepository;
import com.app.user.management.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final UserMapper userMapper;
    @Override
    public String createUser(User user) {
        if (userRepository.existsByFirstNameAndLastName(user.getFirstName(), user.getLastName())) {
            throw new RuntimeException("User already exists");
        }
        Role role = roleRepository.findByCode(user.getRoleCode()).orElseThrow(() -> new RuntimeException("Role not found"));
        BusinessUser businessUser = userMapper.toBusinessUser(user);
        businessUser.setBusinessUserId(UUID.randomUUID());
        businessUser.setCreatedAt(ZonedDateTime.now());
        businessUser.setRole(role);
        BusinessUser saved = userRepository.save(businessUser);
        return saved.getBusinessUserId().toString();
    }

    @Override
    public User getUser(String id) {
        return userRepository.findByBusinessUserId(UUID.fromString(id))
                .map(userMapper::toUser)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getUsers(Pageable pageable) {
        Page<BusinessUser> all = userRepository.findAll(pageable);
        return all.map(userMapper::toUser).toList();
    }
}
