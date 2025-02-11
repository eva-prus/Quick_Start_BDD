package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Страница внутренней авторизации СУДИР")
public class SudirPage extends WebPage {
    @Name("логин")
    private SelenideElement loginField = $x("//input[@id=\"login\"]");
    @Name("пароль")
    private SelenideElement passwordField = $x("//input[@id=\"password\"]");
    @Name("войти")
    private SelenideElement buttonEnter = $x("//button[@id=\"bind\"]");
}
