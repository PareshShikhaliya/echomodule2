package class4;

import org.example.class4.usermodule.User;
import org.example.class4.usermodule.UserRepository;
import org.example.class4.usermodule.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserService1Test {

    @Test
    public void testGetUserById() {
        // Create a mock UserRepository
        UserRepository userRepository = Mockito.mock(UserRepository.class);

        // Define the behavior of the mock UserRepository
        User expectedUser = new User(1, "JohnDoe");
        when(userRepository.findById(1)).thenReturn(expectedUser);

        // Create an instance of UserService with the mock UserRepository
        UserService userService = new UserService(userRepository);

        // Perform the getUserById operation
        User resultUser = userService.getUserById(1);

        // Verify that the result is as expected
        assertEquals(expectedUser, resultUser);
    }

    @Test
    public void testAddUser() {
        // Create a mock UserRepository
        UserRepository userRepository = Mockito.mock(UserRepository.class);

        // Create an instance of UserService with the mock UserRepository
        UserService userService = new UserService(userRepository);

        // Create a sample user
        User newUser = new User(2, "JaneSmith");

        // Call the addUser method of UserService
        userService.addUser(newUser);

        // Verify that the save method of the mock UserRepository was called with the newUser object
        verify(userRepository).save(newUser);
    }

    @Test
    public void testUpdateUser() {
        // Create a mock UserRepository
        UserRepository userRepository = Mockito.mock(UserRepository.class);

        // Create an instance of UserService with the mock UserRepository
        UserService userService = new UserService(userRepository);

        // Create a sample user
        User updatedUser = new User(3, "UpdatedUser");

        // Call the updateUser method of UserService
        userService.updateUser(updatedUser);

        // Verify that the update method of the mock UserRepository was called with the updatedUser object
        verify(userRepository).update(updatedUser);
    }

    @Test
    public void testDeleteUser() {
        // Create a mock UserRepository
        UserRepository userRepository = Mockito.mock(UserRepository.class);

        // Create an instance of UserService with the mock UserRepository
        UserService userService = new UserService(userRepository);

        // Call the deleteUser method of UserService
        userService.deleteUser(4);

        // Verify that the delete method of the mock UserRepository was called with the ID 4
        verify(userRepository).delete(4);
    }

    @Test
    public void testGetUserByIdNotFound() {
        // Create a mock UserRepository
        UserRepository userRepository = Mockito.mock(UserRepository.class);

        // Define the behavior of the mock UserRepository
        when(userRepository.findById(5)).thenReturn(null);

        // Create an instance of UserService with the mock UserRepository
        UserService userService = new UserService(userRepository);

        // Perform the getUserById operation for a non-existing user
        User resultUser = userService.getUserById(5);

        // Verify that the result is null
        assertNull(resultUser);
    }

    @Test
    public void testAddUserExceptionHandling() {
        // Create a mock UserRepository that throws an exception when saving a user
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        doThrow(new RuntimeException("Error saving user")).when(userRepository).save(any(User.class));

        // Create an instance of UserService with the mock UserRepository
        UserService userService = new UserService(userRepository);

        // Attempt to add a user
        User newUser = new User(6, "NewUser");
        assertThrows(RuntimeException.class, () -> userService.addUser(newUser));
    }
}
