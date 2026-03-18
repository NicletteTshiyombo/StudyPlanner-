package studyplanner;

public final class AppSettings {
    private static AppSettings instance;

    private int defaultStudyMinutes = 60;
    private boolean notificationsEnabled = true;

    private AppSettings() {}

    public static synchronized AppSettings getInstance() {
        if (instance == null) instance = new AppSettings();
        return instance;
    }

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
