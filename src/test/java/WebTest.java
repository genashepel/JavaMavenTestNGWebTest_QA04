import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;


public  class WebTest {

    @Test
    public void testButtomSong_Lirics() throws InterruptedException {
        String chromeDriver = "web-driver.chrome.driver";
        String driverPath = "D:\\JavaProjects\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/lyrics.html";
        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();

        driver.get(url);


        WebElement serchButton = driver.findElement(By.xpath("//*[@id=\"submenu\"]/li[2]/a"));
        serchButton.click();

        Assert.assertEquals(driver.getCurrentUrl(),expectedResult);

        driver.quit();

    }

    @Test
    public void testTextWelcomTo99() throws InterruptedException {
        String chromeDriver = "web-driver.chrome.driver";
        String driverPath = "D:\\JavaProjects\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);


        WebElement menuBrowserLanguages = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        );
        menuBrowserLanguages.click();


        WebElement menuStart = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']")
        );
        menuStart.click();

        WebElement h2 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h2"));
        String actualResult = h2.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }
    //Part 2
    //TC_11_01
    @Test
    public void testText99BottleOfBeer() throws InterruptedException {
        String chromeDriver = "web-driver.chrome.driver";
        String driverPath = "D:\\JavaProjects\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement h1Header = driver.findElement(
                By.xpath("//*[@id=\"header\"]/h1")
        );

        String actualResult = h1Header.getText();

        Assert.assertEquals(expectedResult, actualResult);

        driver.quit();
    }

    //TC_11_02
    @Test
    public void testMenuSubmitNewLanguage() throws InterruptedException {
        String chromeDriver = "web-driver.chrome.driver";
        String driverPath = "D:\\JavaProjects\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit new Language";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement lastMenu = driver.findElement(
                By.xpath("//*[@id=\"menu\"]/li/a[@href='/submitnewlanguage.html']")
        );
        String actualResult = lastMenu.getText();
        expectedResult = expectedResult.toUpperCase();

        Assert.assertEquals(expectedResult, actualResult);

        driver.quit();
    }

    //TC_11_03
    @Test
    public void testLastMenuSNewL() throws InterruptedException {
        String chromeDriver = "web-driver.chrome.driver";
        String driverPath = "D:\\JavaProjects\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit New Language";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath(
                "//*[@id=\"menu\"]/li/a[@href='/submitnewlanguage.html']")
        );
        menuSubmitNewLanguage.click();

        //Thread.sleep(1000);

        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"submenu\"]/li/a"));

        String actualResult = subMenu.getText();

        Assert.assertEquals(expectedResult, actualResult);

        driver.quit();
    }

    //TC_11_04
    @Test
    public void testSecondMenu() throws  InterruptedException{
        String chromeDriver = "web-driver.chrome.driver";
        String driverPath = "D:\\JavaProjects\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/abc.html";
        String expectedResult = "0-9";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        Thread.sleep(1000);

        WebElement subMenu1 = driver.findElement(By.xpath("//*[@id=\"submenu\"]/li/a[@href='0.html']"));

        String actualResult = subMenu1.getText();

        Assert.assertEquals(expectedResult, actualResult);

        driver.quit();
    }

    //TC_11_05
    @Test
    public void testNamesOfCreaterSyte() throws  InterruptedException {
        String chromeDriver = "web-driver.chrome.driver";
        String driverPath = "D:\\JavaProjects\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResultName1 = "Oliver Schade";
        String expectedResultName2 = "Gregor Scheithauer";
        String expectedResultName3 = "Stefan Scheler";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuTeam = driver.findElement(By.xpath("//*[@id='submenu']/li/a[@href='team.html']"));
        menuTeam.click();

        WebElement firstName = driver.findElement(By.xpath("//*[@id='main']/h3[1]"));
        String actualResultName1 = firstName.getText();

        WebElement secondName = driver.findElement(By.xpath("//*[@id='main']/h3[2]"));
        String actualResultName2 = secondName.getText();

        WebElement thirdName = driver.findElement(By.xpath("//*[@id='main']/h3[3]"));
        String actualResultName3 = thirdName.getText();

        Assert.assertEquals(expectedResultName1, actualResultName1);
        Assert.assertEquals(expectedResultName2, actualResultName2);
        Assert.assertEquals(expectedResultName3, actualResultName3);


        driver.quit();
    }

    //TC_11_07
    @Test
    public void testMainMenuOfStartPage() throws  InterruptedException{
        String chromeDriver = "web-driver.chrome.driver";
        String driverPath = "D:\\JavaProjects\\chromedriver.exe";

        String startMenu = "http://www.99-bottles-of-beer.net/";
        String browseLanguagesMenu = "http://www.99-bottles-of-beer.net/abc.html";
        String serchLanguagesMenu = "http://www.99-bottles-of-beer.net/search.html";
        String topListMenu = "http://www.99-bottles-of-beer.net/toplist.html";
        String guestBookMenu = "http://www.99-bottles-of-beer.net/guestbookv2.html";
        String submitNewLanguages = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        String[] expectedResultArr = {
                startMenu,
                browseLanguagesMenu,
                serchLanguagesMenu,
                topListMenu,
                guestBookMenu,
                submitNewLanguages
        };

        String pathStartMenu = "//*[@id='menu']/li/a[@href='/']";
        String pathBrowseLanguagesMenu = "//*[@id='menu']/li/a[@href='/abc.html']";
        String pathSerchLanguagesMenu = "//*[@id='menu']/li/a[@href='/search.html']";
        String pathTopListMenu = "//*[@id='menu']/li/a[@href='/toplist.html']";
        String pathGuestBookMenu = "//*[@id='menu']/li/a[@href='/guestbookv2.html']";
        String pathSubmitNewLanguages = "//*[@id='menu']/li/a[@href='/submitnewlanguage.html']";

        String[] pathArr = {
                pathStartMenu,
                pathBrowseLanguagesMenu,
                pathSerchLanguagesMenu,
                pathTopListMenu,
                pathGuestBookMenu,
                pathSubmitNewLanguages
        };


        for(int i = 0; i < pathArr.length; i++){
            driver.get(expectedResultArr[i]);
            Thread.sleep(3000);
            for(int j = 0; j < pathArr.length; j++) {
                WebElement nextPage = driver.findElement(By.xpath(pathArr[j]));
                nextPage.click();
                String actualResult = driver.getCurrentUrl();
                String expectedResult = expectedResultArr[j];
                Assert.assertEquals(expectedResult, actualResult);
                //Thread.sleep(3000);
            }
        }
        driver.quit();
    }

    //TC_11_11
    @Test
    public void testSubmitNewLanguage() throws InterruptedException {
        String chromeDriver = "web-driver.chrome.driver";
        String driverPath = "D:\\JavaProjects\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement buttonMenu = driver.findElement(
                By.xpath("//*[@id='main']/form/p/input[@name='submitlanguage']")
        );
        buttonMenu.click();
        //Thread.sleep(3000);

        WebElement messageError = driver.findElement(By.xpath("//*[@id='main']/p"));

        String actualResult = messageError.getText();

        Assert.assertEquals(expectedResult, actualResult);

        driver.quit();
    }

}
