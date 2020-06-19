package com.sda.funkcyjne.przyklad2;

import java.util.function.Supplier;

public class UserDisplayer {

    public void display(Supplier<User> supplier){
        User user = supplier.get();
        System.out.println(user.getFirstName()+" "+user.getLastName());
    }

}
