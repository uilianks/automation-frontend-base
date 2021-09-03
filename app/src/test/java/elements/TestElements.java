package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Utils;

public class TestElements {
    public WebDriver driver;
    Utils utils = new Utils();
    public By input = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
    public By button = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/center/input[1]");
    public By resultStatus = By.id("result-stats");

    //Inicializar teste
    public void initializeTest() {
        try {
            System.setProperty(utils.readFileProperties("chrome-driver"), utils.readFileProperties("chrome-driver-path"));
            driver = new ChromeDriver();
            driver.get(utils.readFileProperties("base-ulr"));
        }catch (Exception e){

        }
    }
    public void closeTest() {
        try {
           driver.close();
        }catch (Exception e){

        }
    }

    //Elementos
    public WebElement getTypeInput(){
        return driver.findElement(input);
    }
    public WebElement getButtonSearch(){
        return driver.findElement(button);
    }
    public WebElement redirectedSearchPage() {
        return driver.findElement(resultStatus);
    }
}
