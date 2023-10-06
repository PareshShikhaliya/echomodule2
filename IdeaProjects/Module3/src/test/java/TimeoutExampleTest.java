import org.example.class3.TimeoutExample6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

public class TimeoutExampleTest {

    @Test
    public void testTaskExecutionWithinTimeout() {
        int result = assertTimeout(Duration.ofSeconds(2), () -> {
            return TimeoutExample6.performTimeConsumingTask();
        });

        assertEquals(42, result);
    }

    @Test
    public void testTaskExecutionExceedsTimeout() {
        assertTimeout(Duration.ofSeconds(4), () -> {
            TimeoutExample6.performVeryLongTask();
        });
    }
}

