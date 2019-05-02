package com.cybertek.pages;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindMaxChar {


    public String findMaxChar (String str){
        char[] array = str.toCharArray();
        int maxCount = 1;
        char maxChar = array[0];
        for(int i = 0, j = 0; i < str.length() - 1; i = j){
            int count = 1;
            while (++j < str.length() && array[i] == array[j]) {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = array[i];
            }
        }
        return (maxChar + " = " + maxCount);
    }

}
