package org.example.class4.usermodule;

public class NotificationManager {
    private NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public boolean sendWelcomeMessage(String userName) {
        String message = "Welcome, " + userName + "!";
        try {
            notificationService.sendNotification(message, userName);
            return true;
        } catch (NotificationException e) {
            return false;
        }
    }
}
