package com.mateoospina.practicaiautomatizacionendtoend.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


//Lo hacemos extender ya que el metodo que nos recibe la pagina requiere un PageObject, si solo necesitara mapear no habria que extender
@DefaultUrl("https://www.demoblaze.com/")
public class DemoBlazeHomePage extends PageObject {

    public static final Target LOG_IN_MENU = Target.the("Log in menu")
            .located(By.id("login2"));//Nombre que sale en el reporte

    public static final Target CART = Target.the("cart")
            .locatedBy("//*[@id=\"navbarExample\"]/ul/li[4]/a");

    public static final Target HOME = Target.the("Home")
            .locatedBy("//a[text()='Home ']");//Nombre que sale en el reporte

    public static final Target LOG_OUT_MENU = Target.the("Home")
            .locatedBy("//*[@id=\"logout2\"]");//Nombre que sale en el reporte

    public static final Target CATEGORY_MENU = Target.the("Category of {0}")
            .locatedBy("//a[@id='itemc'][text()='{0}']");

    public static final Target PRODUCT = Target.the("Product {0}")
            .locatedBy("//div[contains(@class,'card')]//a[text()='{0}']");

    public static final Target BANNER = Target.the("homepage banner")
            .located(By.id("narvbarx"));


}

