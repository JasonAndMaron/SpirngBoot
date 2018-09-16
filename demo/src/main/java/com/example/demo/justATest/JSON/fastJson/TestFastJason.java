package com.example.demo.justATest.JSON.fastJson;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

public class TestFastJason {

    public static void main(String[] args) {
        System.out.println("test JSONObject : "+ TestFastJason.isJSONObject("{'tets':'tt'}"));
    }



    private static boolean isJSONObject(String test){

        if (!StringUtils.isBlank(test)) {

            try {
                JSONObject jsonObject = JSONObject.parseObject(test);
                return true;
            } catch (Exception ex) {
                return false;
            }
        } else {
            return false;
        }
    }
}
