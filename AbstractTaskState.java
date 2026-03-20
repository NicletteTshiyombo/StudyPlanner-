package studyplanner.states;

import studyplanner.StudyTask;
import studyplanner.TaskState;

public abstract class AbstractTaskState implements TaskState {

    protected void invalid() {
        throw new IllegalStateException("Invalid state transition");
    }

    @Override
    public void plan(StudyTask task) { invalid(); }

    @Override
    public void schedule(StudyTask task) { invalid(); }

    @Override
    public void start(StudyTask task) { invalid(); }

    @Override
    public void pause(StudyTask task) { invalid(); }

    @Override
    public void complete(StudyTask task) { invalid(); }

    @Override
    public void archive(StudyTask task) { invalid(); }
}
