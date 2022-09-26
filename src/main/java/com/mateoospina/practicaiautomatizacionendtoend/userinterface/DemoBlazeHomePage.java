package com.mateoospina.practicaiautomatizacionendtoend.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


//Lo hacemos extender ya que el metodo que nos recibe la pagina requiere un PageObject, si solo necesitara mapear no habria que extender
@DefaultUrl("https://www.demoblaze.com/")
public class DemoBlazeHomePage extends PageObject {

    public static final Target LOG_IN_MENU = Target
            .the("Log in menu")
            .located(By.id("login2"));//Nombre que sale en el reporte

    public static final Target CART = Target
            .the("cart")
            .located(By.id("//*[@id=\"navbarExample\"]/ul/li[4]/a"));
}
