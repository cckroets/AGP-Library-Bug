import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import ui.MainActivity;

@RunWith(AndroidJUnit4.class)
public class EmulatorTest {

    @Test
    public void test() {
        ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class)
                .moveToState(Lifecycle.State.RESUMED);
        scenario.close();
    }
}
