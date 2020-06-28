package com.facetemperature.admin.dao;

import com.facetemperature.admin.model.Event;
import org.springframework.stereotype.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// @Repository
public interface EventDao {

    int insert(Event event);

    //
    // private static final Logger log = LoggerFactory.getLogger(EventDao.class);
    //
    // private final LinkedList<Event> events = new LinkedList<>();
    // AtomicInteger nextNo = new AtomicInteger(1);
    //
    // public void add(Event event) {
    //     event.setNo(nextNo.getAndIncrement());
    //     events.addFirst(event);
    // }
    //
    // public boolean has(Event event) {
    //     return events.stream().anyMatch(event1 -> event1.equal(event));
    // }
    //
    // public List<Event> get(int size) {
    //     return events.subList(0, Math.min(events.size(), size));
    // }
    //
    // public List<Event> get(String userId, int size) {
    //     List<Event> ret = new ArrayList<>();
    //     int count = 0;
    //     for (Event event : events) {
    //         if (event.getUser().getId().equals(userId)) {
    //             ret.add(event);
    //             count++;
    //             if (count == size) {
    //                 break;
    //             }
    //         }
    //     }
    //     return ret;
    // }
    //
    // public List<Event> get(long createdBegin, long createdEnd, int size) {
    //     List<Event> ret = new ArrayList<>();
    //     int count = 0;
    //     for (Event event : events) {
    //         try {
    //             SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //             long createTime = simpleDateFormat.parse(event.getCreated()).getTime();
    //
    //             log.info("createTime {}", createTime);
    //             if (createTime >= createdBegin && createTime < createdEnd) {
    //                 ret.add(event);
    //                 count++;
    //                 if (count == size) {
    //                     break;
    //                 }
    //             }
    //         } catch (ParseException e) {
    //             log.error("parse excpetion {}", e);
    //
    //         }
    //
    //
    //     }
    //     return ret;
    // }
    //
    // public List<Event> all() {
    //     return events;
    // }
}
