package studyplanner;

import java.time.LocalDate;
import studyplanner.states.NewState;

public class StudyTask {

    private final String taskId;
    private String title;
    private LocalDate dueDate;
    private int durationMinutes;

    private TaskState currentState;

    public StudyTask(String id, String title, LocalDate dueDate, int durationMinutes) {
        this.taskId = id;
        this.title = title;
        this.dueDate = dueDate;
        this.durationMinutes = durationMinutes;
        this.currentState = new NewState();
    }

    public void plan() { currentState.plan(this); }
    public void schedule() { currentState.schedule(this); }
    public void start() { currentState.start(this); }
    public void pause() { currentState.pause(this); }
    public void complete() { currentState.complete(this); }
    public void archive() { currentState.archive(this); }

    public void setState(TaskState state) {
        this.currentState = state;
    }

    public String getCurrentStateName() {
        return currentState.name();
    }

    public String getTaskId() {
        return taskId;
    }
}
