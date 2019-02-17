package com.cybertek.utilities;

import cucumber.api.java.it.Ma;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserUtility {

    // method to get user email and password

    /**
     * returns email and password of a user based on role and location
     * @param role
     * @param location
     * @return
     */
    public static Map<String, String> getUserCredentials(String role, String location){
        // read the excel file based on location and get data
        String file = null;
        switch (location){
            case ApplicationConstants.IL:
                file = "./src/test/resources/test_data/il-users.xlsx";
                break;
            case ApplicationConstants.DARK_SIDE:
                file = "./src/test/resources/test_data/dark-side-users.xlsx";
                break;
            case ApplicationConstants.LIGHT_SIDE:
                file = "./src/test/resources/test_data/light-side-users.xlsx";
                break;
        }
        // read the file based and get teh data
        List<Map<String, String>> userData = new ExcelUtil(file, "Sheet1").getDataList();

        for (Map<String , String> user : userData) {
            if (role.contains(user.get("role"))){
                Map<String, String> map = new HashMap<>();
                map.put("email", user.get("email"));
                map.put("password", user.get("first_name").toLowerCase()+user.get("last_name").toLowerCase());
                return map;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getUserCredentials(ApplicationConstants.TEACHER, ApplicationConstants.DARK_SIDE));
    }

}
