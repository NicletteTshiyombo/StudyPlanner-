package studyplanner.states;

import studyplanner.StudyTask;

public class PlannedState extends AbstractTaskState {

    @Override
    public String name() {
        return "PLANNED";
    }

    @Override
    public void schedule(StudyTask task) {
        task.setState(new ScheduledState());
    }

    @Override
    public void start(StudyTask task) {
        task.setState(new InProgressState());
    }
}
