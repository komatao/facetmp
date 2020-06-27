package com.facetemperature.admin.controller;

import com.facetemperature.admin.dao.EventDao;
import com.facetemperature.admin.dao.UserDao;
import com.facetemperature.admin.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UserDao userDao;

    @Autowired
    EventDao eventDao;

    @GetMapping("/")
    public ModelAndView index() {
        List<Event> eventList = eventDao.get(10);
        return new ModelAndView("index", "events", eventList);
    }
}
