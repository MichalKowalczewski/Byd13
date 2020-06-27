package com.sda.main;

import com.sda.dao.Dao;
import com.sda.userdao.UserDao;

//https://www.baeldung.com/maven-multi-module-project-java-jpms
//https://www.baeldung.com/java-9-modularity

public class Application {
    public static void main(String[] args) {
        Dao userDao = new UserDao();
        userDao.findAll().forEach(System.out::println);
    }
}
