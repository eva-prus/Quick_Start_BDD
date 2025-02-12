package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Внутренняя страница СУДИР")
public class SudirPage extends WebPage {
    @Name("Электронная подпись")
    private SelenideElement ECPbutton = $x("//button[@class=\"favorite2 btn-meth meth-int logo-count-1 meth-count-1 meth-x509 item formFooter__button formFooter__button--decoration\"]");

    @Name("Нужная электронная подпись")
    private SelenideElement ECP = $x("//*[contains(text(),\"08.03.2025\")]");
}
