
import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void addition() {
        assertEquals(3, SkillDemo.add(1, 2));
    }
}

// test should fail initially: 1+2 = 3, not 2

// test should pass: 1+2 = 3 and 3=3