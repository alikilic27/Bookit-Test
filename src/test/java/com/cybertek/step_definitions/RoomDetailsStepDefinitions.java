package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.RoomPage;
import com.cybertek.utilities.ExcelUtil;
import cucumber.api.java.en.*;
import org.junit.Assert;

import java.util.Map;

public class RoomDetailsStepDefinitions {
    @Then("correct room information should be displayed for light side")
    public void correct_room_information_should_be_displayed_for_light_side() {
        // get the room names from the excel file
        // file path and sheetname
        String file = "./src/test/resources/test_data/light-side-test-data.xlsx";
        String sheet = "light-side-rooms";
        ExcelUtil roomData = new ExcelUtil(file, sheet);

        // iterate through all the rows in the excel sheet
        // Map<String, String> row  --> represents one row

        for (Map<String, String> room: roomData.getDataList()){
            System.out.println(room.get("name"));

            MapPage mapPage = new MapPage();
            String roomName = room.get("name");

            mapPage.room(roomName).click();

            RoomPage roomPage = new RoomPage();

            String capacity = room.get("capacity");
            System.out.println(capacity);

//            String actualAttribute = roomPage.capacityImg.getAttribute("src");
//
//            System.out.println(actualAttribute);
//
//            if (capacity.startsWith("6")){
//                Assert.assertTrue(actualAttribute.endsWith("six.svg"));
//            }else{
//                Assert.assertTrue(actualAttribute.endsWith("four.svg"));
//            }
//
//            // based on the room information from excel verify UI
//
//            roomPage.map.click();
        }

    }

}
