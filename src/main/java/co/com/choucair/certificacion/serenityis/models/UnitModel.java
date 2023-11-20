package co.com.choucair.certificacion.serenityis.models;

public class UnitModel {
    private final String user;
    private final String pass;
    private final String unitName;
    private final String unitOption;
    private final String meetingName;
    private final String meetingType;
    private final String meetingNumber;
    private final String meetingDate;
    private final String initHour;
    private final String endHour;
    private final String location;
    private final String person;


    public UnitModel(String user, String pass, String unitName, String unitOption, String meetingName, String meetingType, String meetingNumber, String meetingDate, String initHour, String endHour, String location, String person) {
        this.user = user;
        this.pass = pass;
        this.unitName = unitName;
        this.unitOption = unitOption;
        this.meetingName = meetingName;
        this.meetingType = meetingType;
        this.meetingNumber = meetingNumber;
        this.meetingDate = meetingDate;
        this.initHour = initHour;
        this.endHour = endHour;
        this.location = location;
        this.person = person;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getUnitOption() {
        return unitOption;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public String getMeetingNumber() {
        return meetingNumber;
    }

    public String getMeetingDate() {
        return meetingDate;
    }

    public String getInitHour() {
        return initHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public String getLocation() {
        return location;
    }

    public String getPerson() {
        return person;
    }
}
