package co.com.choucair.certificacion.serenityis.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusinessUnitsPage {
    public static final Target MAIN_TITLE = Target.the("dashborad title")
            .located(By.xpath("//section[@class='content-header']//h1"));
    public static final Target MENU_ORGANIZATION = Target.the("organization section")
            .located(By.xpath("//a[@href='#nav_menu1_3_1']//span"));
    public static final Target BUSINESS_UNITS = Target.the("business section")
            .located(By.xpath("//ul[@id='nav_menu1_3_1']//li[1]//a//span"));

    public static final Target BUSINESS_PAGE = Target.the("business page")
            .located(By.xpath("//div[@class='title-text']"));

    public static final Target NEW_BUTTON = Target.the("new business unit")
            .located(By.xpath("//div[@class='button-outer']//span[@class='button-inner']//i[@class='fa fa-plus-circle text-green']"));

    public static final Target NAME_BUSINESS_UNIT = Target.the("input the name business unit")
            .located(By.id("Serenity_Pro_Organization_BusinessUnitDialog3_Name"));

    public static final Target PARENT_UNIT = Target.the("select the parent")
            .located(By.id("s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId"));

    public static final Target SELECT_PARENT_UNIT = Target.the("select in the list the parent")
            .locatedBy("//div[@id='select2-drop']//ul//li/div[contains(text(),'{0}')]");

    public static final Target SAVE_NEW_UNIT = Target.the("save the new unit")
            .located(By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']"));

}
