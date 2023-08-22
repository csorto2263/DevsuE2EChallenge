package com.example.devsue2echallenge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.demoblaze.com/");
    }

    public void addProductToCart(String productName) {
        driver.findElement(By.linkText(productName)).click();
        driver.findElement(By.linkText("Add to cart")).click();
    }

    public void viewCart() {
        driver.findElement(By.id("cartur")).click();
    }
}
