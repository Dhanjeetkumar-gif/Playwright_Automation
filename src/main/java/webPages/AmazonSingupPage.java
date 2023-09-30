package webPages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AmazonSingupPage {

    Page page;
    private Locator searchInputBox;
    private Locator searchBtn;
    private Locator result;

    public AmazonSingupPage(Page page) {
        this.page = page;
        this.searchInputBox = page.locator("//*[@id='twotabsearchtextbox']");
        this.searchBtn = page.locator("//*[@id=\"nav-search-submit-button\"]");
        this.result = page.locator("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[3]");

    }
public void enterSearchItem(String item){
        searchInputBox.fill(item);
}
public void clickOnSearchBtn(){
        searchBtn.check();
}
public void verifySuccessfulSearch(String expContent){
        assertThat(result).hasText(expContent);
}

public void opensPage(String url){
        page.navigate(url);
}

}
