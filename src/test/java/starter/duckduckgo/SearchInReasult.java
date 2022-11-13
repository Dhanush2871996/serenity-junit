package starter.duckduckgo;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.steps.UIInteractions;

public class SearchInReasult extends PageComponent {
    public String getTheText(){
        System.out.println("??????????????????"+getTitle());
        return $("//h2[@class=\"qrShPb kno-ecr-pt PZPZlf q8U8x\"]/span").getText();
    }
}
