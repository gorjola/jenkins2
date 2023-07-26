
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;


public class main {
    public static WebDriver driver;
    @BeforeTest
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
    }

    @Test
    public void mainTest(){

        WebElement x=driver.findElement(By.xpath("//input[@id='search']"));
        x.sendKeys("music");
        WebElement searchbutt=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        searchbutt.click();
        List<WebElement>musicList=driver.findElements(By.xpath("//img[@class='yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded']"));
        musicList.get(1).click();

    }
}
