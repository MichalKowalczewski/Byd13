package com.sda.przyklad2;

public enum Role {
    ADMIN,
    SALES_MANAGER,
    CLERK,
    CLIENT;

    void isAdmin(){
        System.out.println("Zalogowano jako admin");
    }
}
