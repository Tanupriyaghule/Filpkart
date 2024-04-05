
package demo;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
    ChromeDriver driver;

    public TestCases() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
    }
    public void testCase01() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://www.flipkart.com/");
         WebElement searchBar = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]"));
         searchBar.sendKeys("Washing Machine").click();
         driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[2]")).click();
         int count = countItemsWithLowRating(driver, 4);
         System.out.println("Count of items with rating less than or equal to 4 stars: " + count);
         WebElement searchBar1=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form"));
         searchBar1.sendKeys("iPhone").click();
         driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).getText();
         WebElement searchBar2 = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
         searchBar2.sendKeys("Coffee Mug").click();
         driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div/div/div/section[7]/div[2]/div/div[1]/div/label/div[2]")).click();
         driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div[2]/div/div[2]/div/a[2]")).getText();
         driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div[3]/div/div[1]/div/a[2]")).getText();
         driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div[3]/div/div[2]/div/a[2]")).getText();
         driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div[3]/div/div[3]/div/a[2]")).getText();    
         driver.quit();
    }
}
