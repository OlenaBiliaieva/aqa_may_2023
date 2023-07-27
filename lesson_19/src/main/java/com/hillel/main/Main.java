package com.hillel.main;

import static com.hillel.main.ProjectLogger.logger;

public class Main {

    public static void main(final String... args) {

        String hello = "Hello this is log";
        logger.info("String was added: {}", hello);
//        logger.error("Debug Message Logged !!!");
//        logger.info("Info Message Logged !!!");
//        logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
    }
}
