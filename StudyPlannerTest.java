package studyplanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class StudyPlannerTest {

    @Test
    void testAddAndGetTask() {
        StudyPlanner planner = new StudyPlanner();
        StudyTask t = new StudyTask("1","Test",LocalDate.now(),60);

        planner.addTask(t);

        assertNotNull(planner.getTask("1"));
    }

    @Test
    void testRemoveTask() {
        StudyPlanner planner = new StudyPlanner();
        StudyTask t = new StudyTask("1","Test",LocalDate.now(),60);

        planner.addTask(t);
        planner.removeTask("1");

        assertNull(planner.getTask("1"));
    }
}
