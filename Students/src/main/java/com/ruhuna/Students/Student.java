package com.ruhuna.Students;

import java.util.Random;

public class Student {
    private int ID;
    private String name;
    private String email;

    //constructor initialize the value


    public Student(int ID,String name, String email) {
        /*Random random = new Random();
        ID = random.nextInt(0, 100);*/
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

