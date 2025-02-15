package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;
@Name("Раздел Переписка")
public class CorrespondencePage extends WebPage {
    @Name("Список Сфера регулирования")
    private final SelenideElement listSpheres = $x("//div[text() = \"Сфера регулирования\"]/..");
    @Name("Вариант электроэнергетика")
    private final SelenideElement labelElectroenergetics = $x("//div[text() = \"Электроэнергетика\"]");
    @Name("Список Виды регулирования")
    private final SelenideElement listTypesRegulation = $x("//div[text() = \"Вид деятельности\"]/..");
    @Name("Вариант ТСО")
    private final SelenideElement labelTSO = $x("//div[text()=\"Передача электрической энергии по электрическим сетям ТСО\"]/../../div[@class=\"q-tree__tickbox q-checkbox cursor-pointer no-outline row inline no-wrap items-center q-checkbox--dense\"]");
    @Name("Уведомление о созданной заявке")
    private final SelenideElement successRequest = $x("//div[text()=\"Заявка создана!\"]");
    @Name("Вариант Транспорт")
    private final SelenideElement labelTransport = $x("//div[text() = \"Транспортные услуги\"]");
    @Name("Вариант Горячее водоснабжение")
    private final SelenideElement labelHotWater = $x("//div[text() = \"Горячее водоснабжение\"]");
    @Name("Вариант Сбыт горячей воды")
    private final SelenideElement labelSalesHotWater = $x("//div[text()=\"Сбыт горячей воды\"]/../../div[@class=\"q-tree__tickbox q-checkbox cursor-pointer no-outline row inline no-wrap items-center q-checkbox--dense\"]");
    @Name("Список Вид потерь")
    private final SelenideElement listTypesLoss = $x("//div[text() = \"Вид потерь\"]/..");
    @Name("Список Количество лет регулирования")
    private final SelenideElement listAmountYearsRegulation = $x("//div[text() = \"Количество лет регулирования\"]/..");
    @Name("Вариант Нормативы потерь горячей воды при производстве")
    private final SelenideElement labelStandardsOfHotWaterLossesDuringProduction = $x("//div[text() = \"Нормативы потерь горячей воды при производстве\"]");
    @Name("Вариант 3")
    private final SelenideElement labelThree = $x("//div[text() = \"3\"]");
}
