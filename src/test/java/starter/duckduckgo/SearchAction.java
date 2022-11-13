package starter.duckduckgo;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class SearchAction extends UIInteractions {
    @Step("Search for '{0}'")
    public void byKeyWord(String key){
        $("//input[@class = \"gLFyf gsfi\"]").sendKeys("DODO");
        $("(//input[@class = \"gNO89b\"])[1]").click();
    }

}
