package com.vti.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    protected List<Contact> contacts = new ArrayList<>();

    public void insertContact(String name, String phone) {}
    public void removeContact(String name) {}
    public void updateContact(String name, String newPhone) {}
    public void searchContact(String name) {}
}
