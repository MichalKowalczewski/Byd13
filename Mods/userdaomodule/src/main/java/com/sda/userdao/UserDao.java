package com.sda.userdao;

import com.sda.dao.Dao;
import com.sda.entity.User;

import java.util.*;

public class UserDao implements Dao<User> {

    private final Map<Integer, User> users;

    public UserDao() {
        this.users = new HashMap<>();
        users.put(1,new User("Anna"));
        users.put(2, new User("Jan"));
        users.put(3, new User("Danuta"));
    }



    @Override
    public Optional<User> findById(int id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}
