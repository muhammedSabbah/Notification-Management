package com.app.user.management.controller;

import com.app.user.management.dto.model.User;
import com.app.user.management.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("v1/user")
@RestController
@AllArgsConstructor
@Validated
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody @Valid User user) {
        String userSystemId = userService.createUser(user);
        return new ResponseEntity<>(userSystemId, HttpStatus.CREATED);
    }

    @GetMapping("/{systemUserId}")
    public ResponseEntity<User> getUser(@PathVariable String systemUserId) {
        User user = userService.getUser(systemUserId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size
    ) {
        PageRequest pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "createdAt"));
        List<User> users = userService.getUsers(pageable);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
