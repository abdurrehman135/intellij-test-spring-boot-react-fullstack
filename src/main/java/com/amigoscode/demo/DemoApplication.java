package com.amigoscode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        /* power of shortcuts:
        Ctrl + Alt +
            v - for extracting value to variable
            n - to do opposite of above: return to in-line variable
            m - for extracting to method
        Ctrl + w
            to extend your selection to a word and then to a whole sentence
        */
//        below just for demo purposes of above...
//        printMessage("Hello How are you");
//        printMessage("I am fine");
//    }
//
//    private static void printMessage(String message) {
//        System.out.println(message);
    }
}
