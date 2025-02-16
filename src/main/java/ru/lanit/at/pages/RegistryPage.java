package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Страница реестра")
public class RegistryPage extends WebPage {
    @Name("Сообщение об ошибке")
    private SelenideElement errorInfo = $x("//div[@class=\"q-notification row items-stretch q-notification--standard bg-error-popup text-error-popup error-popup\"]");
}