package com.xwk.demo.controller;


import com.xwk.demo.pojo.User;
import com.xwk.demo.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("findOne/{id}")
    @ApiOperation(value = "id的信息",notes = "感觉id的")
    @ApiImplicitParam(name = "id",value = "用户的id",required = true,dataType ="int" )
    public User findone(@PathVariable("id") Integer id){

        return new User(id,"xxx"+id);
    }

    @RequestMapping("/getAll")
    public List<User> getAll(){
        List<User> list=new ArrayList<>();
        User user1=new User(111,"qwqw");
        User user2=new User(111,"qwqw");
        User user3=new User(111,"qwqw");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }

    @RequestMapping("/getUser/{name}")
    @ApiOperation(value = "id的信息",notes = "感觉id的")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户的id",required = true,dataType ="int" ),
            @ApiImplicitParam(name = "name",value = "名字",required = true,dataType = "String")
    })
    public User getUser(@RequestParam(name = "id") Integer id,
    @PathVariable(name="name") String name){
        User user=new User(id,name);
       return user;

    }

    @RequestMapping("user")
    public List<User> getUser(){
        return userService.getUserList();
    }


}
