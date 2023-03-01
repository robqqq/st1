package lab1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import ru.itmo.se.st.Task1;

public class Task1Test {
	@ParameterizedTest(name = "sin({0})")
	@DisplayName("Check PI dots")
    @ValueSource(doubles = {-Math.PI / 3, -Math.PI / 4, -Math.PI / 6, 0, Math.PI / 6, Math.PI / 4, Math.PI / 3})
	public void checkDots(double angle) {
		assertAll(() -> assertTrue(Math.abs(Task1.sec(angle) - Task1.f(angle)) <= 0.1));
	}
}
