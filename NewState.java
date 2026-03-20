package studyplanner.states;

import studyplanner.StudyTask;

public class NewState extends AbstractTaskState {

    @Override
    public String name() {
        return "NEW";
    }

    @Override
    public void plan(StudyTask task) {
        task.setState(new PlannedState());
    }
}
