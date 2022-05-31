package ru.yandex.practicum.debug;

public class App {

    public static void main(String[] args) {
        CatFeeder catFeeder = new CatFeeder(100);
        catFeeder.weeklyFeed(20);
    }

}