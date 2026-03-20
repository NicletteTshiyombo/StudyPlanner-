package studyplanner.states;

import studyplanner.StudyTask;

public class InProgressState extends AbstractTaskState {

    @Override
    public String name() {
        return "IN_PROGRESS";
    }

    @Override
    public void pause(StudyTask task) {
        task.setState(new PausedState());
    }

    @Override
    public void complete(StudyTask task) {
        task.setState(new CompletedState());
    }
}
