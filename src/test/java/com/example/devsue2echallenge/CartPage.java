package com.example.devsue2echallenge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPurchaseMessage() {
        return driver.findElement(By.cssSelector(".sweet-alert > h2:nth-child(6)")).getText();
    }

    public void completePurchase(String name, String country, String city, String cardNumber, String month, String year) {
        driver.findElement(By.className("btn-success")).click();
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("country")).sendKeys(country);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("card")).sendKeys(cardNumber);
        driver.findElement(By.id("month")).sendKeys(month);
        driver.findElement(By.id("year")).sendKeys(year);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
    }
}
