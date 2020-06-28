package com.facetemperature.admin.controller;

import com.facetemperature.admin.dao.EventDao;
import com.facetemperature.admin.dao.UserDao;
import com.facetemperature.admin.model.Event;
import com.facetemperature.admin.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@RequestMapping("/idreg/v1")
@RestController
public class IdregController {
    private static final Logger log = LoggerFactory.getLogger(IdregController.class);

    @Autowired
    EventDao eventDao;

    @Autowired
    UserDao userDao;

    @PostMapping("/record/temperatures")
    public Map<String, Object> postTemperatures(@RequestBody TemperatureRequestParams params) {
        log.info("body {}", params.toString());

        params.getData().forEach(param ->
                {
                    Event event = new Event();
                    event.setVisitName(param.getVisitName());
                    event.setVisitCode(param.getVisitCode());
                    event.setVisitTime(param.getVisitTime());
                    event.setTemperature(param.getTemperature());
                    eventDao.insert(event);
//                    Optional<User> userOptional = userDao.get(param.getVisitCode());
//                    if (userOptional.isPresent()) {
//                        event.setUser(userOptional.get());
//                    } else {
//                        event.setUser(new User(param.getVisitName(), param.getVisitCode()));
//                    }
//                    event.setTemperature(param.getTemperature());
//                    event.setCreated(param.getVisitTime());
//                    event.setInAndOut(param.getInAndOut());
//
//                    if (!eventDao.has(event)) {
//                        eventDao.add(event);
//                    }
                }

        );

        Map<String, Object> response = new HashMap<>();
        response.put("code", "0");
        response.put("message", "succeed");
        return response;
    }


//    @PostMapping("/staff/syncStaffs")
//    public Map<String, Object> syncStaff(@RequestBody SyncStaffRequest request) {
//        log.info("sync staff: {}", request);
////        List<SyncStaffResponse> staffs = userDao.search(request.getQueryTimestamp()).stream().map(user -> {
////            SyncStaffResponse staff = new SyncStaffResponse();
////
////            staff.setId(user.getId());
////            staff.setStaffCode(user.getId());
////            staff.setStaffName(user.getName());
////            staff.setStaffImgUrl01(user.getImgs().get(0));
////            staff.setStaffImgUrl02(user.getImgs().get(1));
////            staff.setStatus(1);
////            staff.setTimestampStr("" + user.getCreated());
////
////            return staff;
////        }).collect(Collectors.toList());
//
//        Map<String, Object> response = new HashMap<>();
//        response.put("code", "0");
//        response.put("message", "succeed");
////        response.put("data", staffs);
//        response.put("data", new ArrayList<>());
//        return response;
//    }
//
//
//    @PostMapping("/site/syncSettings")
//    public Map<String, Object> syncSettings(@RequestBody Map body) {
//        log.info("body {}", body);
//
//        Map<String, Object> response = new HashMap<>();
//        response.put("code", "0");
//        response.put("message", "succeed");
//        Map<String, String> data = new HashMap<>();
//        // force enable data upload
//        data.put("dataUpload", "1");
//        List<Map<String, String>> list = new ArrayList<>();
//        list.add(data);
//        response.put("data", list);
//        log.info("response {}", response);
//        return response;
//    }
}
