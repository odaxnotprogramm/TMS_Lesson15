package com.tms.java.Lesson15;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    public int inputIntByScanner(String message){
        System.out.print(message);
        return scanner.nextInt();
    }
}
