package ru.yandex.practicum.debug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {
        LOGGER.info("Приложение запустилось");
        CatFeeder catFeeder = new CatFeeder(100);
        catFeeder.weeklyFeed(21);
    }

}