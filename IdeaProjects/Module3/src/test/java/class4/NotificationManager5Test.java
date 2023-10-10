package class4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import org.example.class4.usermodule.NotificationException;
import org.example.class4.usermodule.NotificationManager;
import org.example.class4.usermodule.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class NotificationManager5Test {

    @Test
    public void testSendWelcomeMessage() {
        // Create a mock of the NotificationService
        NotificationService notificationService = mock(NotificationService.class);

        // Create a NotificationManager and inject the mock NotificationService
        NotificationManager notificationManager = new NotificationManager(notificationService);

        // Set up custom behavior for sendNotification using doAnswer
        doAnswer(new Answer<Void>() {
            @Override
            public Void answer(InvocationOnMock invocation) throws Throwable {
                String message = invocation.getArgument(0);
                String recipient = invocation.getArgument(1);
                System.out.println("Logging: Message sending to " + recipient + ": " + message);

                // Simulate sending the notification
                if ("user123".equals(recipient)) {
                    System.out.println("Logging: Message sending FAILED to " + recipient + ": " + message);
                    throw new NotificationException("Failed to send notification to user123");
                }
                return null;
            }
        }).when(notificationService).sendNotification(any(String.class), any(String.class));

        // Perform the test: Send welcome messages
        boolean result1 = notificationManager.sendWelcomeMessage("John");
        boolean result2 = notificationManager.sendWelcomeMessage("user123");

        // Verify that sendNotification was called with the specified parameters
        verify(notificationService).sendNotification("Welcome, John!", "John");
        verify(notificationService).sendNotification("Welcome, user123!", "user123");

        // Assert the results
        assertTrue(result1);
        assertFalse(result2);
    }
}


