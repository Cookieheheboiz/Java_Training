package com.vti.entity;

public class Phone<K, V> extends MyMap<K, V> {

    public Phone(K key_, V value_) {
        super(key_, value_);
    }

    public V getPhoneNumber() {
        return getValue();
    }

}
