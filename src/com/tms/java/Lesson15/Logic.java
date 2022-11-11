package com.tms.java.Lesson15;

import java.util.List;

public class Logic {
    void fillListByRandomDigits(List<Integer> list, int listSize){
        for(int counter = 0;counter < listSize;counter++){
            list.add((int)(Math.random() * 20));
        }
    }
}
