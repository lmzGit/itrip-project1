package com.cskt.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 类名称: JsonUtil
 * 类描述: TODO
 * 创建人: 李谟卓
 * 创建时间 2021/1/6
 *
 * @Version 1.0
 */
public class JsonUtil {
    private static ObjectMapper objectMapper;
    static {
        objectMapper = new ObjectMapper();
    }
    /**
     * 将Object对象转换成为Json字符串
     * @param object
     * @return
     * @throws JsonProcessingException
     */
    public static String objectToJsonString(Object object) throws
            JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }
    /**
     * 将Json字符串反序列化为Object对象
     * @param jsonString 待反序列化的Json字符串
     * @param tClass 返回的类类型
     * @param <T> 泛型
     * @return
     * @throws JsonProcessingException
     */
    public static <T> T jsonStringToObject(String jsonString,Class<T> tClass)
            throws JsonProcessingException {
        return objectMapper.readValue(jsonString, tClass);
    }
}
