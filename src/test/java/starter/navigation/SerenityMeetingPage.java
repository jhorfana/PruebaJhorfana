package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityMeetingPage extends PageObject {
    public static final By MENU_MEETING = By.xpath("/html/body/div[2]/aside[1]/section/div/ul/li[5]");
    public static final By MENU_MEETINGS = By.xpath("/html/body/div[2]/aside[1]/section/div/ul/li[5]/ul/li[1]/a");
    public static final By NEW_MEETING = By.xpath("/html/body/div[2]/div[1]/section/div/div[2]/div[2]/div/div/div[1]/div/span");
    public static final Target INPUT_NAME_MEETIN = Target.the("Ingresar el nombre de la reunión").located(By.xpath("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[1]/input"));
    public static final Target INPUT_NUMBER_MEETING = Target.the("Ingresa el número de la reunion").located(By.xpath("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[3]/input"));
    public static final Target INPUT_DATE_IN = Target.the("Ingresa la fecha de inicio").located(By.xpath("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/input"));
    public static final Target INPUT_DATE_OUT = Target.the("Ingresa la fecha fin").located(By.xpath("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[5]/input"));
    public static final Target SEARCH_LOCATION =  Target.the("Buscar la ubicación de la reunión").located(By.xpath("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[6]/div[1]/a/span[1]"));
    public static final Target LOCATION =  Target.the("Ingresar la ubicación de la reunión").located(By.xpath("/html/body/div[7]/div/input"));
    public static final Target SEARCH_UNIT = Target.the("Buscar la unidad de negocio creada").located(By.xpath("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[7]/div[1]/a/span[1]"));
    public static final By UNIT = By.id("s2id_autogen8_search");
    public static final By SAVE_NEW_MEETING = By.xpath("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[1]/div/div/div/div[1]/div/span");

}//*[@id="select2-result-label-49"]
