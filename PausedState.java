package studyplanner.states;

import studyplanner.StudyTask;

public class PausedState extends AbstractTaskState {

    @Override
    public String name() {
        return "PAUSED";
    }

    @Override
    public void start(StudyTask task) {
        task.setState(new InProgressState());
    }
}
