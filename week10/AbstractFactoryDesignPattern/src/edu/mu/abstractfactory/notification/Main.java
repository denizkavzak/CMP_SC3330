package edu.mu.abstractfactory.notification;

/**
 * Possible output:
 * 
 * Campus Email -> [MIZZOU] Classes are canceled tomorrow.
 * Corporate Email -> [CORPORATE] Meeting starts at 2 PM.
 * 
 */

public class Main {

    public static void main(String[] args) {

        CommunicationFactory campusFactory =
                new CampusCommunicationFactory();

        CommunicationService campusService =
                new CommunicationService(campusFactory);

        campusService.send(
                "Classes are canceled tomorrow.");

        System.out.println();

        CommunicationFactory corporateFactory =
                new CorporateCommunicationFactory();

        CommunicationService corporateService =
                new CommunicationService(corporateFactory);

        corporateService.send(
                "Meeting starts at 2 PM.");
    }

}
