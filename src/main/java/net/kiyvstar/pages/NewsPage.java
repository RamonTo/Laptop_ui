package net.kiyvstar.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;


/**
 * Created by RomanTo on 10/28/14.
 */
public class NewsPage extends PageObject {

    @FindBy(linkText = "Пакети міжнародна телефонія")
    public WebElementFacade packageInternetionalTelephony;

}
