import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// MainTest.java

public class MainTest {
    @Test
    void testMainOutput() {
        // Arrange
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        Main.main(new String[]{});

        // Assert
        String expected = "Hello world" + System.lineSeparator();
        for (int i = 0; i < 10; i++) {
            expected += i + System.lineSeparator();
        }
        assertEquals(expected, outContent.toString());

        // Cleanup
        System.setOut(originalOut);
    }
}