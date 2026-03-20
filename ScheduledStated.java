package studyplanner.states;

import studyplanner.StudyTask;

public class ScheduledState extends AbstractTaskState {

    @Override
    public String name() {
        return "SCHEDULED";
    }

    @Override
    public void start(StudyTask task) {
        task.setState(new InProgressState());
    }
}
