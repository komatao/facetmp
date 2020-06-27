package com.facetemperature.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/idreg/v1")
@RestController
public class DeviceController {
    private static final Logger log = LoggerFactory.getLogger(DeviceController.class);

    @PostMapping("/record/temperatures")
    public Map postTempeture(@RequestBody Map body) {
        log.info("body {}", body);
        Map<String, String> response = new HashMap<>();
        response.put("code", "0");
        response.put("message", "succeed");

        return response;
    }

    @PostMapping("/site/syncSettings")
    public Map syncStaffs(@RequestBody Map body) {
        log.info("body {}", body);

        Map<String, Object> response = new HashMap<>();
        response.put("code", "0");
        response.put("message", "succeed");
        Map<String, String> data = new HashMap<>();
        data.put("dataUpload", "1");
        List<Map> list = new ArrayList<>();
        list.add(data);
        response.put("data", list);
        log.info("response {}", response);
        return response;
    }
}
