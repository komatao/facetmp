package com.facetemperature.admin.dao;

import com.facetemperature.admin.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserDao {
    private final List<User> users = new ArrayList<>();

    public void add(User user) {
        if (users.stream().anyMatch(user1 -> user1.getId().equals(user.getId()))) {
            return;
        }
        users.add(user);
    }

    public Optional<User> get(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public List<User> all() {
        return users;
    }

    public List<User> search(String key) {
        return users.stream().filter(user -> user.getName().contains(key)).collect(Collectors.toList());
    }

    public List<User> search(long created) {
        return users.stream().filter(user -> user.getCreated() > created).collect(Collectors.toList());
    }

    public void delete(String id) {
        Optional<User> userOptional = users.stream().filter(user -> user.getId().equals(id)).findFirst();
        userOptional.ifPresent(user -> users.remove(user));
    }
}
