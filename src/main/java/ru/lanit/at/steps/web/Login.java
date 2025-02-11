package ru.lanit.at.steps.web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Когда;
import ru.lanit.at.utils.SelectUser;
import ru.lanit.at.utils.web.pagecontext.PageManager;

import java.time.Duration;

public class Login extends AbstractWebSteps{
    public Login(PageManager pageManager){
        super(pageManager);
    }
    SelectUser user = new SelectUser();
    @Когда("Ввести данные аутентификации для роли {string}")
    public void authorization(String role){
        SelenideElement fieldLogin = pageManager
                .getCurrentPage()
                .getElement("логин");
        fieldLogin
                .shouldBe(Condition.visible, Duration.ofSeconds(60))
                .setValue(user.setLogin(role));
        LOGGER.info("Поле Логин заполнено значением для роли {}", role);

        SelenideElement fieldPassword = pageManager
                .getCurrentPage()
                .getElement("пароль");
        fieldPassword
                .shouldBe(Condition.visible, Duration.ofSeconds(60))
                .setValue(user.setPassword(role));
        LOGGER.info("Поле Пароль заполнено значением для роли {}", role);
    }
}
