package studyplanner;

import java.util.*;

public class StudyPlanner {

    private final List<StudyTask> tasks = new ArrayList<>();

    public void addTask(StudyTask task) {
        Objects.requireNonNull(task);
        if (getTask(task.getTaskId()) != null)
            throw new IllegalArgumentException("Duplicate task id");
        tasks.add(task);
    }

    public boolean removeTask(String taskId) {
        return tasks.removeIf(t -> t.getTaskId().equals(taskId));
    }

    public StudyTask getTask(String id) {
        for (StudyTask t : tasks)
            if (t.getTaskId().equals(id))
                return t;
        return null;
    }

    public List<StudyTask> getAllTasks() {
        return Collections.unmodifiableList(tasks);
    }
}
