package cn.zhou.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

//@ControllerAdvice 表示controller发生的一场 又该类处理

@ControllerAdvice
public class ControllerExceptionHandle {

    //表明该异常  又这个方法处理
    @ExceptionHandler(UserException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Map<String,Object> handleException(UserException ex){
        Map<String,Object> map = new HashMap<>();
        map.put("id",ex.getId());
        map.put("msg",ex.getMessage());
        return map;
    }
}
