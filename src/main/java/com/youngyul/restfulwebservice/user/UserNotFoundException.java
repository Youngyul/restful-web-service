package com.youngyul.restfulwebservice.user;

// HTTP Status Code error
// 200~299 --> OK
// 400~499 --> Client Error
// 500~599 --> Server Error

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }

}
