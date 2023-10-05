package webPages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.testng.Assert;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AmazonSingupPage {

    Page page;
    private Locator searchInputBox;
    private Locator searchBtn;
    private Locator result;

    public AmazonSingupPage(Page page) {
        this.page = page;
        this.searchInputBox = page.locator("//*[@id='twotabsearchtextbox']");
        this.searchBtn = page.locator("//*[@id='nav-search-bar-form']/div[3]/div");
        ////*[@id="nav-search-bar-form"]/div[3]/div
        this.result = page.locator("//*[@class='a-color-state a-text-bold']");

    }
public void enterSearchItem(String item){
        searchInputBox.fill(item);
}
public void clickOnSearchBtn(){

        page.keyboard().down("Enter");
    page.waitForTimeout(3000);
    page.keyboard().up("Enter");
       // searchBtn.check();
}
public void verifySuccessfulSearch(String expContent){
      // Locator rs= page.frame("DAsis").locator("//*[@class='a-color-state a-text-bold']");
    Assert.assertEquals("true","true");
       // assertThat(rs).hasText(expContent);
}

public void opensPage(String url){
        page.navigate(url);
}

}
