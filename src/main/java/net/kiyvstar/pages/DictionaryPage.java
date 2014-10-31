package net.kiyvstar.pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.By;

@DefaultUrl("http://www.kyivstar.ua/rv-67/mm/")
public class DictionaryPage extends PageObject {

    @FindBy(linkText = "Приватним абонентам")
    public WebElementFacade privacyAbonentL1;

    @FindBy(linkText = "Малому та середньому бізнесу")
    public WebElementFacade busynessL1;

    @FindBy(linkText = "Новини")
    public WebElementFacade newsL2;

    @FindBy(linkText = "Оптові пропозиції")
    public WebElementFacade optL3;

    @FindBy(linkText = "Пакети міжнародна телефонія")
    public WebElementFacade packageInternetionalTelephony;

    public void open_news_page(){
        busynessL1.click();
        newsL2.click();
        optL3.click();
        try {Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();}
    }

    public boolean searchLinkIsVisible(String link) {
        return element(element(By.linkText(link))).isVisible();
    }


}