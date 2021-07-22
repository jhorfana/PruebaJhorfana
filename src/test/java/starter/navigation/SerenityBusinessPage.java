package starter.navigation;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


public class SerenityBusinessPage extends PageObject {
    public static final By MENU_ORGANIZATION = By.xpath("/html/body/div[2]/aside[1]/section/div/ul/li[6]/a");
    public static final By MENU_BUSINESS_UNIT = By.xpath("/html/body/div[2]/aside[1]/section/div/ul/li[6]/ul/li[1]/a");
    public static final By NEW_BUSINESS_UNIT = By.xpath("//*[@id='GridDiv']/div[2]/div[2]/div/div/div[1]/div/span");
    public static final Target INPUT_NAME_UNIT = Target.the("Ingresar el nombre de la unidad").located(By.xpath("/html/body/div[5]/div[2]/div/div[2]/form/div/div[1]/div/div/div[1]/input"));
    public static final By SAVE_NAME_UNIT = By.xpath("/html/body/div[5]/div[2]/div/div[1]/div/div/div/div[1]/div/span");

}
