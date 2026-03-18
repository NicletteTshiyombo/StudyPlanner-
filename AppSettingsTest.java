package studyplanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppSettingsTest {

    @Test
    void singletonTest() {
        AppSettings a = AppSettings.getInstance();
        AppSettings b = AppSettings.getInstance();

        assertSame(a,b);
    }
}
