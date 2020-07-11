package org.techmeskills.aqa5.auf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.techmeskills.aqa5.auf.baseEntity.BasePage;
import org.techmeskills.aqa5.auf.baseEntity.BasePageFactory;
import org.techmeskills.aqa5.auf.core.BrowsersService;
import org.techmeskills.aqa5.auf.elements.UIElement;

public class AddProjectPage extends BasePageFactory {
    @FindBy(id="accept")
    public WebElement addProjectButtonField;

    @FindBy(id="name")
    public WebElement nameField;

    @FindBy(id="suite_mode_single")
    public WebElement suiteModeSingleField;

    @FindBy(id="suite_mode_single_baseline")
    public WebElement suiteModeSingleBaselineField;

    @FindBy(id="suite_mode_multi")
    public WebElement suiteModeMultiField;

    public AddProjectPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    public boolean isPageOpened() {
        return new UIElement(browsersService, By.id("accept")).isDisplayed();
    }



}
