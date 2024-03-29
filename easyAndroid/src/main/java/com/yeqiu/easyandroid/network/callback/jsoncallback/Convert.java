/*
 * Copyright 2016 jeasonlzy(廖子尧)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yeqiu.easyandroid.network.callback.jsoncallback;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

import java.io.Reader;
import java.lang.reflect.Type;

/**
 * @project: EasyAndroid
 * @author: 小卷子
 * @date: 2022/4/11
 * @describe:
 * @fix:
 */
public class Convert {

    private static Gson create() {
        return GsonHolder.gson;
    }

    private static class GsonHolder {
        private static Gson gson = new Gson();
    }


    public static <T> T fromJson(JsonReader reader, Type typeOfT) throws JsonIOException,
            JsonSyntaxException {
        return create().fromJson(reader, typeOfT);
    }

    public static <T> T fromJson(String json, Class<T> type) throws JsonIOException,
            JsonSyntaxException {
        return create().fromJson(json, type);
    }

    public static <T> T fromJson(String json, Type type) {
        return create().fromJson(json, type);
    }


    public static <T> T fromJson(Reader json, Class<T> classOfT) throws JsonSyntaxException,
            JsonIOException {
        return create().fromJson(json, classOfT);
    }

    public static <T> T fromJson(Reader json, Type typeOfT) throws JsonIOException,
            JsonSyntaxException {
        return create().fromJson(json, typeOfT);
    }

    public static String toJson(Object src) {
        return create().toJson(src);
    }

    public static String toJson(Object src, Type typeOfSrc) {
        return create().toJson(src, typeOfSrc);
    }


}
