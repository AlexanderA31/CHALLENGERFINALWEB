package com.nttdata.steps;

import com.nttdata.page.BlazePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Alert;
public class BlazeStep {

    WebDriver driver;
    BlazePage blazePage;

    public BlazeStep(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarTiendaDemo(String url){
        driver.get(url);
    }


    public void agregarProducto1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement samsungGalaxyS6 = wait.until(ExpectedConditions.elementToBeClickable(BlazePage.samsungGalaxyS6));
        samsungGalaxyS6.click();

        WebElement imagen = wait.until(ExpectedConditions.visibilityOfElementLocated(BlazePage.imageElement));
        imagen.isDisplayed();

        WebElement addCar = wait.until(ExpectedConditions.elementToBeClickable(BlazePage.addToCartButton));
        addCar.click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        WebElement home = wait.until(ExpectedConditions.elementToBeClickable(BlazePage.homeLink));
        home.click();
    }


    public void agregoOtroProducto() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nokiaLumia1520 = wait.until(ExpectedConditions.elementToBeClickable(BlazePage.nokiaLumia1520));
        nokiaLumia1520.click();

        WebElement imagen = wait.until(ExpectedConditions.visibilityOfElementLocated(BlazePage.imageElement));
        imagen.isDisplayed();

        WebElement addCar = wait.until(ExpectedConditions.elementToBeClickable(BlazePage.addToCartButton));
        addCar.click();


        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        WebElement home = wait.until(ExpectedConditions.elementToBeClickable(BlazePage.homeLink));
        home.click();

    }

    public void verCarrito() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement cartLinkElement = wait.until(ExpectedConditions.elementToBeClickable(BlazePage.cartLink));


        cartLinkElement.click();
    }


    public void realizarOrden() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement productos = wait.until(ExpectedConditions.visibilityOfElementLocated(BlazePage.tableCell));
        productos.isDisplayed();

        WebElement placeOrderButtonElement = wait.until(ExpectedConditions.elementToBeClickable(BlazePage.placeOrderButton));
        placeOrderButtonElement.click();
    }

    public void completarFormulario(String nombre, String pais, String ciudad, String tarjeta, String mes, String anio) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            WebElement nameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(BlazePage.nameInput));
            nameElement.sendKeys(nombre);


            WebElement countryElement = wait.until(ExpectedConditions.visibilityOfElementLocated(BlazePage.countryInput));
            countryElement.sendKeys(pais);


            WebElement cityElement = wait.until(ExpectedConditions.visibilityOfElementLocated(BlazePage.cityInput));
            cityElement.sendKeys(ciudad);


            WebElement cardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(BlazePage.cardInput));
            cardElement.sendKeys(tarjeta);


            WebElement monthElement = wait.until(ExpectedConditions.visibilityOfElementLocated(BlazePage.monthInput));
            monthElement.sendKeys(mes);


            WebElement yearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(BlazePage.yearInput));
            yearElement.sendKeys(anio);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error en completar el formulario: " + e.getMessage());
        }
    }


    public void confirmoPedido() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement comprar = wait.until(ExpectedConditions.elementToBeClickable(BlazePage.purchaseButton));
        comprar.click();
    }

    public void verificarCompra() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement verificar = wait.until(ExpectedConditions.visibilityOfElementLocated(BlazePage.thankYouMessage));


        if (verificar.isDisplayed()) {
            System.out.println("El mensaje 'Thank you for your purchase!' está presente.");
        } else {
            System.out.println("El mensaje 'Thank you for your purchase!' no está visible.");
        }
    }

}
