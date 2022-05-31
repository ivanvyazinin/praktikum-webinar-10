package ru.yandex.practicum.debug;

import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YaSearchTest {

    @Test
    public void debug() {
        open("https://ya.ru/");
        $(byId("text")).sendKeys("debug");
        $(byClassName("search2__button")).click();
    }

}