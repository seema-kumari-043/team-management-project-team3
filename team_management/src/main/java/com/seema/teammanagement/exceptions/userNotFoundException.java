package com.seema.teammanagement.exceptions;

public class userNotFoundException extends RuntimeException {

    public userNotFoundException(String message){
        super(message);
    }
}
