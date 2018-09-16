package com.example.demo.justATest.JSON.netSfJson;

import net.sf.json.JSONObject;

public class TestSfJson {

    public static void main(String[] args) {
        String jsonStr = "{'srwe':'5','hshh':'popo'}";
        System.out.println("json String is : " + isJsonStr(jsonStr));
    }


    private static boolean isJsonStr(String jsonStr){

        try{
            JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        }catch (Exception ex){

        }
        return false;
    }
}
