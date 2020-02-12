package keywordtests2;

import common.CommonAPI;
import keyword2.Features2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestKeyword2 extends CommonAPI
{
    @Test
    public void testKeyWord()throws InterruptedException, IOException
    {
        Features2 features = PageFactory.initElements(driver, Features2.class);
        features.selectFeatures(driver);
    }
}
