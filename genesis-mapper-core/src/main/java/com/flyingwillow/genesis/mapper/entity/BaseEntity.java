package com.flyingwillow.genesis.mapper.entity;

import java.util.HashMap;

public class BaseEntity extends HashMap<String, Object> {

    public Object set(String key, Object value){
        return put(key, value);
    }
}