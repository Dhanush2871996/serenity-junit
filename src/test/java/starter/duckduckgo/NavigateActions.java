package starter.duckduckgo;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class NavigateActions extends UIInteractions {

    @Step("Navigating to google home page")
    public void navigateToPage(){
        openUrl("https://www.google.com/");
        System.out.println(">>>>>>>>>>>>>>>>>>>"+getTitle());
    }

}
