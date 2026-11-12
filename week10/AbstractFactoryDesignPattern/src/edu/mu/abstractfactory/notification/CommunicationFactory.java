package edu.mu.abstractfactory.notification;

// Abstract Factory
public interface CommunicationFactory {

    Notification createNotification();

    MessageFormatter createFormatter();

}

/**
 * What makes this Abstract Factory?
 * 
 * Not simply:
 * Factory -> one Notification
 * 
 * BUT
 * 
 * CampusCommunicationFactory
 *   -> CampusEmailNotification
 *   -> CampusMessageFormatter
 * vs.
 * CorporateCommunicationFactory
 *   -> CorporateEmailNotification
 *   -> CorporateMessageFormatter
 */

