
package studyplanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class StudyTaskStateTest {

    @Test
    void stateTransitions() {

        StudyTask task = new StudyTask("1","Study",LocalDate.now(),60);

        assertEquals("NEW", task.getCurrentStateName());

        task.plan();
        task.start();
        task.complete();
        task.archive();

        assertEquals("ARCHIVED", task.getCurrentStateName());
    }
}
