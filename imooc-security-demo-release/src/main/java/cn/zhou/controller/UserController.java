package cn.zhou.controller;

import cn.zhou.dto.User;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@EnableSwagger2
@RequestMapping
public class UserController {

    @GetMapping("user")
    public List<User> queryUser(){
        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

//    {id:\\d+}  正则表达式  只能数字
    @GetMapping("/user/{id:\\d+}")
    public User getInfo(@PathVariable  @ApiParam("用户id") String id){
        System.out.println(id );
        User user = new User();
        user.setUsername("tom");
        user.setPassword("tom123");
        return user;
    }

//  @valid  @notblank
//    @RequestBody  可以接受json字符串并组装
    @PostMapping
    public User create(@RequestBody @Valid User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().stream().forEach(error -> System.out.println(error.getDefaultMessage()));
        }

        System.out.println(user);
        User user1 = new User();
        user1.setId("1");
        return user1;
    }


    @DeleteMapping("/user/{id}")
    public User delete(@PathVariable String id){
//        throw new UserException("delete");
        User user = new User();
        user.setId("1");
        return user;
    }


}
