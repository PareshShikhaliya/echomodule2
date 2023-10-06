package org.example.class3;

public class TimeoutExample6 {

    public static int performTimeConsumingTask() {
        try {
            // Simulate a task that takes less than 2 seconds to complete
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return 42;
    }

    public static int performVeryLongTask() {
        try {
            // Simulate a task that takes longer than 2 seconds to complete
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return 42;
    }
}

