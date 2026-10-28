package edu.mu.appconfig;

public class AppConfigStudentSystem {

    private static final AppConfigStudentSystem INSTANCE =
            new AppConfigStudentSystem();

    private String applicationName;
    private int maxUsers;

    private AppConfigStudentSystem() {
        applicationName = "Student System";
        maxUsers = 100;
    }

    public static AppConfigStudentSystem getInstance() {
        return INSTANCE;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public int getMaxUsers() {
        return maxUsers;
    }
}