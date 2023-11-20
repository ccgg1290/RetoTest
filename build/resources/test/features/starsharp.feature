Feature: new meeting

  @meet
  Scenario Outline: schedule a meet
    Given I want to schedule a new meet
    When login to Startsharp go to schedule it
      |user|pass|unitName|unitOption|meetingName|meetingType|meetingNumber|meetingDate|initHour|endHour|location|person|
      |<user>|<pass>|<unitName>|<unitOption>|<meetingName>|<meetingType>|<meetingNumber>|<meetingDate>|<initHour>|<endHour>|<location>|<person>|
    Then the virtual meet is correctly created
      |meetingName|
      |<meetingName>|

    Examples:
      |user|pass|unitName|unitOption|meetingName|meetingType|meetingNumber|meetingDate|initHour|endHour|location|person||
      |admin|serenity|Master|Acme Corp.|MyMeet|General|12022|10/12/2022|14:00|15:00|On Site|Aaron Taylor||
      |admin|serenity|Master|Acme Corp.|MyMeet|General|12022|10/12/2022|14:00|15:00|On Site|Aaron Taylor1||