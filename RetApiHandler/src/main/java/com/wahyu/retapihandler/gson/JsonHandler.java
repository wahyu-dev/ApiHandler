package com.wahyu.retapihandler.gson;

import com.google.gson.Gson;

public class JsonHandler {

    public static <T> String toJson(T object){
        return new Gson().toJson(object);
    }

    public static <T>T fromJson(String json, Class<T> object){
        return new Gson().fromJson(json,  object);
    }
}
