package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ProfilePage {

    private final SelenideElement
            firstBookSelector = $$(".rt-tr-group").first(),
            deleteConfirmSelector = $("#closeSmallModal-ok");

    @Step("Открыть страницу с профилем.")
    public ProfilePage openPage() {

        open("/profile");

        return this;
    }

    @Step("Проверить, что авторизовались под правильным пользователем.")
    public ProfilePage checkAuthData(String userName) {

        $("#userName-value").shouldHave(text(userName));

        return this;
    }

    @Step("Проверить, что книга есть в профиле.")
    public ProfilePage checkBookInProfile(String isbn) {

        firstBookSelector.$("a[href='/profile?book=" + isbn + "']").shouldBe(exist);

        return this;
    }

    @Step("Удалить книгу.")
    public ProfilePage deleteBook(String isbn) {

        firstBookSelector.$("#delete-record-undefined").click();
        deleteConfirmSelector.click();

        return this;
    }

    @Step("Проверить результат на UI-слое.")
    public ProfilePage checkResultOnUi(String isbn) {

        firstBookSelector.$("a[href='/profile?book=" + isbn + "']").shouldNot(exist);

        return this;
    }
}