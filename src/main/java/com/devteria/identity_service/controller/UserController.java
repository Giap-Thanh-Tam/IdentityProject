package com.devteria.identity_service.controller;

import com.devteria.identity_service.dto.request.ApiResponse;
import com.devteria.identity_service.dto.request.UserCreationRequest;
import com.devteria.identity_service.dto.request.UserUpdateRequest;
import com.devteria.identity_service.entity.User;
import com.devteria.identity_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request){
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.createUser(request));
        return apiResponse;
    }

    @GetMapping("/users")
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUserById(@PathVariable("userId") String userId){
        return userService.getUserById(userId);
    }

    @PutMapping("/{userId}")
    User UpdateUserById(@PathVariable("userId") String userId, @RequestBody UserUpdateRequest request){
        return userService.UpdateUserById(userId,request);
    }

    @DeleteMapping("/{userId}")
    String DeleteUserById(@PathVariable("userId") String userId){
        userService.DeleteUserById(userId);
        return "User has been deleted";
    };

}
