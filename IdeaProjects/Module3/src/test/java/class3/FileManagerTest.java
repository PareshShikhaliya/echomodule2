package class3;

import org.example.class3.FileManager8;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FileManagerTest {

    private static final String TEST_DIRECTORY = "C:\\Users\\pares\\IdeaProjects\\Module3\\src\\main\\java\\org\\example\\class3\\testdir";
    private static final String TEST_FILE = "test_file.txt";

    private FileManager8 fileManager;

    @BeforeEach
    public void setUp() {
        FileManager8.createDirectory(TEST_DIRECTORY);
        fileManager = new FileManager8(TEST_DIRECTORY);

    }

    // After each test, delete the temporary directory and cleanup.
    @AfterEach
    public void tearDown() {
        // Simulate deleting the temporary directory and FileManager8 cleanup
        FileManager8.deleteDirectory(TEST_DIRECTORY);
        fileManager = null;
    }

    @Test
    @Order(1)
    public void testCreateFile() {
        assertTrue(fileManager.createFile(TEST_FILE));
        assertTrue(fileManager.fileExists(TEST_FILE));
    }

    @Test
    @Order(2)
    public void testWriteToFile() {
        fileManager.createFile(TEST_FILE);
        assertTrue(fileManager.writeToFile(TEST_FILE, "Hello, World!"));
        assertEquals("Hello, World!", fileManager.readFromFile(TEST_FILE));
    }

    @Test
    @Order(3)
    public void testDeleteFile() {
        fileManager.createFile(TEST_FILE);
        assertTrue(fileManager.deleteFile(TEST_FILE));
        assertFalse(fileManager.fileExists(TEST_FILE));
    }
}
