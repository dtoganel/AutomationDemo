package teste;

import org.junit.Test;
import pages.FramePage;
import pages.IndexPage;
import pages.RegisterPage;
import webDriver.ShareData;

public class FrameTest extends ShareData {

    @Test
    public void testFrame(){
        IndexPage indexPage = new IndexPage(webDriver);
        indexPage.skipSignIn();

        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.navigateToFramePage();

        FramePage framePage = new FramePage(webDriver);
        framePage.singleFrame("Single frame test");
        framePage.multipleFrameInteraction("Multi frame test");
    }
}
