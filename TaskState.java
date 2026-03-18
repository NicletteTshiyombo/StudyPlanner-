package studyplanner;

public interface TaskState {
    String name();

    void plan(StudyTask task);
    void schedule(StudyTask task);
    void start(StudyTask task);
    void pause(StudyTask task);
    void complete(StudyTask task);
    void archive(StudyTask task);
}
