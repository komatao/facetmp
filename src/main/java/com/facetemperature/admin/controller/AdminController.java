package com.facetemperature.admin.controller;

import com.facetemperature.admin.dao.EventDao;
import com.facetemperature.admin.dao.UserDao;
import com.facetemperature.admin.model.Event;
import com.facetemperature.admin.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private static final Logger log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    UserDao userDao;

    @Autowired
    EventDao eventDao;

    @GetMapping("/")
    public ModelAndView index() {
        List<Event> eventList = eventDao.get(10);
        return new ModelAndView("index", "events", eventList);
    }

    @GetMapping("/addUser")
    public String addUser() {
        return "addUser";
    }

    @PostMapping("/addUser")
    public String handleMessage(@ModelAttribute("form") AddUserParam param) {
        log.info("{}", param);
        User user = new User(param.getInputName(), param.getInputId());

        List<String> images = new ArrayList<>();
        images.add("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png");
        images.add("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png");
        user.setImgs(images);
        user.setCreated(System.currentTimeMillis());
        userDao.add(user);
        return "redirect:/admin/";
    }
}
