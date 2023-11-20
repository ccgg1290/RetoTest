package co.com.choucair.certificacion.serenityis.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingPage {
    public static final Target MENU_MEETING = Target.the("meeting section")
            .located(By.xpath("//a[@href='#nav_menu1_3_2']//span"));

    public static final Target MEETINGS = Target.the("meeting meetings")
            .located(By.xpath("//ul[@id='nav_menu1_3_2']//li[1]//a//span"));

    public static final Target MEETING_PAGE = Target.the("meeting page")
            .located(By.xpath("//div[@class='title-text']"));

    public static final Target MEETING_NAME = Target.the("put the meeting name")
            .located(By.name("MeetingName"));

    public static final Target MEETING_TYPE = Target.the("enable the list select meeting type")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId"));

    public static final Target MEETING_NUMBER = Target.the("meeting number")
            .located(By.name("MeetingNumber"));

    public static final Target MEETING_START_DATE = Target.the("start date meeting")
            .located(By.name("StartDate"));

    public static final Target SELECT_START_HOUR = Target.the("select start hour")
            .located(By.xpath("//div[@class='field StartDate col-sm-6']//select"));

    public static final Target MEETING_END_DATE = Target.the("end date meeting")
            .located(By.name("EndDate"));

    public static final Target SELECT_END_HOUR = Target.the("select start hour")
            .located(By.xpath("//div[@class='field EndDate col-sm-6']//select"));

    public static final Target LOCATION = Target.the("location")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId"));

    public static final Target UNIT = Target.the("location")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId"));

    public static final Target ORGANIZED_BY = Target.the("location")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId"));

    public static final Target REPORTER = Target.the("location")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId"));

    public static final Target GENERATE_MEET = Target.the("location")
            .located(By.xpath("//div[@style='top:0px']//div[2]//a"));
}
