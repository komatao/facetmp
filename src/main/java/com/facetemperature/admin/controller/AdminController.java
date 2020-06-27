package com.facetemperature.admin.controller;

import com.facetemperature.admin.dao.EventDao;
import com.facetemperature.admin.dao.UserDao;
import com.facetemperature.admin.model.Event;
import com.facetemperature.admin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/v1")
public class AdminController {

    @Autowired
    UserDao userDao;

    @Autowired
    EventDao eventDao;

    @GetMapping("/users")
    public List<User> users() {
        return userDao.all();
    }

    @GetMapping("/events")
    public List<Event> events() {
        return eventDao.all();
    }
}
