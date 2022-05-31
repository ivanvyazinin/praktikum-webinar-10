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
            if (balance < dailyRation) {
                LOGGER.error("Недостаточно корма. Осталось: " + this.balance + ". Нужно корма: " + ((dailyRation - balance) + dailyRation * (7 - i)));
                return;
            }
            LOGGER.info("День '" + i + "', остаток корма: '" + this.balance + "'");
            printDayType(DayOfWeek.values()[i - 1]);
            this.balance -= dailyRation;
        }
    }

    private static void printDayType(DayOfWeek day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                LOGGER.debug("Выходной день.");
                break;
            default:
                LOGGER.debug("Рабочий день.");
        }
    }
}