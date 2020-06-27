package com.facetemperature.admin.dao;

import com.facetemperature.admin.model.Event;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class EventDao {
    private final LinkedList<Event> events = new LinkedList<>();
    AtomicInteger nextNo = new AtomicInteger(1);

    public void add(Event event) {
        event.setNo(nextNo.getAndIncrement());
        events.addFirst(event);
    }

    public List<Event> get(int size) {
        return events.subList(0, Math.min(events.size(), size));
    }

    public List<Event> get(String userId, int size) {
        List<Event> ret = new ArrayList<>();
        int count = 0;
        for (Event event : events) {
            if (event.getUser().getId().equals(userId)) {
                ret.add(event);
                count++;
                if (count == size) {
                    break;
                }
            }
        }
        return ret;
    }

    public List<Event> all() {
        return events;
    }
}
