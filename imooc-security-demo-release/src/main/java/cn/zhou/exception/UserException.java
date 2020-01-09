package cn.zhou.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class UserException extends RuntimeException {

    @Getter
    @Setter
    private String id;

    public UserException(String message){
        super(message);
    }

}

