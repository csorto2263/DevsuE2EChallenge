package com.example.devsue2echallenge;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;
    private HomePage homePage;
    private CartPage cartPage;

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://www.jetbrains.com/");

        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void purchaseFlowTest() {

        //Agregar 2 productos al carrito
        homePage.open();
        homePage.addProductToCart("Samsung galaxy s6");
        homePage.open();
        homePage.addProductToCart("Nokia lumia 1520");

        //Ver el Carrito
        homePage.viewCart();

        //Completar la compra
        cartPage.completePurchase("Nombre de Prueba", "País de Prueba", "Ciudad de Prueba", "1234567890123456", "01", "2025");

        String purchaseMessage = cartPage.getPurchaseMessage();

        // Verificar el mensaje de compra
        String expectedMessage = "Thank you for your purchase!";
        assertEquals(purchaseMessage, expectedMessage, "El mensaje de compra no coincide");
    }



}
