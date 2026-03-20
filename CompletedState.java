package studyplanner.states;

import studyplanner.StudyTask;

public class CompletedState extends AbstractTaskState {

    @Override
    public String name() {
        return "COMPLETED";
    }

    @Override
    public void archive(StudyTask task) {
        task.setState(new ArchivedState());
    }
}
