package studyplanner;

public final class AppSettings {
    private static AppSettings instance;

    private int defaultStudyMinutes = 60;
    private boolean notificationsEnabled = true;

    private AppSettings() {}

    public static synchronized AppSettings getInstance() {
        if (instance == null) instance = new AppSettings();
        return instance;
    } // review the synchronized.

    public int getDefaultStudyMinutes() {
        return defaultStudyMinutes;
    }

    public void setDefaultStudyMinutes(int minutes) {
        if (minutes <= 0) throw new IllegalArgumentException("Minutes must be > 0");
        this.defaultStudyMinutes = minutes;
    }

    public boolean isNotificationsEnabled() {
        return notificationsEnabled;
    }

    public void setNotificationsEnabled(boolean enabled) {
        this.notificationsEnabled = enabled;
    }
}
//ldata entry
//assignment3 data entry
//input needed "please you ne task", " view archived", 
// add paused state
// simple visual using javaFX (GUI)
//Asignment 3 add read me file
