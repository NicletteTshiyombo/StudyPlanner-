
package studyplanner;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        StudyPlanner planner = new StudyPlanner();

        StudyTask task = new StudyTask(
                "1",
                "Study Java",
                LocalDate.now().plusDays(1),
                60);

        planner.addTask(task);

        System.out.println(task.getCurrentStateName());
        task.plan();
        task.start();
        task.complete();
        task.archive();

        System.out.println(task.getCurrentStateName());
    }
}
