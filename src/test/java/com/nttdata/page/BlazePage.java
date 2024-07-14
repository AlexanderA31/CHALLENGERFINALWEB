package com.nttdata.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BlazePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public static By samsungGalaxyS6 = By.xpath("//a[contains(text(),'Samsung galaxy s6')]");
    public static By imageElement = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");

    public static By nokiaLumia1520 = By.xpath("//a[contains(text(),'Nokia lumia 1520')]");
    public static By homeLink = By.xpath("//a[@class='nav-link' and contains(text(),'Home')]");
    public static By addToCartButton = By.xpath("//a[contains(text(),'Add to cart')]");
    public static By cartLink = By.xpath("//a[@id='cartur']");
    public static By tableCell = By.xpath("//tbody/tr[1]/td[1]");

    public static By placeOrderButton = By.xpath("//button[contains(text(),'Place Order')]");

    public static By nameInput = By.xpath("//input[@id='name']");
    public static By countryInput = By.xpath("//input[@id='country']");
    public static By cityInput = By.xpath("//input[@id='city']");
    public static By cardInput = By.xpath("//input[@id='card']");
    public static By monthInput = By.xpath("//input[@id='month']");
    public static By yearInput = By.xpath("//input[@id='year']");


    public static By purchaseButton = By.xpath("//button[contains(text(),'Purchase')]");
    public static By thankYouMessage = By.xpath("//h2[contains(text(),'Thank you for your purchase!')]");



}

