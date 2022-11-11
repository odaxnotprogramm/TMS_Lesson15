package com.tms.java.Lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        View view = new View();
        Logic logic = new Logic();

        //Create & show list
        List<Integer> list = new ArrayList<>();
        int listSize = input.inputIntByScanner("Enter list size: ");
        logic.fillListByRandomDigits(list,listSize);
        view.outputStringToConsole("Random list: ");
        view.outputListToConsole(list);

        //FIRST TASK
        view.outputStringToConsole("\nDelete same digits: ");
        list.stream().distinct().forEach(view::outputIntToConsole);

        view.outputStringToConsole("\nShow even elements from 7 to 17: ");
        list.stream().filter(value -> value >= 7 && value <= 17 && value % 2 == 0)
                .forEach(view::outputIntToConsole);

        view.outputStringToConsole("\nMultiply each element by 2: ");
        list.stream().forEach(value -> view.outputIntToConsole(value * 2));

        view.outputStringToConsole("\nSort and show first 4 elements: ");
        list.stream().sorted().limit(4).forEach(view::outputIntToConsole);

        view.outputStringToConsole("\nShow stream size: ");
        view.outputIntToConsole((int) list.stream().count());

        view.outputStringToConsole("\nShow avg value of elements: ");
        view.outputDoubleToConsole((double)(list.stream().reduce(Integer::sum)).get() / listSize);

        //SECOND TASK
        view.outputStringToConsole("\nShow how many people with name Daniil in our group: ");
        List<String> names = Arrays.asList("Vadim","Valeriya","Denis","Gleb","Olga",
                "Roman","Olga","Danila","Aleksandr","Elizaveta","Svyatoslav",
                "Yana","Mariya","Dmitry","Irina","Aleksandr","Daniil","Julia");
        view.outputIntToConsole((int) names.stream().filter(value -> value.equalsIgnoreCase("Daniil") ||
                value.equalsIgnoreCase("Danila")).count());

        view.outputStringToConsole("\nShow all names starting with 'a' in out group: \n");
        names.stream().filter(name -> name.charAt(0) == 'a' || name.charAt(0) == 'A')
                .forEach(name -> view.outputStringToConsole(name + "\n"));
    }
}
