package Extensions;

import PageObjects.WindAdmin.mainPage;
import Utilities.CommonOps;
import WorkFlows.mobileFlows;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class Verifications extends CommonOps
    {
        @Step("Verify text on elements")
        public static void TextInElement(WebElement elem, String expectedValue)
        {

            if (!getData("PlatformName").equalsIgnoreCase("Mobile"))
                wait.until(ExpectedConditions.visibilityOf(elem));
            else
                assertEquals(elem.getText(), expectedValue);

        }

        @Step("Verify text on elements")
        public static boolean VerifiedTextInElement(WebElement elem, String expectedValue)
        {

            if (!getData("PlatformName").equalsIgnoreCase("Mobile"))
                wait.until(ExpectedConditions.visibilityOf(elem));
            else
                assertEquals(elem.getText(), expectedValue);

            return true;
        }



        @Step("Verify Number on elements Equal to")
        public static void NumberOfElements(List<WebElement> elems, int expectedValue) {

            assertEquals(elems.size(), expectedValue);
        }

        @Step("Verify Element Visually")
        public static void visualElement(WebElement imageElement, String expectedImageName)
        {
            BufferedImage expectedImage = null;
            try {
                expectedImage = ImageIO.read(new File(getData("ImageRepo") + expectedImageName + ".png"));
                }
            catch (Exception e)
            {
                System.out.println("Error reading image file: " + e);
            }
            Screenshot imageScreenShot = new AShot().takeScreenshot(driver, imageElement);
            BufferedImage actualImage = imageScreenShot.getImage();
            diff = imgDiff.makeDiff(actualImage, expectedImage);
            assertFalse(diff.hasDiff(), "images are not the same as");
        }

        @Step("Verify text with text")
        public static void text(String actualText, String expectedText) {
            assertEquals(actualText, expectedText);
        }

    }
