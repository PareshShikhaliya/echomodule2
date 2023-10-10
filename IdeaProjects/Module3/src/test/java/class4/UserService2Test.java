package class4;

import org.example.class4.usermodule.UserRepository;
import org.example.class4.usermodule.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.example.class4.usermodule.User;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserService2Test {

    @Mock
    private UserRepository userRepository;

    private UserService userService;

    @BeforeEach
    public void setUp()
    {
        // Initialize the annotated mocks
        MockitoAnnotations.initMocks(this);

        // Create an instance of UserService with the mock UserRepository
        userService = new UserService(userRepository);
    }

    @Test
    public void testGetUserById() {
        // Define the behavior of the mock UserRepository
        User expectedUser = new User(1, "JohnDoe");
        when(userRepository.findById(1)).thenReturn(expectedUser);

        // Perform the getUserById operation
        User resultUser = userService.getUserById(1);

        // Verify that the result is as expected
        assertEquals(expectedUser, resultUser);
    }

    @Test
    public void testAddUser() {
        // Create a sample user
        User newUser = new User(2, "JaneSmith");

        // Call the addUser method of UserService
        userService.addUser(newUser);

        // Verify that the save method of the mock UserRepository was called with the newUser object
        verify(userRepository).save(newUser);
    }

    @Test
    public void testUpdateUser() {
        // Create a sample user
        User updatedUser = new User(3, "UpdatedUser");

        // Call the updateUser method of UserService
        userService.updateUser(updatedUser);

        // Verify that the update method of the mock UserRepository was called with the updatedUser object
        verify(userRepository).update(updatedUser);
    }

    @Test
    public void testDeleteUser() {
        // Call the deleteUser method of UserService
        userService.deleteUser(4);

        // Verify that the delete method of the mock UserRepository was called with the ID 4
        verify(userRepository).delete(4);
    }

    @Test
    public void testGetUserByIdNotFound() {
        // Define the behavior of the mock UserRepository
        when(userRepository.findById(5)).thenReturn(null);

        // Perform the getUserById operation for a non-existing user
        User resultUser = userService.getUserById(5);

        // Verify that the result is null
        assertNull(resultUser);
    }

    @Test
    public void testAddUserExceptionHandling() {
        // Configure the mock UserRepository to throw an exception when saving a user
        doThrow(new RuntimeException("Error saving user")).when(userRepository).save(any(User.class));

        // Attempt to add a user
        User newUser = new User(6, "NewUser");
        assertThrows(RuntimeException.class, () -> userService.addUser(newUser));
    }
}
