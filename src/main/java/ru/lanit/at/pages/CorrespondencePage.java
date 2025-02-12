package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Раздел Переписка")
public class CorrespondencePage extends WebPage {
    @Name("тип сообщения")
    private SelenideElement typeMessage = $x("//span[text() = \"Тип сообщения\"]");
    @Name("опция Тарифная заявка")
    private SelenideElement labelTariffRequests = $x("//div[text() = \"Тарифная заявка\"]");
    @Name("статус")
    private SelenideElement status = $x("//span[text() = \"Статус\"]");
    @Name("опция Подготовка")
    private SelenideElement labelPreparing = $x("//div[text() = \"Подготовка\"]");
    @Name("статус Подготовка")
    private SelenideElement statusPreparing = $x("//div[contains(text(),\"Подготовка\")]");
    @Name("сферы регулирования")
    private SelenideElement spheres = $x("//span[text() = \"Сферы регулирования\"]");
    @Name("опция Сообщение")
    private SelenideElement optionMessage = $x("//div[contains(text(),\"Сообщение\")]");
    @Name("дата")
    private SelenideElement dateField = $x("//input[@* = \"Дата\"]");
    @Name("номер")
    private SelenideElement numberField = $x("//input[@* = \"Номер\"]");
    @Name("тема")
    private SelenideElement topicField = $x("//input[@* = \"Тема\"]");
    @Name("содержание")
    private SelenideElement content = $x("//textarea");
    @Name("уведомление")
    private SelenideElement notification = $x("//div[text()=\"Информационное сообщение успешно создано!\"]");
    @Name("адресаты")
    private SelenideElement organizations = $x("//div[contains(text(),\"Адресаты\")]");
}

