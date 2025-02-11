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
}
