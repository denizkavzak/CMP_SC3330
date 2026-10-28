package edu.mu.appconfig;

public class AppConfig {
	
    private static AppConfig instance;

    private AppConfig() {
        // private constructor prevents:
        // new AppConfig();
    }

    public static AppConfig getInstance() {

        if (instance == null) {
            instance = new AppConfig();
        }

        return instance;
    }

//    private static final AppConfig INSTANCE =
//            new AppConfig();
//
//    private AppConfig() {
//    }
//
//    public static AppConfig getInstance() {
//        return INSTANCE;
//    }



}
