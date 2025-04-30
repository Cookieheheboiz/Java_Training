package com.vti.entity;

public class MyMap<K, V> {
    private K key;
    private V value;

    public MyMap(K key_, V value_) {
        this.key = key_;
        this.value = value_;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}
