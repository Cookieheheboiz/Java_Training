package com.vti.entity;

public class VietnamesePhone extends Phone{
    public void insertContact(String name, String phone) {
            contacts.add(new Contact(name, phone));

    }

    public void removeContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                contacts.remove(i);
            }
        }
    }

    public void updateContact(String name, String newPhone) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.setPhoneNumber(newPhone);
            }
        }
    }

    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Ten danh ba: " + contact.getName() + ", SDT: " + contact.getPhoneNumber());
                return;
            }
        }
        System.out.println("Khong tim thay ten: " + name);
    }


}
