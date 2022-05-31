package ru.yandex.practicum.debug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatFeeder {

    private static final Logger LOGGER = LoggerFactory.getLogger(CatFeeder.class);

    private int balance;

    public CatFeeder(int balance) {
        this.balance = balance;
    }

    public void weeklyFeed(int dailyRation) {
        for (int i = 1; i <= 7; i++) {
            LOGGER.info("День '" + i + "', остаток корма: '" + this.balance + "'");
            printDayType(DayOfWeek.values()[i-1]);
            this.balance -= dailyRation;
        }
    }

    private static void printDayType(DayOfWeek day) {
        switch (day) {
            case SATURDAY:
                LOGGER.debug("Выходной день.");
            case SUNDAY:
                LOGGER.debug("Выходной день.");
            default:
                LOGGER.debug("Рабочий день.");
        }
    }
}