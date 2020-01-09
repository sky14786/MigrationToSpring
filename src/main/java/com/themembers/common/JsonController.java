package com.themembers.common;

import com.google.gson.*;

public class JsonController{
    public String BeanToJson(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

}