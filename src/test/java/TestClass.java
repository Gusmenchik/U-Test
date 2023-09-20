import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    public void testAdd_validArguments_success() {
        // given
        int a = 5;
        int b = 7;

        // when
        int result = Programme.add(a, b);

        // then
        Assertions.assertEquals(12, result);
    }
}