package ru.lanit.at.utils;

import org.aeonbits.owner.ConfigFactory;
import ru.lanit.at.utils.web.properties.Configurations;

public class SelectUser {
    Configurations conf = ConfigFactory.create(Configurations.class);
    public String setLogin(String login){
        return switch (login) {
            case "Администратор ЛК ОР" -> conf.getLoginLkor();
            default -> "Wrong environment name";
        };
    }
    public String setPassword(String login) {
        return switch (login) {
            case "Администратор ЛК ОР" -> conf.getPasswordLkor();
            default -> "Wrong environment name";
        };
    }
}
