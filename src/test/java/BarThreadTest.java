import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarThreadTest {

    @Test
    public void runTest(){
        TaskFooBar tfb = new TaskFooBar(1);
        BarThread th = new BarThread(tfb);
        th.run();
    }

}