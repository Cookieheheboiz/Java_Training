package com.vti.entity;

public class Staff<K, V> extends MyMap<K, V> {
    public Staff(K key_, V value_) {
        super(key_, value_);
    }

    public K getId() {
        return getKey();
    }

    public V getName() {
        return getValue();
    }

}
