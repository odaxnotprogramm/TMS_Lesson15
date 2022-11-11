package com.tms.java.Lesson15;

import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

public class View {
    public void outputStringToConsole(String value){
        System.out.print(value);
    }
    public void outputIntToConsole(int value){
        System.out.print(value + " ");
    }
    public void outputDoubleToConsole(double value){
        String result = String.format("%.3f",value);
        System.out.print(result + " ");
    }
    public void outputListToConsole(List<Integer> list){
        Stream<Integer> stream = list.stream();
        stream.forEach(value -> System.out.print(value + " "));
    }
}