package starter.duckduckgo;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class SearchWithAKeyWord {
    @Managed(driver = "chrome")
    WebDriver driver;

    NavigateActions navigateActions;
    SearchAction searchAction;
    SearchInReasult searchInReasult;

    @Test
    public void testMeth(){
    navigateActions.navigateToPage();
    searchAction.byKeyWord("DODO");
    String results = searchInReasult.getTheText();
    System.out.println(">>>>>>>>>>>>>>>>"+results+"???????????????");
    Serenity.reportThat("The key sould appeare in the search results", ()->Assert.assertEquals("Dodo", results));
    }
}
