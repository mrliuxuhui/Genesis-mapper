package com.flyingwillow.genesis.mapper.entity;

import java.util.HashMap;
import java.util.Map;

public final class BaseEntity extends HashMap<String, Object> {

    public BaseEntity(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public BaseEntity(int initialCapacity) {
        super(initialCapacity);
    }

    public BaseEntity() {
    }

    public BaseEntity(Map<? extends String, ?> m) {
        super(m);
    }

    public Object set(String key, Object value){
        return put(key, value);
    }
}